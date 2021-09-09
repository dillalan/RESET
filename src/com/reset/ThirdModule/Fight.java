package com.reset.ThirdModule;

import java.util.Objects;
import java.util.Random;

public class Fight {
    Fighter challenged;
    Fighter challenger;
    int rounds;
    boolean approvedMatch;

    public Fight(Fighter challenged, Fighter challenger) {
        this.challenged = challenged;
        this.challenger = challenger;
        scheduleMatch(this.challenged, this.challenger);
    }

    public void scheduleMatch(Fighter challenged, Fighter challenger){
        if (challenged.getCategory().equals(challenger.getCategory()) && !Objects.equals(challenged.getName(), challenger.getName())){
            this.approvedMatch = true;
            startFight(challenged, challenger);
        }else{
            this.approvedMatch = false;
            System.out.println("Cannot match different categories to a fight!");
        }
    }

    public void startFight(Fighter challenged, Fighter challenger){

        int cd = 0; // victory counter for challenged fighter
        int cr = 0; // victory counter for challenger fighter

        if (this.approvedMatch) {
            this.rounds = 3;
            System.out.println("\n\n\n\t\t\tFIGHT NIGHT\n");

            challenged.presentFighter();
            System.out.println("\n \t\t\tXXXXXXXXXXX \n");
            challenger.presentFighter();

            for (int i=0; i<this.rounds;i++){
                System.out.println("\n\n\t\tROUND "+(i+1)+"\n\n\t\tFIGHT!\n");
                Random rand = new Random();
                int roundResult = rand.nextInt(7);

                if (roundResult == 0){
                    System.out.println("\t\t"+challenged.getName()+" wins the "+(i+1)+" round!");
                    cd +=1;
                } else if (roundResult == 1){
                    System.out.println("\t\t"+challenger.getName()+" wins the " +(i+1)+" round!");
                    cr += 1;
                } else if (roundResult == 2){
                    System.out.println("\t\t"+challenged.getName()+" WINS THE FIGHT BY KNOCKOUT!");
                    cd +=3;
                    break;
                } else if (roundResult == 3){
                    System.out.println("\t\t"+challenger.getName() + " WINS THE FIGHT BY KNOCKOUT!");
                    cr += 3;
                    break;
                } else {
                    System.out.println("\t\tA tied "+(i+1)+" round!");
                }
            }
        } else {
            System.out.println("You either did not scheduled a fight, or this fight was not approved!");
        }
        if (cd>cr){
            System.out.println("\n\n\t\t"+challenged.getName()+" IS TONIGHT'S WINNER!");
            challenged.setWins(challenged.getWins()+1);
        } else if (cd<cr){
            System.out.println("\n\n\t\t"+challenger.getName()+" IS TONIGHT'S WINNER!");
            challenger.setWins(challenger.getWins()+1);
        } else {
            System.out.println("\n\n\t\tA TIED FIGHT! NO WINNER TONIGHT!");
            challenged.setDraws(challenged.getDraws()+1);
            challenger.setDraws(challenger.getDraws()+1);
        }

    }

}
