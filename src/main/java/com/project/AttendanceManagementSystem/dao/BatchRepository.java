package com.project.AttendanceManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.AttendanceManagementSystem.entity.BatchEntity;

public interface BatchRepository extends JpaRepository<BatchEntity, String>{

}
