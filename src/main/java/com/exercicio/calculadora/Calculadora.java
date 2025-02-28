package com.exercicio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrai(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    public static void exibirResultado(String operacao, double resultado) {
        System.out.println("O resultado da " + operacao + " é: " + resultado);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numeroDois = scanner.nextInt();

        exibirResultado("soma", soma(numeroUm, numeroDois));
        exibirResultado("subtração", subtrai(numeroUm, numeroDois));
        exibirResultado("multiplicação", multiplica(numeroUm, numeroDois));
        try {
            exibirResultado("divisão", divide(numeroUm, numeroDois));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}