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
        return  "cadastro API";
    }

    @GetMapping("/listar")
    public String exibir(){
        return "listar API";
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
