package com.project.AttendanceManagementSystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.project.AttendanceManagementSystem.model.Attendance;
import com.project.AttendanceManagementSystem.model.Student;
import com.project.AttendanceManagementSystem.model.Teacher;

@Entity
@Table(name = "batch")
public class BatchEntity {
	@Id
	private String batch_id;
	private String subject;
	private String days;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "teacher_id")
//	private TeacherEntity teacher;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AttendanceEntity> attendances;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<StudentEntity> students;

	public String getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

//	public TeacherEntity getTeacher() {
//		return teacher;
//	}
//
//	public void setTeacher(TeacherEntity teacher) {
//		this.teacher = teacher;
//	}

	public Set<AttendanceEntity> getAttendances() {
		return attendances;
	}

	public void setAttendances(Set<AttendanceEntity> attendances) {
		this.attendances = attendances;
	}

	public Set<StudentEntity> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentEntity> students) {
		this.students = students;
	}

	public BatchEntity(String batch_id, String subject, String days, TeacherEntity teacher) {
		super();
		this.batch_id = batch_id;
		this.subject = subject;
		this.days = days;
//		this.teacher = teacher;
	}

	public BatchEntity() {
	}

	// constructors, getters and setters

}
