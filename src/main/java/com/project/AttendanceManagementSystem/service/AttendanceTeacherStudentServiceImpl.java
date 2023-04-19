package com.project.AttendanceManagementSystem.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.AttendanceManagementSystem.dao.AttendanceRepository;
import com.project.AttendanceManagementSystem.dao.BatchRepository;
import com.project.AttendanceManagementSystem.dao.StudentRepository;
import com.project.AttendanceManagementSystem.dao.TeacherRepository;
import com.project.AttendanceManagementSystem.entity.AttendanceEntity;
import com.project.AttendanceManagementSystem.entity.BatchEntity;
import com.project.AttendanceManagementSystem.entity.StudentEntity;
import com.project.AttendanceManagementSystem.entity.TeacherEntity;
import com.project.AttendanceManagementSystem.util.Validator;

@Service
public class AttendanceTeacherStudentServiceImpl implements AttendanceTeacherStudentService {

	@Autowired
	private TeacherRepository teacherDao;

	@Autowired
	private BatchRepository batchDao;

	@Autowired
	private StudentRepository studentDao;

	@Autowired
	private AttendanceRepository attendanceDao;

	@Autowired
	private Validator validator;

	@Override
	public String storeAttendance(String teacherID, String studentId, String batchId) {
		String output = "";
		// validate
		boolean valid = false;
		if (validator.validateTeacher(teacherID)) {
			if (validator.validateBatch(batchId)) {
				if (validator.validateStudent(studentId)) {
					valid = true;
				} else {
					output = "Student ID not correct";
				}
			} else {
				output = "Batch ID not correct";
			}
		} else {
			output = "teacher ID not correct";
		}
		if (valid) {

			Optional<TeacherEntity> ote = teacherDao.findById(teacherID);
			TeacherEntity te = ote.orElse(new TeacherEntity());

			Optional<StudentEntity> ose = studentDao.findById(studentId);
			StudentEntity se = ose.orElse(new StudentEntity());

			Optional<BatchEntity> obe = batchDao.findById(batchId);
			BatchEntity be = obe.orElse(new BatchEntity());

			AttendanceEntity attendanceEntity = new AttendanceEntity(new Date().toString(), te, be, se, se.getSfname());
			attendanceDao.save(attendanceEntity);
			
			output="Attendance marked";

		}
		return output;
	}

}
