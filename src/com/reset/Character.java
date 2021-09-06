package com.reset;

import java.util.Objects;

public class Character {

    private String name;
    private double height;
    private int stamina;
    private double jumpHeight = 1;
    private int pace;
    private int lifePoints = 0;
    private int respawn;
    protected boolean hasFeather = false;
    protected boolean hasYoshi = false;
    public boolean cape = false;
    public boolean run;
    public boolean walk;
    public boolean jump;
    private int coin;

    public Character(String name) {
        setName(name);
        setHeight(1.5);
        setJumpHeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getPace() {
        return pace;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setJumpHeight() {
        if (Objects.equals(this.name, "Mario")){
            this.jumpHeight = 0.5*getHeight();
        } else{
            this.jumpHeight = 2*getHeight();
        }
    }

    public void restoreStamina(){
        this.stamina = 100;
    }

    public void staminaLoss(){
        if (this.stamina>0){
            this.stamina -= 10;
        } else{
            this.stamina = 0;
        }
    }

    public void staminaGain(){
        if (this.stamina<100){
            this.stamina += 10;
        } else{
            this.stamina = 100;
        }
    }

    public void characterDeath(){
        this.stamina = 0;
        this.respawn -= 1;
        this.coin = 0;
        System.out.println("Oh no! Mario is no more!");
        if (this.respawn <= 0){
            this.respawn = 0;
            castCharacter();
            System.out.println("\n<<<<<<G A M E  O V E R>>>>>>\n");
        }
        restoreStamina();
    }

    public void collectCoin(){
        this.coin +=1;
        if (this.coin%10==0){
            this.respawn += 1;
            System.out.println("Mario got the 10th coin!");
        } else {
            System.out.println("Mario got a coin!");
        }
    }

    protected void isMoving(int action){
        boolean move = true;
        while(move){
            if (action==5) {
                this.run = true;
                setPace(getPace()+1);
                System.out.println("Mario is running fast!\n");
            }
            else if (action==6){
                this.walk = true;
                setPace(1);
                System.out.println("Mario is just walking\n");
            }
            else if (action==8){
                this.jump = true;
                jumpStyle();
            }
            move = false;
        }
    }

    private void jumpStyle(){
        if (this.jump) {
            if (hasYoshi) {
                System.out.println("Mario jumped with Yoshi!\n");
            } else if (hasFeather) {
                System.out.println("Mario is flying! <O>\n");
            } else {
                System.out.println("Mario jumped\n");
            }
        }
    }

    public void gotYoshi(){
        if (hasYoshi){
            lifePoints += 1;
            this.jumpHeight +=1;
            System.out.println("Mario is mounted in his travel companion, Yoshi!\n");
        }
    }

    public void lostYoshi(){
        this.hasYoshi = false;
        System.out.println("Oh no! Mario lost his friend Yoshi :(\n");
        this.jumpHeight -= 1;
        lifePoints -= 1;
    }

    public void gotFeather(){
        if (hasFeather){
            this.cape = true;
            lifePoints += 1;
            this.jumpHeight += 5;
            System.out.println("Mario has collected a feather and now wears a cape. Lets fly!\n");
        }
    }

    public void lostFeather(){
        System.out.println("Darn it! Mario lost his cape!\n");
        this.hasFeather = false;
        this.jumpHeight -= 5;
        lifePoints -= 1;
    }

    public void castCharacter(){
        System.out.println("-------\n");
        System.out.println("Its-a me, "+getName()+"!");
        System.out.println("Number of respawns: "+this.respawn);
        System.out.println("Life points: "+this.lifePoints);
        System.out.println("Stamina: "+this.stamina+" points");
        System.out.println("Coins collected: "+this.coin);
        System.out.println("Mario can fly? "+this.hasFeather);
        System.out.println("Mario wandering with Yoshi? "+this.hasYoshi);
        System.out.println("Mario can jump: "+this.jumpHeight+" square(s)");
        System.out.println("-------\n");
    }
}
