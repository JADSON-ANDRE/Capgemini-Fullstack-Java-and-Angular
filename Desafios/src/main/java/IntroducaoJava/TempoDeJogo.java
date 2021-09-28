package IntroducaoJava;

    /*Tento como base a hora inicial e final de um jogo, calcule a duração do dele,
      sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
      duração mínima de, 60 minutos e máxima de 24 horas.  */

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim, horas;

        System.out.println("Informe a HORA de início e fim do jogo(separados por espaço): ");
        inicio = ler.nextInt();
        fim = ler.nextInt();
        horas = fim - inicio;

        if (horas == 0){
            System.out.println("O JOGO DUROU 24 HORAS");
        } else if (horas < 0){
            System.out.println("O JOGO DUROU " +(horas + 24) +" HORAS");
        } else if (horas > 0 && horas <24){
            System.out.println("O JOGO DUROU " +(horas) +" HORAS");
        } else if (horas > 0) {
            System.out.println("O JOGO DUROU " + (horas + 24) + " HORAS");
        }
    }
}
