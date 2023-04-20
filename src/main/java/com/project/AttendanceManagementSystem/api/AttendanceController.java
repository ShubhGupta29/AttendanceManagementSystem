package com.project.AttendanceManagementSystem.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.project.AttendanceManagementSystem.service.AttendanceTeacherStudentService;

@RestController
@RequestMapping(name = "/markAttendance")
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
	
	@PostMapping(value = "/{batchId}/{teaherId}/{studentId}")
	public ResponseEntity<String> addProductToCart(@PathVariable("batchId") String batchId, @PathVariable("studentId") String studentId, @PathVariable("teaherId") String teaherId) throws Exception {
		try
		{
			
			
			String message = attendanceService.storeAttendance(teaherId, studentId, batchId);
			
			return new ResponseEntity<String>(message, HttpStatus.OK);
			
		}
		catch (Exception e) {
			
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}

}
}
