package com.project.AttendanceManagementSystem.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.AttendanceManagementSystem.dao.AttendanceRepository;
import com.project.AttendanceManagementSystem.dao.BatchRepository;
import com.project.AttendanceManagementSystem.dao.StudentRepository;
import com.project.AttendanceManagementSystem.dao.TeacherRepository;
import com.project.AttendanceManagementSystem.entity.BatchEntity;
import com.project.AttendanceManagementSystem.entity.StudentEntity;
import com.project.AttendanceManagementSystem.entity.TeacherEntity;


@Component
public class ValidatorImpl implements Validator{
	
	@Autowired
	private TeacherRepository teacherDao;
	
	@Autowired
	private BatchRepository batchDao;
	
	@Autowired
	private StudentRepository studentDao;
	
	@Autowired
	private AttendanceRepository attendanceDao;

	@Override
	public boolean validateTeacher(String teacherId) {
		Optional<TeacherEntity> ote=teacherDao.findById(teacherId);
		TeacherEntity te=ote.orElse(new TeacherEntity());
		if(te instanceof TeacherEntity) {
			if(te.getTeacher_id() !=null) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean validateStudent(String studentId) {
		Optional<StudentEntity> ose=studentDao.findById(studentId);
		StudentEntity se=ose.orElse(new StudentEntity());
		if(se instanceof StudentEntity) {
			if(se.getStudent_id() !=null) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean validateBatch(String batchId) {
		Optional<BatchEntity> obe=batchDao.findById(batchId);
		BatchEntity be=obe.orElse(new BatchEntity());
		if(be instanceof BatchEntity) {
			if(be.getBatch_id() !=null) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	

}
