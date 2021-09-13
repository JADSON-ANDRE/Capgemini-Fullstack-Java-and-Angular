package Collections.Lists;

    /*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1 - Telefonou para a vítima?
        2 - Esteve no local do crime?
        3 - Mora perto da vítima?
        4 - Devia para a vítima?
        5 - Trabalhou com a vítima?
     Se houver 2 respostas positivas, a pessoa é SUSPEITA; se houver 3 ou 4 respostas positivas,
     a pessoa é CUMPLICE; e caso sejam 5 respostas positivas, a pessoa é ASSASSINA. Senão, é
     INOCENTE. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DesafioCrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respSeq = new ArrayList<>();
        String resp;
        int c = 0;

        System.out.println(" #### INTERROGATÓRIO #### ");
        System.out.println("\nTelefonou para a vítima?");
        resp = scan.next();
        respSeq.add(resp);
        System.out.println("Esteve no local do crime?");
        resp = scan.next();
        respSeq.add(resp);
        System.out.println("Mora perto da vítima?");
        resp = scan.next();
        respSeq.add(resp);
        System.out.println("Devia para a vítima?");
        resp = scan.next();
        respSeq.add(resp);
        System.out.println("Trabalhou com a vítima?");
        resp = scan.next();
        respSeq.add(resp);

        System.out.println("Sequência de respostas :: "+respSeq);
        Iterator<String> contador = respSeq.iterator();
        for (int i = 1; i <= 5; i++) {
            String d = contador.next();
            if (d.contains("S")) {
                c ++;
            }
        }

        if (c < 2) {
            System.out.printf("Você está liberado(a), é INOCENTE!");
        } else if (c == 2) {
            System.out.println("Você está sendo incluído(a) na lista de SUSPEITOS");
        } else if (c == 3 || c == 4) {
            System.out.println("Você está sendo incluído(a) na lista de CUMPLICES");
        } else if (c == 5) {
            System.out.println("Você será levado(a) para a cela, por ter cometido o crime. ASSASSINO(A)!");
        } else {
            return;
        }
    }
}
