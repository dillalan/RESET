package com.reset;

public class Fight {
    Fighter challenged;
    Fighter challenger;
    int rounds;
    boolean approvedMatch;

    public void scheduleMatch(Fighter challenged, Fighter challenger){
        if (challenged.getCategory().equals(challenger.getCategory())){
            this.approvedMatch = true;
            startFight(challenged, challenger);
        }else{
            this.approvedMatch = false;
            System.out.println("Cannot match different categories to a fight!");
        }
    }

    public void startFight(Fighter challenged, Fighter challenger){
        this.rounds = 3;
        System.out.println("FIGHT NIGHT");
        challenged.presentFighter();
        System.out.println("\nXXXXXXXXXXX\n");
        challenger.presentFighter();

    }

}
