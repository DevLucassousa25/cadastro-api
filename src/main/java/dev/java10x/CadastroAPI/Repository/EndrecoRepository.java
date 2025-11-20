package dev.java10x.CadastroAPI.Repository;

import dev.java10x.CadastroAPI.Model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndrecoRepository extends JpaRepository<Endereco,Long> {
}
