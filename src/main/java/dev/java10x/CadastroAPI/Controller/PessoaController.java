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


    @GetMapping("/cadastro")
    public String cadastro(){
        return  "cadastro API";
    }

    @PutMapping("/alterar")
    public String atualizar(){
        return "alterar API";
    }

    @DeleteMapping("/delete")
    public String deletar(){
        return "delete API";
    }
}
