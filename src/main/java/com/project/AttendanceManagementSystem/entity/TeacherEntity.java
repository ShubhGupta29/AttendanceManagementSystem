package com.project.AttendanceManagementSystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.PersistenceConstructor;

import com.project.AttendanceManagementSystem.model.Attendance;
import com.project.AttendanceManagementSystem.model.Batch;

@Entity
@Table(name = "teacher")
public class TeacherEntity {
	
	public TeacherEntity() {}
	
	
	public TeacherEntity(String teacher_id, String tfname, String tlname, String userid, String password,
			String contact, String salary, String opened) {
		super();
		this.teacher_id = teacher_id;
		this.tfname = tfname;
		this.tlname = tlname;
		this.userid = userid;
		this.password = password;
		this.contact = contact;
		this.salary = salary;
		this.opened = opened;
	}

	@Id
	private String teacher_id;
	private String tfname;
	private String tlname;
	private String userid;
	private String password;
	private String contact;
	private String salary;
	private String opened;
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "batch_id" )
	private Set<BatchEntity> batches;
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AttendanceEntity> attendances;

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTfname() {
		return tfname;
	}

	public void setTfname(String tfname) {
		this.tfname = tfname;
	}

	public String getTlname() {
		return tlname;
	}

	public void setTlname(String tlname) {
		this.tlname = tlname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getOpened() {
		return opened;
	}

	public void setOpened(String opened) {
		this.opened = opened;
	}

	public Set<BatchEntity> getBatches() {
		return batches;
	}

	public void setBatches(Set<BatchEntity> batches) {
		this.batches = batches;
	}

	public Set<AttendanceEntity> getAttendances() {
		return attendances;
	}

	public void setAttendances(Set<AttendanceEntity> attendances) {
		this.attendances = attendances;
	}

}
