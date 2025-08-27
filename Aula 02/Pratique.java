package Aula02;

import java.util.Scanner;

/**
 * PRATIQUE: Crie um programa que solice ao usuário uma informação, utilize
 * parênteses, operadores, funções aritméticas, leitura de dados e variáveis com
 * tipos primitivos.
 *
 *
 * @author admin
 */
public class Pratique {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;

        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        double potencia = Math.pow(num1,num2);

        System.out.println("--- Resultados ---");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        System.out.println("Raiz quadrado do número 1: " + raiz1);
        System.out.println("Raiz quadrado do número 2: " + raiz2);
        System.out.println(num1+" elevado a "+num2+" = "+potencia);
    }
}