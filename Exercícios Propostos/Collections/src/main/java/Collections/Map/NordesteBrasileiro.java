package Collections.Map;

import java.util.*;

/* Dada a população estimada de alguns estados do Nordeste, faça:
        - Criar um dicionário e relacione os Estados e as respetivas populações;
        - Substituir a população do RN por 3.534.165;
        - Verificar se PB já está no dicionário, se não, adicionar PB - 4.039.277;
        - Exibir o dicionário na ordem que foi informado;
        - Exibir o dicionário em ordem alfabética;
        - Exibir o estado com menor população e a quantidade;
        - Exibir o estado com maior população e a quantidade;
        - Exibir a soma da população do dicionário;
        - Exibir a média da população do dicionário;
        - Remover os estados com população menor que 4.000.000;
        - Apagar o dicionário;
        - Verificar se o dicionário está vazio; */
    // Estados {PE - 9.616.621, AL - 3.351.543, CE - 9.187.103, RN - 3.534.265};

public class NordesteBrasileiro {
        public static void main(String[] args) {
            Map<String, Integer> estadosNordeste = new HashMap<>() {{
               put("PE", 9616621);
               put("AL", 3351543);
               put("CE", 9187103);
               put("RN", 3534265);
            }};
            System.out.println(" #### DICIONÁRIO DE ESTADOS DO NORDESTE BRASILEIRO #### ");
            System.out.println(estadosNordeste.toString());

            System.out.println("\nAlterando população do Rio Grande do Norte - RN :: ");
            estadosNordeste.put("RN", 3534165);
            System.out.println(estadosNordeste);

            System.out.println("Checando se a Paraíba - PB está inserida no dicionário :: ");
            if (!estadosNordeste.containsKey("PB")) {
                estadosNordeste.put("PB", 4039277);
            }
            System.out.println(estadosNordeste);

            System.out.println("Exibição do dicionário na ordem de inserção :: ");
            Map<String, Integer> estadosNordeste2 = new LinkedHashMap<>() {{
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }};
            System.out.println(estadosNordeste2);

            System.out.println("Exibição do dicionário em ordem alfabética :: ");
            Map<String, Integer> estadosNordeste3 = new TreeMap<>(estadosNordeste);
            System.out.println(estadosNordeste3);

            Integer menorPopulacao = Collections.min(estadosNordeste.values());
            Set<Map.Entry<String, Integer>> entries = estadosNordeste.entrySet();
            String estadoMenosPopuloso = "";
            for (Map.Entry<String, Integer> entry: entries) {
                if (entry.getValue().equals(menorPopulacao)) {
                    estadoMenosPopuloso = entry.getKey();
                    System.out.println("Estado do Nordeste com menor população :: "+estadoMenosPopuloso +" - " +menorPopulacao);
                }
            }

            Integer maiorPopulacao = Collections.max(estadosNordeste.values());
            Set<Map.Entry<String, Integer>> entries1 = estadosNordeste.entrySet();
            String estadoMaisPopuloso = "";
            for (Map.Entry<String, Integer> entry : entries1) {
                if (entry.getValue().equals(maiorPopulacao)) {
                    estadoMaisPopuloso = entry.getKey();
                    System.out.println("Estado do Nordeste com maior população :: "+estadoMaisPopuloso +" - " +maiorPopulacao);
                }
            }

            System.out.println("População Total dos estados do Nordeste Brasileiro inseridos no dicionário :: ");
            Iterator<Integer> iterator = estadosNordeste.values().iterator();
            Integer soma = 0;
            while (iterator.hasNext()) {
                soma += iterator.next();
            }
            System.out.println(soma);

            System.out.println("Média da população :: ");
            int media = 0;
            media = soma / estadosNordeste.size();
            System.out.println(media);

            System.out.println("Removendo todos os estados com população inferior a 4.000.000 :: ");
            Iterator<Integer> iterator1 = estadosNordeste.values().iterator();
            while (iterator.hasNext()) {
                if (iterator1.next() < 4000000) iterator1.remove();
            }
            System.out.println(estadosNordeste);

            System.out.println("Apagando Dicionários :: ");
            estadosNordeste.clear();
            estadosNordeste2.clear();
            estadosNordeste3.clear();

            System.out.println("Checando se dicionário 1 está vazio :: "+estadosNordeste.isEmpty());
            System.out.println("Checando se dicionário 2 está vazio :: "+estadosNordeste2.isEmpty());
            System.out.println("Checando se dicionário 3 está vazio :: "+estadosNordeste3.isEmpty());
        }
}
