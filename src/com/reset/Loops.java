package com.reset;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("\nExemplo de loop 'while': enquanto expressão verdadeira, alguma coisa é feita.\n");

        while (i<=5){ // Enquanto i for menor ou igual a cinco...
            System.out.println("O valor do iterador é "+i);
            ++i;
        }

        System.out.println("\nExemplo do loop 'do-while': alguma coisa é feita até que a expressão for falsa.\n");
        int count = 5;
        do { // Faça a impressão desse texto e decresca count
            System.out.println("Estou menor que "+count);
            count--;
        } while (count>0); // Enquanto count for maior que zero

        System.out.println("\nExemplo do loop 'for': Para cada iteração, até que o iterador chegue a uma condição não " +
                "verdadeira, alguma coisa é feita.\n");

        for (int iterator=0;iterator<5;iterator++){ // Para iterador de 0 até que iterador seja menor do que 5,
            // incremente 1 e faça...
            System.out.println("O valor do iterador é "+iterator);
        }

        System.out.println("\nExemplo de interrupção do loop com 'break': Quando a linha de execução chega em 'break', " +
                "a repetição é interrompida\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Me dê um número:");
        double n1 = scan.nextInt();

        System.out.println("Me dê outro número:");
        double n2 = scan.nextInt();

        for (int it=0;it<10;it++) {
            if (n1 % n2 == 0) {
                double ans = n1 / n2;
                System.out.println(n1 + " dividido por " + n2 + " é uma divisão inteira de resultado " + ans);
            }
            else{
                System.out.println(n1 + " dividido por " + n2 + " não é uma divisão inteira");
                break;
            }
            n1++;
            n2--;
        }
    }
}
