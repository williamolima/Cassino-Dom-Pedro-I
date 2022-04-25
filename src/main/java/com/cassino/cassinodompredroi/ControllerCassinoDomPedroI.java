package com.cassino.cassinodompredroi;

import com.cassino.cassinodompredroi.services.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ControllerCassinoDomPedroI {
   
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String getHomePage(){
        return "home";
    }

    @RequestMapping (value = "/authenticate", method = RequestMethod.POST)
    public String authUser(Auth credentials, RedirectAttributes attributes, ModelAndView modelAndView){
        //testa se as credenciais existem no banco de dados
        if(credentials.Authenticate()){
            return"redirect:/";
        }
        modelAndView.setViewName("redirect:/login");
        attributes.addFlashAttribute("loginError", "Login ou senha inválidos.");
        //se nao existir, ele vai retornar a pagina de login
        return"redirect:/login";
    }

    @RequestMapping ("/login")
    public String getLoginPage(Model model, @ModelAttribute("loginError") String loginError){
        model.addAttribute("auth", new Auth());
        model.addAttribute("loginError", loginError);
        return "login-page";
    }
}
