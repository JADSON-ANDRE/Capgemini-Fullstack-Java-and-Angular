package IntroducaoJava;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, fat=1;
        n = scan.nextInt();

        if (n < 0 || n >= 13) {
            System.out.println("Valor inválido");
        } else if (n == 1) {
            System.out.println(n);
        } else {
            while (n > 1) {
                fat *= n;
                n--;
            }
            System.out.println(fat);
            scan.close();
        }
    }
}
