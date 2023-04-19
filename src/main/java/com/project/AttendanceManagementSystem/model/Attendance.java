package com.project.AttendanceManagementSystem.model;

import java.util.Objects;

public class Attendance {

    private String date;
    private String teacher_id;
    private String batch_id;
    private String student_id;
    private String student_name;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attendance)) return false;
        Attendance that = (Attendance) o;
        return getDate().equals(that.getDate()) && getTeacher_id().equals(that.getTeacher_id()) && getBatch_id().equals(that.getBatch_id()) && getStudent_id().equals(that.getStudent_id()) && getStudent_name().equals(that.getStudent_name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getTeacher_id(), getBatch_id(), getStudent_id(), getStudent_name());
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "date='" + date + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", batch_id='" + batch_id + '\'' +
                ", student_id='" + student_id + '\'' +
                ", student_name='" + student_name + '\'' +
                '}';
    }


}
