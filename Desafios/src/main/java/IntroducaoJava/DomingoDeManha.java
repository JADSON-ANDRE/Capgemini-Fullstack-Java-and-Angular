package IntroducaoJava;

    /* Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para
       o polo de lazer da Parangaba, onde acontece uma feira, conhecida por
       ser a maior da cidade. Na feira da Parangaba você pode encontrar de tudo.
       Todos os domingos, Bino faz compras na feira. Ele sempre marca com seu
       amigo Cino de se encontrarem no terminal de ônibus da Parangaba às 8h,
       para irem juntos comprar na feira. Porém, muitas vezes Bino acorda muito
       tarde e se atrasa para o encontro com seu amigo.
       Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal.
       Diga o atraso máximo de Bino. */

import java.util.Scanner;
import java.io.IOException;

public class DomingoDeManha {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while ( ler.hasNextLine() ) {
            String[] relogio = ler.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

            switch (hora) {
                case (7): System.out.println("Atraso máximo: "+min);
                break;
                case (8): System.out.println("Atraso máximo: "+(min+60));
                break;
                case (9): System.out.println("Atraso máximo: "+(min+120));
                default:  System.out.println("Atraso máximo: 0");
            }
        }
    }
}
