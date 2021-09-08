package com.reset;

public class FellowshipStudent extends Student{
    private double fellowshipAward;

    public double getFellowshipAward() {
        return fellowshipAward;
    }

    public void setFellowshipAward(double fellowshipAward) {
        this.fellowshipAward = fellowshipAward;
    }

    public void renewFellowship(double newGrant){
        setFellowshipAward(getFellowshipAward()+newGrant);
    }

    @Override
    public void payTuition(double payment) {
        super.payTuition(payment);
    }

}
