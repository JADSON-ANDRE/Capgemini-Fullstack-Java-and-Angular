package Dates.Dates;

    // Verificar se determinada data de nascimento é anterior à Maio de 2010

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import  java.util.Date;

public class DataAniversario {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        Date dataNascimento = new Date(778085340000L);
        System.out.println(df.format(dataNascimento));

        Date dataMaio = new Date(1273934940000L);
        System.out.println(df.format(dataMaio));

        boolean isBefore = dataNascimento.before(dataMaio);
        System.out.println("Data de Nascimento é anterior à Maio de 2010? " + isBefore);
    }
}
