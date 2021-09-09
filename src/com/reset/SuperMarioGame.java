package com.reset;

import java.util.Random;

public class SuperMarioGame {
    private Mario player1;
    private Luigi player2;
    
    public SuperMarioGame(Character player1, Character player2) {
        this.player1 = new Mario();
        this.player1.castCharacter();
        this.player2 = new Luigi();
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
