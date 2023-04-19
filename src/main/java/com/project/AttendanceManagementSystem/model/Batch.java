package com.project.AttendanceManagementSystem.model;

public class Batch {

    private String batch_id;
    private String subject;
    private String days;
    private String tacher_id;
    
    

    public Batch(String batch_id, String subject, String days, String tacher_id) {
		super();
		this.batch_id = batch_id;
		this.subject = subject;
		this.days = days;
		this.tacher_id = tacher_id;
	}

	public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTacher_id() {
        return tacher_id;
    }

    public void setTacher_id(String tacher_id) {
        this.tacher_id = tacher_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Batch)) return false;

        Batch batch = (Batch) o;

        if (!getBatch_id().equals(batch.getBatch_id())) return false;
        if (!getSubject().equals(batch.getSubject())) return false;
        if (!getDays().equals(batch.getDays())) return false;
        return getTacher_id().equals(batch.getTacher_id());
    }

    @Override
    public int hashCode() {
        int result = getBatch_id().hashCode();
        result = 31 * result + getSubject().hashCode();
        result = 31 * result + getDays().hashCode();
        result = 31 * result + getTacher_id().hashCode();
        return result;
    }
}
