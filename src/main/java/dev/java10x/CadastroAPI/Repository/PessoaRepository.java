package dev.java10x.CadastroAPI.Repository;

import dev.java10x.CadastroAPI.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    Optional<Pessoa> findAllById(Long id);
}
