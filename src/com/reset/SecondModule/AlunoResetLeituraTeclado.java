package com.reset.SecondModule;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {
        System.out.println("Escreva o seu nome");
        Scanner scan = new Scanner(System.in);
        String fulano = scan.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + fulano);
    }
}


