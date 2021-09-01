package Dates.Dates;

    // Teste de Manipulação de Datas

import java.time.LocalDateTime;

public class ManipulandoData {
    public static void main(String[] args) {
        LocalDateTime dataBase = LocalDateTime.of(1988, 8, 3,9, 0, 0);
        System.out.println(dataBase);

        LocalDateTime futuro = dataBase.plusYears(6).plusMonths(0).plusDays(25).plusHours(2).plusMinutes(45);
        System.out.println(futuro);

    }
}
