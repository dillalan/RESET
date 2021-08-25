package com.reset;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int res = n1 + 1;
        int res1 = ++n2;
        int res2 = n3++;
        System.out.println(res); // res == 1. Because 1 + n2(0) -> 1 + 0 == 1
        System.out.println(res1); // res1 == 1. Because 1 + n2(0) -> 1 + 0 == 1 Same as before
        System.out.println(res2); // res2 == 0. Why? Because n3(0) cannot be modified

        // Exercício 1
        System.out.println("\nExercício 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int var1 = scan.nextInt();
        System.out.println("Digite um segundo número");
        int var2 = scan.nextInt();
        System.out.println("A soma desses dois números é " + (var1+var2)) ;

        // Exercício 2
        System.out.println("\nExercício 2");
        System.out.println("Digite a primeira nota");
        int nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota");
        int nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota");
        int nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota");
        int nota4 = scan.nextInt();
        System.out.println("A média das notas inseridas é " + ((nota1+nota2+nota3+nota4)/4));

        // Exercício 3
        System.out.println("\nExercício 3");
        System.out.println("Insira o valor de sua hora trabalhada, em $");
        float wageHour = scan.nextFloat();
        System.out.println("Insira o número de horas trabalhadas nesse mês");
        float workLoad = scan.nextFloat();
        System.out.println("Seu rendimento para esse mês foi de $ " + (wageHour*workLoad));

    }

}


