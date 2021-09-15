package one.digitalinnovation.GerenciamentoDePessoas.repositorio;

import  one.digitalinnovation.GerenciamentoDePessoas.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPessoa  extends JpaRepository<Pessoa, Long> {
}
