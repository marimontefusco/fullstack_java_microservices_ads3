package com.itau.cadastralpfms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ele importa os CRUDs
@RequestMapping("/api/cadastro/v1") //endpoint mãe
public class Controller {

    @GetMapping("/home")
    public String helloWorld()  {
        return "hello";
    }

    // roda aplicação
    // depois no navegador -> http://localhost:8087/api/cadastro/v1/home

}


//Controller -> onde ficam os endpoints