package com.reset.ThirdModule;

public class TestarCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();

        // caneta é uma instância da classe Caneta, vamos conferir alguns dos seus atributos.
        System.out.println(caneta);
        System.out.println(caneta.getCarga());
        System.out.println(caneta.tampada);
        System.out.println(caneta.cor);
        System.out.println(caneta.ponta);

        // Vamos colocar vermelho, a ponta 0,7 no objeto caneta e escrever dez linhas
        caneta.cor = "vermelho";
        caneta.ponta = (float) 0.7;
        caneta.escrever(10);

        // A caneta tem cor e ponta conforme especificamos, mas não pode escrever. A caneta precisa ser destampada.
        System.out.println(caneta.cor);
        System.out.println(caneta.ponta);
        System.out.println(caneta.getCarga());

        caneta.tampada=false; // Destampamos a caneta
        caneta.escrever(10); // Escrevemos 10 linhas
        System.out.println(caneta.getCarga()); // A carga deve ser reduzida em
        System.out.println(caneta.tampada);
    }
}
