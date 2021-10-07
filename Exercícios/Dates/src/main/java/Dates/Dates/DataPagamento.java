package Dates.Dates;

    /* A partir da data da compra, adicionar 10 dias como prazo máximo de pagamento
    sem juros, de modo que caso a data caia num final de semana (sábado ou domingo),
    a data limite seja jogada para a segunda-feira. */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DataPagamento {
    public static void main(String[] args) {
        String nome;
        Scanner ler = new Scanner(System.in);
        Calendar hoje = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

        System.out.println("Nome do Cliente: ");
        nome = ler.nextLine();

        System.out.println("\n ### DADOS DA COMPRA ### ");
        System.out.println("Cliente: " + nome);
        System.out.println("Data da compra: " + df.format(hoje.getTime()));
        hoje.add(Calendar.DATE, +10);
        if (hoje.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            hoje.add(Calendar.DATE, +2);
            System.out.println("Data de Vencimento: " + df.format(hoje.getTime()));
        } else if (hoje.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            hoje.add(Calendar.DATE, +1);
            System.out.println("Data de Vencimento: " + df.format(hoje.getTime()));
        } else {
            System.out.println("Data de Vencimento: " + df.format(hoje.getTime()));
        }
        System.out.println("\nATENÇÃO!!\nHaverá adição de juros após a data.");
    }
}
