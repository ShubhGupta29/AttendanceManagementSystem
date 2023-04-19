package com.project.AttendanceManagementSystem.model;

public class Student {

    private String student_id;
    private String sfname;
    private String slname;
    private String userid;
    private String pass;
    private String gender;
    private String contact;
    private String batch_id;
    private String opened;

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

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (!getStudent_id().equals(student.getStudent_id())) return false;
        if (!getSfname().equals(student.getSfname())) return false;
        if (!getSlname().equals(student.getSlname())) return false;
        if (!getUserid().equals(student.getUserid())) return false;
        if (!getPass().equals(student.getPass())) return false;
        if (!getGender().equals(student.getGender())) return false;
        if (!getContact().equals(student.getContact())) return false;
        if (!getBatch_id().equals(student.getBatch_id())) return false;
        return getOpened().equals(student.getOpened());
    }

    @Override
    public int hashCode() {
        int result = getStudent_id().hashCode();
        result = 31 * result + getSfname().hashCode();
        result = 31 * result + getSlname().hashCode();
        result = 31 * result + getUserid().hashCode();
        result = 31 * result + getPass().hashCode();
        result = 31 * result + getGender().hashCode();
        result = 31 * result + getContact().hashCode();
        result = 31 * result + getBatch_id().hashCode();
        result = 31 * result + getOpened().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id='" + student_id + '\'' +
                ", sfname='" + sfname + '\'' +
                ", slname='" + slname + '\'' +
                ", userid='" + userid + '\'' +
                ", pass='" + pass + '\'' +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", batch_id='" + batch_id + '\'' +
                ", opened='" + opened + '\'' +
                '}';
    }
}
