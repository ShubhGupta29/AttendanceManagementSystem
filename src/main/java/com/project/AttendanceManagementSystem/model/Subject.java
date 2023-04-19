package com.project.AttendanceManagementSystem.model;

public class Subject {

    private String subject_id;
    private String subject_name;

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;

        Subject subject = (Subject) o;

        if (!getSubject_id().equals(subject.getSubject_id())) return false;
        return getSubject_name().equals(subject.getSubject_name());
    }

    @Override
    public int hashCode() {
        int result = getSubject_id().hashCode();
        result = 31 * result + getSubject_name().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id='" + subject_id + '\'' +
                ", subject_name='" + subject_name + '\'' +
                '}';
    }
}
