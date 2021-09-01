package Collections.Map;

import java.util.*;

/* Faça um programa que simule o lançamento de dados:
        - Lance o dado 100 vezes, armazene e por fim, mostre
        quantas vezes cada valor foi inserido.
     */
public class Dados {
        public static void main(String[] args) {
            List<Integer> valores = new ArrayList<>();
            Random lancamentos = new Random();
            int quant = 100;

            System.out.println(" #### LANÇAMENTO DE 1 DADO 100x #### ");
            for (int i = 0; i < quant; i++) {
                int num = lancamentos.nextInt(6) + 1;
                valores.add(num);
            }
            System.out.println(valores);

            Map<Integer, Integer> lanca = new HashMap<>();
            for (Integer result : valores) {
                if (lanca.containsKey(result)) {
                    lanca.put(result, (lanca.get(result) + 1));
                } else lanca.put(result, 1);
            }

            System.out.println("\nListando quantas vezes cada valor do dado apareceu :: ");
            for (Map.Entry<Integer, Integer> entry : lanca.entrySet()) {
                System.out.println(entry.getKey() + " - " +entry.getValue());
            }
        }
}
