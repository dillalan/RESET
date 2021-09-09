package com.reset;

public class Luigi extends Character{

    public Luigi() {
        setName("Luigi");
        setHeight(1.5);
        setHatColor("green");
        setShirtColor("green");
        setJumpsuitColor("blue");
        setGlovesColor("white");
        setShoeColor("brown");
    }

    public void fly(){
        if(this.isHasFeather()){
            System.out.println("Luigi flies!");
        }
    }
}
