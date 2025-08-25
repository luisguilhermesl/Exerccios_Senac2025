package ExerciciosDoSlide;

import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {

        //String nome;
        //int idade;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine(); //nome está recebendo o nome que o usuario está digitando
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt(); // idade está recebendo a idade que o usuario está digitando
        System.out.println("Legal, seu nome é " + nome + " e você tem " + idade + " anos");

    }
}
