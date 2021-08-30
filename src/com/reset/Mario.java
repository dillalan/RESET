package com.reset;

public class Mario {
    String hatColor = "red";
    String shirtColor = "red";
    String jumpsuitColor = "blue";
    String glovesColor = "white";
    String shoeColor = "brown";
    String capeColor = "yellow";
    int jumpHeight = 1;
    int pace = 1;
    int lifePoints = 0;
    boolean hasFeather = false;
    boolean hasYoshi = false;
    boolean cape = false;
    boolean run;
    boolean walk;
    boolean jump;
    

    public void isMoving(boolean move, int action){
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

    public void jumpStyle(){
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
