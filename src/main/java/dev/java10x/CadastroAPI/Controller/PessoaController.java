package dev.java10x.CadastroAPI.Controller;

import dev.java10x.CadastroAPI.Model.Pessoa;
import dev.java10x.CadastroAPI.Service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/home")
    public String boasVindas(){
        return "Essa é minha primeira mensagem dessa api";
    }

    @GetMapping("/listar")
    public List<Pessoa> exibir(){
        return pessoaService.exibirPessoas();
    }

    @GetMapping("/listar/{id}")
    public Pessoa listarById(@PathVariable Long id){
        return pessoaService.buscarPessoaPorId(id);
    }


    @PostMapping("/cadastro")
    public Pessoa cadastro(@RequestBody Pessoa p){
        return pessoaService.cadastro(p);
    }

    @PutMapping("/alterar/{id}")
    public Pessoa atualizar(@PathVariable Long id, @RequestBody Pessoa p){
        return pessoaService.atualizar(p, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletar(@PathVariable Long id){
        pessoaService.delete(id);
    }
}
