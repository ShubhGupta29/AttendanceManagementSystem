package com.project.AttendanceManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.project.AttendanceManagementSystem.model.AttendanceId;
import com.project.AttendanceManagementSystem.model.Batch;
import com.project.AttendanceManagementSystem.model.Student;
import com.project.AttendanceManagementSystem.model.Teacher;

@Entity
@IdClass(AttendanceId.class)
@Table(name = "Attendance")
public class AttendanceEntity {
	@Id
	private String date;
	@Id
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private TeacherEntity teacher;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "batch_id")
	private BatchEntity batch;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id")
	private StudentEntity student;
	private String student_name;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TeacherEntity getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}

	public BatchEntity getBatch() {
		return batch;
	}

	public void setBatch(BatchEntity batch) {
		this.batch = batch;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public AttendanceEntity(String date, TeacherEntity teacher, BatchEntity batch, StudentEntity student,
			String student_name) {
		super();
		this.date = date;
		this.teacher = teacher;
		this.batch = batch;
		this.student = student;
		this.student_name = student_name;
	}

	// constructors, getters and setters
	
	

}
