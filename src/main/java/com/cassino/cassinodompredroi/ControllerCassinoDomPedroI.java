package com.cassino.cassinodompredroi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerCassinoDomPedroI {
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(){
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(){
        return "login-page";
    }
}
