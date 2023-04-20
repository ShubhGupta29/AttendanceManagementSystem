package com.project.AttendanceManagementSystem.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.AttendanceManagementSystem.dao.AttendanceRepository;
import com.project.AttendanceManagementSystem.dao.BatchRepository;
import com.project.AttendanceManagementSystem.dao.StudentRepository;
import com.project.AttendanceManagementSystem.dao.TeacherRepository;
import com.project.AttendanceManagementSystem.entity.AttendanceEntity;
import com.project.AttendanceManagementSystem.service.AttendanceTeacherStudentService;

@CrossOrigin
@RestController
@RequestMapping("/markAttendance")
public class AttendanceController {

	@Autowired
	private TeacherRepository teacherDao;

	@Autowired
	private BatchRepository batchDao;

	@Autowired
	private StudentRepository studentDao;

	@Autowired
	private AttendanceRepository attendanceDao;

	@Autowired
	private AttendanceTeacherStudentService attendanceService;

	@Autowired
	private Environment environment;

	@PostMapping("/{batchId}/{teaherId}/{studentId}")
	//http://localhost:8000/attendance/markAttendance/b1/001/001
	public ResponseEntity<String> addProductToCart(@PathVariable("batchId") String batchId,
			@PathVariable("studentId") String studentId, @PathVariable("teaherId") String teaherId) throws Exception {
		try {

			String message = attendanceService.storeAttendance(teaherId, studentId, batchId);

			return new ResponseEntity<String>(message, HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}

	}
	
	@GetMapping("view")
	//http://localhost:8000/attendance/markAttendance/view
	public ResponseEntity<List<AttendanceEntity>> viewAttendance() throws Exception {
		try {

			List<AttendanceEntity> attendanceList = attendanceDao.findAll();
			
			System.out.println("Attendance list count is "+attendanceDao.count());
			return new ResponseEntity<List<AttendanceEntity>>(attendanceList, HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}

	}
}
