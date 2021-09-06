package com.reset;

import java.util.Random;

public class SuperMarioGame {
    public Character mario;
    public Character luigi;
    
    public SuperMarioGame(String namePlayer1, String namePlayer2) {
        this.mario = new Character(namePlayer1);
        this.mario.castCharacter();
        this.luigi = new Character(namePlayer2);
        this.luigi.castCharacter();
    }

    public void play(Character player){
        Random rand = new Random();
        int coin = rand.nextInt(30);

        for (int i=0; i<coin; i++){
            player.collectCoin();
        }

        player.castCharacter();
    }
    
}
