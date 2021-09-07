package com.reset;

import java.util.Random;

public class SuperMarioGame {
    private Character player1;
    private Character player2;
    
    public SuperMarioGame(Character player1, Character player2) {
        this.player1 = new Character("Mario");
        this.player1.castCharacter();
        this.player2 = new Character("Luigi");
        this.player2.castCharacter();
    }

    public void play(){
        Random rand = new Random();
        Character[] playing = {this.player1, this.player2};
        for(int x = 0; x<2;x++){
            int coin = rand.nextInt(30);

            for (int i=0; i<coin; i++){
                playing[x].collectCoin();
            }
            playing[x].castCharacter();
        }

    }
    
}
