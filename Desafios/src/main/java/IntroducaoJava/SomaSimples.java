package IntroducaoJava;

    /* Leia dois valores inteiros identificados como variáveis A e B.
       Calcule a soma entre elas e chame essa variável de SOMA.
       A seguir escreva o valor desta variável.  */

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, soma=0;
        System.out.println("Entre com dois inteiros (separados por espaço): ");
        A = ler.nextInt();
        B = ler.nextInt();

        soma = A + B;

        System.out.println( "SOMA = "+soma);

        ler.close();
    }
}
