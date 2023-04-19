package com.project.AttendanceManagementSystem.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.AttendanceManagementSystem.dao.TeacherRepository;
import com.project.AttendanceManagementSystem.entity.TeacherEntity;
import com.project.AttendanceManagementSystem.model.Teacher;
import com.project.AttendanceManagementSystem.service.AttendanceTeacherStudentService;

@CrossOrigin
@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	 TeacherRepository teacherDao;
	
	@Autowired
	private AttendanceTeacherStudentService attendanceService;

	@Autowired
	private Environment environment;

//	@GetMapping(value = "{id}")
//	public ResponseEntity<Optional<teacher>> retrieveTeacherInfo(@PathVariable("id") String id) {
//		try {
//			System.out.println("yaha aa gya" + id+ teacherService.findTeacherById(id));
//			return new ResponseEntity<Optional<teacher>>(teacherDao.findById(id),HttpStatus.OK);
//		} catch (Exception e) {
//			System.out.println("exception "+e.getStackTrace());
//			throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, environment.getProperty(e.getMessage()));
//		}
//
//	}
	
	@GetMapping(value = "all")
	public ResponseEntity<List<TeacherEntity>> allTeachers() {
		try {
			//System.out.println(attendanceService.storeAttendance("001", "001", "101"));
			return new ResponseEntity<List<TeacherEntity>>(teacherDao.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("exception "+e.getStackTrace());
			throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, environment.getProperty(e.getMessage()));
		}

	}

}
