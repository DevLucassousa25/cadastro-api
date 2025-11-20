package dev.java10x.CadastroAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_endereco")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private int numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;


    // 🔥 RELACIONAMENTO MANY-TO-MANY (lado inverso)
    @ManyToMany(mappedBy = "enderecos")
    private Set<Pessoa> pessoas = new HashSet<>();

}
