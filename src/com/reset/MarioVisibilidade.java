package com.reset;

public class MarioVisibilidade {
    private String name;
    private int age;
    private double height;
    private String hatColor;
    private String shirtColor = "red";
    private String jumpsuitColor = "blue";
    private String glovesColor = "white";
    private String shoeColor = "brown";
    private String capeColor = "yellow";
    private int stamina;
    private int jumpHeight = 1;
    private int pace = 1;
    private int lifePoints = 0;
    protected boolean hasFeather = false;
    protected boolean hasYoshi = false;
    public boolean cape = false;
    public boolean run;
    public boolean walk;
    public boolean jump;

    public MarioVisibilidade(){
        this.name = "Mario Bros";
        this.age = 40;
        this.height = 1.5;
        this.stamina = 100;
        this.setHatColor("red");
        this.setShirtColor("red");
        this.setJumpsuitColor("blue");
        this.setGlovesColor("white");
        this.setShoeColor("brown");

    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public void setShirtColor(String shirtColor){
        this.shirtColor = shirtColor;
    }

    public void setJumpsuitColor(String jumpsuitColor) {
        this.jumpsuitColor = jumpsuitColor;
    }

    public void setGlovesColor(String glovesColor) {
        this.glovesColor = glovesColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public void setCapeColor(String capeColor) {
        this.capeColor = capeColor;
    }

    public void setCape(boolean cape) {
        this.cape = cape;
    }

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setHasFeather(boolean hasFeather) {
        this.hasFeather = hasFeather;
    }

    public void setHasYoshi(boolean hasYoshi) {
        this.hasYoshi = hasYoshi;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    protected void isMoving(boolean move, int action){
        while(move){
            if (action==5) {
                this.run = true;
                this.pace = 3;
                System.out.println("Mario is running fast!\n");
            }
            else if (action==6){
                this.walk = true;
                this.pace = 1;
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
        if (jump) {
            if (hasYoshi) {
                System.out.println("Mario jumped with Yoshi!\n");
            } else if (hasFeather) {
                System.out.println("Mario is flying! <O>\n");
            } else {
                System.out.println("Mario jumped\n");
            }
        }
    }

    public void withYoshi(){
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

    public void featherCape(){
        if (hasFeather){
            this.cape = true;
            this.jumpHeight += 5;
            lifePoints += 1;
            System.out.println("Mario has collected a feather and now wears a "+this.capeColor+" cape. Lets fly!\n");
        }
    }

    public void lostFeather(){
        System.out.println("Darn it! Mario lost his cape!\n");
        this.hasFeather = false;
        this.jumpHeight -= 5;
        lifePoints -= 1;
    }

    public void castMario(){
        System.out.println("-------\n");
        System.out.println("Its-a me, Mario!");
        System.out.println("Life points: "+this.lifePoints);
        System.out.println("Hat Color: "+this.hatColor);
        System.out.println("Shirt Color: "+this.shirtColor);
        System.out.println("Jumpsuit Color: "+this.jumpsuitColor);
        System.out.println("Gloves Color: "+glovesColor);
        System.out.println("Shoe Color: "+shoeColor);
        System.out.println("Mario can fly? "+this.hasFeather);
        System.out.println("Mario wandering with Yoshi? "+this.hasYoshi);
        System.out.println("Mario can jump: "+this.jumpHeight+" square(s)");
        System.out.println("-------\n");
    }
}
