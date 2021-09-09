package com.reset.SecondModule;

import java.util.Objects;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int age = scan.nextInt();

        System.out.println("Você mora no Brasil?\ns/N");
        String country = scan.next();

        if (age >= 18){
            System.out.println("Você já pode tirar a licença de motorista.");
        }
        else {
            if (Objects.equals(country, "s")){
                System.out.println("Você ainda não tem permissão para obter a licença de motorista.");
            }
            else {
                System.out.println("Cheque a legislação local.");
            }
        }

        System.out.println("""

                Qual o seu grau de instrução?
                1 Ensino Básico completo
                2 Ensino Básico incompleto
                3 Ensino Médio completo
                4 Ensino Médio incompleto
                5 Ensino Superior completo
                6 Ensino Superior incompleto
                7 Pós graduação completa""");

        int study = scan.nextInt();

        switch (study){
            case 1: System.out.println("Você está entre os 30% dos brasileiros com esse nível de formação escolar");
            break;
            case 4:
            case 2: System.out.println("Você está entre os 15% dos brasileiros com esse nível de formação escolar");
            break;
            case 3:
            case 6: System.out.println("Você está entre os 45% dos brasileiros com esse nível de formação escolar");
            break;
            case 5: System.out.println("Você está entre os 9% dos brasileiros com esse nível de formação escolar");
            break;
            case 7: System.out.println("Você está entre o 1% dos brasileiros com esse nível de formação escolar");
            break;
        }

        //Exercício 1
        System.out.println("\nExercício 1");

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota");
        double nota3 = scan.nextInt();

        System.out.println("Digite a quarta nota");
        double nota4 = scan.nextInt();

        double meanGrade = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das notas inseridas é " + meanGrade);

        if (meanGrade<7){
            System.out.println("Aluno Reprovado");
        }
        else{
            if (meanGrade==10){
                System.out.println("Aluno aprovado com louvores!");
            }
            else {
                System.out.println("Aluno Aprovado");
            }
        }

        // Exercício 2
        System.out.println("\nExercício 2");

        System.out.println("Digite o número correspondente ao dia da semana");
        int day = scan.nextInt();

        switch (day){
            case 1: System.out.println("Segunda-feira");
            break;
            case 2: System.out.println("Terça-feira");
            break;
            case 3: System.out.println("Quarta-feira");
            break;
            case 4: System.out.println("Quinta-feira");
            break;
            case 5: System.out.println("Sexta-feira");
            break;
            case 6: System.out.println("Sábado");
            break;
            case 7: System.out.println("Domingo");
            break;
            default: System.out.println("Valor inválido");
        }
        }
    }

