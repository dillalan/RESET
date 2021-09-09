package com.reset;

public class Yoshi extends Character {

    private int fruit = 0;
    private int speed = 10;

    public Yoshi() {
        setName("Yoshi");
    }

    public int getFruit() {
        return fruit;
    }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Yoshi{" +
                "fruit=" + fruit +
                ", speed=" + speed +
                '}';
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void eat(){
        setFruit(getFruit()+1);
        if (getFruit()%2==0){
            setSpeed(getSpeed()*2);
        }
    }
}
