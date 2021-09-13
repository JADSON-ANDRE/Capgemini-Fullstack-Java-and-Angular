package Collections.Set;

    /* Crie um conjunto contendo as cores do arco-íris, e:
        A. Exiba todas as cores uma abaixo da outra;
        B. Exiba a quantidade de cores;
        C. Ordene as cores por ordem alfabética;
        D. Exiba as cores na ordem inversa da que foi informada;
        E. Exiba todas as cores que começam com 'V';
        F. Remova todas as cores que começam do 'V';
        G. Limpe o conjunto e confira se o mesmo está vazio. */
    // VIOLETA, ANIL, AZUL, VERDE, AMARELO, LARANJA e VERMELHO

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        System.out.println(" #### CORES DO ARCO-ÍRIS #### ");
        cores.add("\nvioleta");
        cores.add("anil");
        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("laranja");
        cores.add("vermelho");

        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("\nO arco-íris é composto por "+cores.size() +" cores.");

        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println("Cores do Arco-Íris (ordem alfabética) :: "+cores2);

        Set<String> cores3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        List<String> cores3List = new ArrayList<>(cores3);
        Collections.reverse(cores3List);
        System.out.println("Cores do Arco-Íris (inserção) :: "+cores3);
        System.out.println("Cores do Arco-Íris (ordem inversa de inserção) :: "+cores3List);

        System.out.println("Cores do Arco-Íris (começam com 'V') :: ");
        for (String cor : cores) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        Iterator<String> it = cores3.iterator();
        while (it.hasNext()){
            if (it.next().startsWith("v"))
                it.remove();
        }
        System.out.println("Cores do Arco-Íris (EXCLUINDO cores que começam com 'V') :: "+cores3);

        cores.clear();
        cores2.clear();
        cores3.clear();

        System.out.println("Limpando conjuntos :: \nConjunto 1 :: "+cores +"\nConjunto 2 :: "+cores2 +"\nConjunto 3 :: "+cores3);

        System.out.println("Conjunto 1 está vazio? "+cores.isEmpty());
        System.out.println("Conjunto 2 está vazio? "+cores.isEmpty());
        System.out.println("Conjunto 3 está vazio? "+cores.isEmpty());
        }
}
