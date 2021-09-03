package com.reset;

/*
Visibilidade pública: Pode ser acessada por qualquer elemento fora da classe originária
Visibilidade privada: Pode ser acessada SOMENTE dentro da sua classe originária
Visibilidade protegida: Pode ser acessada dentro da sua classe originária OU por uma instância da classe originária

Um elemento privado pode ser modificado fora da classe originária se, e somente se, este for feito por um método da
classe originária. Por exemplo, o método withYoshi() consegue modificar o atributo lifePoints, sendo privado.
*/
public class SuperMarioSim {
    public static void main(String[] args) {
        Character player1 = new Character("Mario");

//        player1.hatColor = "Orange"; // hatColor é um atributo privado e só pode ser alterado dentro da sua classe
        player1.castCharacter();
        player1.isMoving(6); // isMoving() é um método protegido, mas player1 é uma instância de Mario visibilidade
        player1.staminaLoss();
        player1.isMoving(8);
        player1.staminaLoss();
        player1.isMoving(5);
        player1.staminaLoss();
//        player1.jumpStyle(); // jumpStyle() é um método privado e só pode ser chamado dentro da sua classe
        player1.hasYoshi = true;
//        player1.lifePoints; // lifePoints é um atributo privado da classe originária.
        player1.gotYoshi(); // IMPORTANTE. Note que withYoshi() é um método público que altera um atributo privado(lifePoints)!
        player1.isMoving( 8);
        player1.castCharacter();
        player1.hasFeather = true;
        player1.staminaGain();
        player1.gotFeather();
        player1.lostYoshi();
        player1.staminaGain();
        player1.castCharacter();
        player1.lostFeather();
        player1.staminaGain();
        player1.castCharacter();
        for (int i=0;i<10;++i){
            player1.collectCoin();
        }
        player1.castCharacter();
        player1.characterDeath();
        player1.characterDeath();
        player1.castCharacter();
        player1.characterDeath();
        player1.characterDeath();
    }
}
