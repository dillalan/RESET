package com.reset;

import java.util.Objects;

public abstract class Character {

    private String name;
    private int stamina = 100;
    private int respawn = 3;
    private int coin = 0;
    private String hatColor;
    private String shirtColor;
    private String jumpsuitColor;
    private String glovesColor;
    private String shoeColor;
    private String capeColor;
    private double jumpHeight = 1;
    private int pace = 1;
    private int lifePoints = 0;
    private boolean hasFeather = false;
    private boolean hasYoshi = false;
    private boolean cape = false;
    private boolean run;
    private boolean walk;
    private boolean jump;
    private double height;

    public Character() {
        setJumpHeight();
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getRespawn() {
        return respawn;
    }

    public void setRespawn(int respawn) {
        this.respawn = respawn;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }

    public String getJumpsuitColor() {
        return jumpsuitColor;
    }

    public void setJumpsuitColor(String jumpsuitColor) {
        this.jumpsuitColor = jumpsuitColor;
    }

    public String getGlovesColor() {
        return glovesColor;
    }

    public void setGlovesColor(String glovesColor) {
        this.glovesColor = glovesColor;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public String getCapeColor() {
        return capeColor;
    }

    public void setCapeColor(String capeColor) {
        this.capeColor = capeColor;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public boolean isHasFeather() {
        return hasFeather;
    }

    public void setHasFeather(boolean hasFeather) {
        this.hasFeather = hasFeather;
    }

    public boolean isHasYoshi() {
        return hasYoshi;
    }

    public void setHasYoshi(boolean hasYoshi) {
        this.hasYoshi = hasYoshi;
    }

    public boolean isCape() {
        return cape;
    }

    public void setCape(boolean cape) {
        this.cape = cape;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean isWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
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
        setStamina(100);
    }

    public void staminaLoss(){
        if (getStamina()>0){
            setStamina(getStamina()-10);
        } else{
            setStamina(0);
        }
    }

    public void staminaGain(){
        if (getStamina()<100){
            setStamina(getStamina()+10);
        } else{
            setStamina(100);
        }
    }

    public void characterDeath(){
        setStamina(0);
        setRespawn(getRespawn()-1);
        setCoin(0);
        System.out.println("Oh no! " +getName()+ "  is no more!");
        if (getRespawn() <= 0){
            setRespawn(0);
            castCharacter();
            System.out.println("\n<<<<<<G A M E  O V E R>>>>>>\n");
        }
        restoreStamina();
    }

    public void collectCoin(){
        setCoin(getCoin()+1);
        if (getCoin()%10==0){
            setRespawn(getRespawn()+1);
            System.out.println(getName()+" got the 10th coin!");
        } else {
            System.out.println(getName()+" got a coin!");
        }
    }

    public void isMoving(int action){
        boolean move = true;
        while(move){
            if (action==5) {
                setRun(true);
                setPace(getPace()+1);
                System.out.println(getName()+" is running fast!\n");
            }
            else if (action==6){
                setWalk(true);
                setPace(1);
                System.out.println(getName()+" is just walking\n");
            }
            else if (action==8){
                setJump(true);
                jumpStyle();
            }
            move = false;
        }
    }

    private void jumpStyle(){
        if (isJump()) {
            if (isHasYoshi()) {
                System.out.println( getName()+" jumped with Yoshi!\n");
            } else if (isHasFeather()) {
                System.out.println(getName()+" is flying! <O>\n");
            } else {
                System.out.println(getName()+" jumped\n");
            }
        }
    }

    public void gotYoshi(){
        if (isHasYoshi()){
            setLifePoints(getLifePoints()+1);
            setJumpHeight(getJumpHeight()+1);
            System.out.println(getName()+" is mounted in his travel companion, Yoshi!\n");
        }
    }

    public void lostYoshi(){
        setHasYoshi(false);
        System.out.println("Oh no! " +getName()+" lost his friend Yoshi :(\n");
        setJumpHeight(getJumpHeight()-1);
        setLifePoints(getLifePoints()-1);
    }

    public void gotFeather(){
        if (isHasFeather()){
            setCape(true);
            setLifePoints(getLifePoints()+1);
            setJumpHeight(getJumpHeight()+5);
            System.out.println( getName()+" has collected a feather and now wears a cape. Lets fly!\n");
        }
    }

    public void lostFeather(){
        System.out.println("Darn it! " +getName()+" lost his cape!\n");
        setHasFeather(false);
        setLifePoints(getLifePoints()-1);
        setJumpHeight(getJumpHeight()-5);
    }

    public void castCharacter(){
        System.out.println("-------\n");
        System.out.println("Its-a me, "+getName()+"!");
        System.out.println("Number of respawns: "+getRespawn());
        System.out.println("Life points: "+getLifePoints());
        System.out.println("Stamina: "+getStamina()+" points");
        System.out.println("Coins collected: "+getCoin());
        System.out.println(getName()+" can fly? "+isHasFeather());
        System.out.println(getName()+" wandering with Yoshi? "+isHasYoshi());
        System.out.println(getName()+" can jump: "+getJumpHeight()+" square(s)");
        System.out.println("-------\n");
    }
}
