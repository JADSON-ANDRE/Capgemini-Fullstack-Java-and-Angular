package Collections.Set;

import java.util.*;

/*Crie um conjunto com 3 linguagens (NOME, ANO DE CRIAÇÃO e IDE), e faça
    um programa que ordene esse conjunto por:
        A. Ordem de inserção;
        B. Ordem natural (NOME);
        C. IDE;
        D. Ano de criação e nome;
        E. Nome, ano de criação e IDE.
     Por fim, liste as linguagens uma abaixo da outra.  */
    // Python (1990), Java (1991) e Ruby (1995)
    // PyCharm, IntelliJ e RubyMine

public class LinguagemFavorita {
        public static void main(String[] args) {
            Set<Linguagens> linguagensFavoritas = new HashSet<>();
            linguagensFavoritas.add(new Linguagens("Python", 1990, "Pycharm"));
            linguagensFavoritas.add(new Linguagens("Java", 1991, "IntelliJ"));
            linguagensFavoritas.add(new Linguagens("Ruby", 1995, "RubyMine"));

            System.out.println(" #### Linguagens de Programação #### ");
            Set<Linguagens> lingFav = new LinkedHashSet<>(
                    Arrays.asList(new Linguagens("Python", 1990, "Python"),
                                  new Linguagens("Java", 1991, "IntelliJ"),
                                  new Linguagens("Ruby", 1995, "RubyMine")
                    )
            );
            System.out.println("\nOrdem de inserção ::");
            for (Linguagens linguagem : lingFav) System.out.println(linguagem);

            Set<Linguagens> lingFav1 = new TreeSet<>(linguagensFavoritas);
            for (Linguagens linguagem : lingFav1) System.out.println("Ordem natural ::"+linguagem);
        }
}

class Linguagens {
    String nome;
    Integer ano;
    String IDE;

    public Linguagens(String nome, Integer ano, String IDE) {
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "Linguagens{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagens that = (Linguagens) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ano, that.ano) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, IDE);
    }
}
