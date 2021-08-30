package com.reset;

public class SuperMario {
    public static void main(String[] args) {
        Mario player1 = new Mario();
        player1.castMario();
        player1.isMoving(true, 6);
        player1.isMoving(true, 8);
        player1.isMoving(true, 5);
        player1.hasYoshi = true;
        player1.withYoshi();
        player1.isMoving(true, 8);
        player1.castMario();
        player1.hasFeather = true;
        player1.featherCape();
        player1.lostYoshi();
        player1.castMario();
        player1.lostFeather();
        player1.castMario();
    }
}
