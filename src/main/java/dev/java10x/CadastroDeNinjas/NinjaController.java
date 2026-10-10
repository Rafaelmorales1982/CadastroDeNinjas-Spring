package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Sempre utilizar essa anotações para o controlador
@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") // pegar informação
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
