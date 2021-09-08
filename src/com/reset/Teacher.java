package com.reset;

public class Teacher extends Person {
    private String specialization;
    private double paycheck;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }

    public void raisePaycheck(double raise){
        setPaycheck(getPaycheck()+raise);
    }
}
