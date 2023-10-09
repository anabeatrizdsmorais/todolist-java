package br.com.anabeatriz.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota
public class MyFirstController {
    
    /**
      * Métodos de acesso do HTTP
      * GET - Buscar Informação
      * POST - Criar registro
      * PUT - Atualizar registro
      * DELETE - Deletar registro
      * PATH - Alterar uma parte da informação
    **/

    //Método (funcionalidade) de uma classe  
    @GetMapping("/primeiroMetodo")
    public String firstMessage() {
        return "Funcionou!";
    }
}
