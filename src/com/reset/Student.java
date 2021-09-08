package com.reset;

public class Student extends Person {

    private int registrationNumber;
    private String course;
    private double tuition;

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void cancelRegistration(){
        setRegistrationNumber(0);
    }

    public void payTuition(double payment){
        setTuition(getTuition()-payment);
    }
}
