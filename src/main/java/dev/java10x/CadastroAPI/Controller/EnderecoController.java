package dev.java10x.CadastroAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

    @GetMapping("/listar")
    public String listar(){
        return "Listar endereco API";
    }

    @PostMapping("/cadastro")
    public String cadastro(){
        return "cadastro endereco API";
    }

    @PutMapping("/alterar")
    public String alterar(){
        return "alterar endereco API";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "delete endereco API";
    }
}
