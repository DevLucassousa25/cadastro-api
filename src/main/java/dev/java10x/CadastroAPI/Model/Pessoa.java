package dev.java10x.CadastroAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "sobrenome")
    private  String sobrenome;

    @Column(unique = true, name = "cpf")
    private  String cpf;

    @Column(unique = true, name = "rg")
    private  String rg;

    @Column(name = "genero")
    private  String genero;

    @Column(unique = true, name = "email")
    private  String email;

    @Column(name = "telefone")
    private  String telefone;

    // 🔥 RELACIONAMENTO MANY-TO-MANY
    @ManyToMany
    @JoinTable(
            name = "tb_pessoa_endereco",
            joinColumns = @JoinColumn(name = "pessoa_id"),
            inverseJoinColumns = @JoinColumn(name = "endereco_id")
    )
    private Set<Endereco> enderecos = new HashSet<>();
}
