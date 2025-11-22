package dev.java10x.CadastroAPI.Service;

import dev.java10x.CadastroAPI.Model.Pessoa;
import dev.java10x.CadastroAPI.Repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> exibirPessoas(){
       return repository.findAll();
    }

    public Pessoa buscarPessoaPorId(Long id){
        Optional<Pessoa> p = repository.findAllById(id);
        return p.orElse(null);
    }

    public Pessoa cadastro(Pessoa p){
        return repository.save(p);
    }


    public Pessoa atualizar(Pessoa p, Long id){
       if(repository.existsById(id)){
           p.setId(id);
           return repository.save(p);
       }

       return null;
    }

    public void delete(Long id){
         repository.deleteById(id);
    }
}
