package com.project.AttendanceManagementSystem.model;

public class Teacher {

    private String teacher_id;
    private String tfname;
    private String tlname;
    private String userId;
    private String password;
    private String contact;
    private String salary;
    private String opened;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        if (!getTeacher_id().equals(teacher.getTeacher_id())) return false;
        if (!getTfname().equals(teacher.getTfname())) return false;
        if (!getTlname().equals(teacher.getTlname())) return false;
        if (!getUserId().equals(teacher.getUserId())) return false;
        if (!getPassword().equals(teacher.getPassword())) return false;
        if (!getContact().equals(teacher.getContact())) return false;
        if (!getSalary().equals(teacher.getSalary())) return false;
        return getOpened().equals(teacher.getOpened());
    }

    @Override
    public int hashCode() {
        int result = getTeacher_id().hashCode();
        result = 31 * result + getTfname().hashCode();
        result = 31 * result + getTlname().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getContact().hashCode();
        result = 31 * result + getSalary().hashCode();
        result = 31 * result + getOpened().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id='" + teacher_id + '\'' +
                ", tfname='" + tfname + '\'' +
                ", tlname='" + tlname + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", contact='" + contact + '\'' +
                ", salary='" + salary + '\'' +
                ", opened='" + opened + '\'' +
                '}';
    }
}
