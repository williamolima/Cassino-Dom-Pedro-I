package com.cassinodompedro.Controller;

import com.cassinodompedro.Auth.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {


    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String LoginController(Login login, Model model){
        
        String email = login.getEmail();
        String senha = login.getEmail();
        
        //logica de validação usando model aqui

        return "login-page";
    }
}
