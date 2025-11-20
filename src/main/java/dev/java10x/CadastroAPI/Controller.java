package dev.java10x.CadastroAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/home")
    public String boasVindas(){
        return "Essa é minha primeira mensagem dessa api";
    }
}
