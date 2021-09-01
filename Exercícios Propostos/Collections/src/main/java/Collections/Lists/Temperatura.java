package Collections.Lists;

    /*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
    e armazene-os em uma lista.
    Em seguida, calcule a média semestral das temperatura e mostre todas as
    temperaturas acima desta média, e em que mês elas ocorreram.
    Obs: mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro, ...*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> tempSemestral = new ArrayList<>();
        double temp = 0d;
        double sum = 0d;
        double mediaTemp = 0d;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Qual a temperatura do mês " + i + "?");
            temp = scan.nextDouble();
            tempSemestral.add(temp);
            sum += temp;
        }

        mediaTemp = sum / tempSemestral.size();

        System.out.println("\n ####  TEMPERATURAS SEMESTRAL  #### ");
        System.out.println("Soma das temperaturas no semestre: " + sum + "\nMédia das temperaturas: " + mediaTemp);

        for (Double t : tempSemestral) {
            if (t > mediaTemp) {
                int count = tempSemestral.indexOf(t);
                switch (count) {
                    case 0:
                        System.out.println((count + 1) + " - Janeiro: " + t + "ºC");
                        break;
                    case 1:
                        System.out.println((count + 1) + " - Fevereiro: " + t + "ºC");
                        break;
                    case 2:
                        System.out.println((count + 1) + " - Março: " + t + "ºC");
                        break;
                    case 3:
                        System.out.println((count + 1) + " - Abril: " + t + "ºC");
                        break;
                    case 4:
                        System.out.println((count + 1) + " - Maio: " + t + "ºC");
                        break;
                    case 5:
                        System.out.println((count + 1) + " - Junho: " + t + "ºC");
                        break;
                    default:
                        break;

                }
            }
        }
    }
}