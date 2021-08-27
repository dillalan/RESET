package com.reset;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5]; // A inicialização de um array deve conter o número de posições necessárias.
        myArray[0] = 5;
        myArray[1] = 68;
        myArray[2] = 6;
        myArray[3] = 9;
        // A última posição de myArray não foi preenchida.

        System.out.println("O tamanho desse array é "+myArray.length); // Mesmo assim, o tamanho de myArray segue 5.

        // Para observar o que está contido no Array é necessário iterar o array através de uma repetição.

        for(int i=0;i<myArray.length;i++){
            System.out.println("A posição "+i+" de myArray contém o valor "+myArray[i]);
            // Note que a posição myArray[4] apresenta o valor 0, pois apesar de não preenchida é inicializada com esse valor
        }

        // A repetição simplificada 'for each' utilizado o for each é uma opção útil para manipular arrays

        int[] integers = new int[5];
        for (int i = 0; i<integers.length;i++){ // Para cada elemento do array 'integer'...
            integers[i] = (myArray[i])*100; // ... Faça a atribuição do elemento correspondente em myArray multiplicado por 100
        }

        for (int integer: integers){
            System.out.println("O array integer contém o valor: "+integer);
        }

        //Exercício 1
        System.out.println("\nExercício 1");

        int[] vector1 = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite cinco valores:");
        for(int i=0; i<vector1.length; i++){
            vector1[i] = scan.nextInt();
        }
        int[] vector2 = new int[5];
        for (int i = 0; i<vector1.length;i++) {
            vector2[i] = (vector1[i]) * 2;
        }
        for (int i = 0; i<vector1.length;i++){
            System.out.println("vector1: "+vector1[i]+"\t\tvector2: "+vector2[i]);
        }

        // Exercício 2
        System.out.println("\nExercício 2");
        int[] ages = {19, 20, 18, 39, 5, 65, 78, 3, 45, 4};
        int count = 0;
        for(int age:ages){
            if (age>=18){
                count++;
            }
        }
        System.out.println("O vetor de idades possui os seguintes dados:");
        for(int age:ages){
            System.out.println(age);
        }
        System.out.println("Dos " +ages.length+ " dados apresentados, "+count+" são maiores de idade");
    }
}
