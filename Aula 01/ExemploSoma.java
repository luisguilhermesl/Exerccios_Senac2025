package ExerciciosDoSlide;

import java.util.Scanner;

public class ExemploSoma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //System.out.println("## Somando Números ## ");
        System.out.println("## Média dos Números ## ");
        System.out.print("Digite um número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = teclado.nextInt();
        double result = (num1 + num2) / 2;
        System.out.println("O primeiro número é " + num1 + " e o segundo é " + num2);
        //System.out.println("A soma dos dois números é "+ (num1 + num2));
        //System.out.println("A soma dos dois números é " + result);
        System.out.printf("A média dos dois números é: %.4f%n", result);
        
        if (num1 > num2) {
            System.out.println("O "+num1+" é maior que o"+num2);
        }else if(num1 < num2){
            System.out.println("O "+num2+" é maior que o "+num1);
        }else{
            System.out.println("Os números ");
        }

    }
}
