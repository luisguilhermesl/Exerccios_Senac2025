package Aula02;

import java.util.Scanner;

public class FuncoesAritmeticas {
    public static void main(String[] args) {
        
        //Valor Absoluto
//        int a = Math.abs(-50);
//        System.out.println(a);
        
        //Exponencial
//        double a = Math.pow(9,5);
//        System.out.println(a);
        
        /* Raiz Quadrada
        double a = Math.sqrt(81);
        System.out.println(a); */
        
        /* Graus para Radianos
        double a = Math.toRadians(90);
        System.out.println(a); */
        
        //Conversor de Seno
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um ângulo: ");
        double angulo = teclado.nextDouble();
        double s = Math.sin(Math.toRadians(angulo));
        System.out.println("O seno de "+angulo+ " é igual a "+s);
        
    }
}