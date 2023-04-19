package com.project.AttendanceManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.AttendanceManagementSystem.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {

}
