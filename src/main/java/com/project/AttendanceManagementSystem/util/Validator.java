package com.project.AttendanceManagementSystem.util;

public interface Validator {

	public boolean validateTeacher(String teacherId);
	public boolean validateStudent(String studentId);
	public boolean validateBatch(String batchId);
}
