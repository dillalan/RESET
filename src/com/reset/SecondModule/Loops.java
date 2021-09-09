package com.reset.SecondModule;

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

        System.out.println("""

                Exemplo do loop 'for': Para cada iteração, até que o iterador chegue a uma condição não verdadeira, alguma coisa é feita.
                """);

        for (int iterator=0;iterator<5;iterator++){ // Para iterador de 0 até que iterador seja menor do que 5,
            // incremente 1 e faça...
            System.out.println("O valor do iterador é "+iterator);
        }

        System.out.println("""

                Exemplo de interrupção do loop com 'break': Quando a linha de execução chega em 'break', a repetição é interrompida
                """);

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

        // Exercício 1
        System.out.println("\nExercício 1");
        boolean flag = true;
        while (flag){
            System.out.println("Insira uma nota de 0 a 10");
            double nota = scan.nextDouble();
            if (nota>0 && nota<10){
                flag = false;
                System.out.println("Você inseriu a nota "+nota);
            }
        }

        // Exercício 2
        System.out.println("\nExercício 2");

        System.out.println("\nInsira um número qualquer");
        int m1 = scan.nextInt();

        System.out.println("\nInsira um número diferente e maior que o anterior");
        int m2 = scan.nextInt();
        while (m2<=m1) {
            System.out.println("\nInsira um número diferente e maior que o anterior");
            m2 = scan.nextInt();
        }

        System.out.println("Os números do intervalo entre "+m1+" à "+m2+" são");
        m1++; // Para evitar de imprimir o m1, apenas o intervalo.
        while (m1<m2) {
            System.out.println(m1);
            m1++;
        }

        // Exercício 3
        System.out.println("\nExercício 3");

        System.out.println("Digite cinco números");
        double u1 = scan.nextDouble();
        double u2 = scan.nextDouble();
        double u3 = scan.nextDouble();
        double u4 = scan.nextDouble();
        double u5 = scan.nextDouble();
        double ans = Math.max(u1, u2);

        // u1 maior ou igual a u2
        //se não ans recebe u2
        // se sim, ans recebe u1
        if (u3>ans){ // u3 maior que ans
            ans=u3; // se sim ans recebe u3
        }
        if (u4 > ans) { // u4 maior que ans
            ans = u4; // se sim ans recebe u4
        }
        if (u5 > ans) { // u5 maior que ans?
            ans = u5; // se sim, and recebe u5
        }
        System.out.println("O maior dos cinco números é " + ans);

        // Exercício 4
        System.out.println("\nExercício 4");
        System.out.println("Qual tabuada deseja ver?");
        int t = scan.nextInt();

        for (int unit=0;unit<=10;unit++){
            System.out.println(t+" x "+unit+ " = "+(t*unit));
        }
    }
}
