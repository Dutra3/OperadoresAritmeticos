package com.company;

public class Main {

    public static void main(String[] args) {

        int soma = 5 + 7;
        int soma2 = soma + 1;
        int soma3 = soma + soma2;


        System.out.println(soma);
        System.out.println(soma2);
        System.out.println(soma3);


        int subtracao = 15 - 8;
        int sub2 = soma2 - subtracao;

        System.out.println(subtracao);
        System.out.println(sub2);


        // Calculando Média

        int nota = 5;
        int nota2 = 9;

        int media = (nota + nota2) / 2;

        System.out.println("A media ficou " + media);

    }
}
