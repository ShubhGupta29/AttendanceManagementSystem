package com.project.AttendanceManagementSystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AttendanceManagementSystem.entity.TeacherEntity;
import com.project.AttendanceManagementSystem.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, String> {
}
