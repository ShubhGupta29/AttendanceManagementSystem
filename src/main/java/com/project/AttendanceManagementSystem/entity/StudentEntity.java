package com.project.AttendanceManagementSystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.project.AttendanceManagementSystem.model.Attendance;
import com.project.AttendanceManagementSystem.model.Batch;

@Entity
@Table(name = "student")
public class StudentEntity {
	@Id
	private String student_id;
	private String sfname;
	private String slname;
	private String userid;
	private String pass;
	private String gender;
	private String contact;
	private String opened;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AttendanceEntity> attendances;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "batchid")
	private BatchEntity batch;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getOpened() {
		return opened;
	}

	public void setOpened(String opened) {
		this.opened = opened;
	}

	public Set<AttendanceEntity> getAttendances() {
		return attendances;
	}

	public void setAttendances(Set<AttendanceEntity> attendances) {
		this.attendances = attendances;
	}

	public BatchEntity getBatch() {
		return batch;
	}

	public void setBatch(BatchEntity batch) {
		this.batch = batch;
	}

	public StudentEntity(String student_id, String sfname, String slname, String userid, String pass, String gender,
			String contact, String opened) {
		super();
		this.student_id = student_id;
		this.sfname = sfname;
		this.slname = slname;
		this.userid = userid;
		this.pass = pass;
		this.gender = gender;
		this.contact = contact;
		this.opened = opened;
	}

	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

}
