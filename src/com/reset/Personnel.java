package com.reset;

public class Personnel extends Person {
    private String sector;
    private boolean working;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void switchWorkStatus(){
        setWorking(!isWorking());
    }
}
