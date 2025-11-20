package dev.java10x.CadastroAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoaController {

    @GetMapping("/home")
    public String boasVindas(){
        return "Essa é minha primeira mensagem dessa api";
    }
}
