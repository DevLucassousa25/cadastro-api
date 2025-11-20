package dev.java10x.CadastroAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PessoaController {

    @GetMapping("/home")
    public String boasVindas(){
        return "Essa é minha primeira mensagem dessa api";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return  "Cadastro API";
    }

    @GetMapping("/exibir")
    public String exibir(){
        return "Exibir API";
    }

    @GetMapping("/exibir/id")
    public String exibirId(){
        return "Exibir ID";
    }

    @PutMapping("/atualizar/id")
    public String atualizar(){
        return "Atualizar API";
    }

    @DeleteMapping("/deletar/id")
    public String deletar(){
        return "Deletar API";
    }
}
