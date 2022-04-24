package com.IFPB.Pweb2.cassinoDomPedroI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CassinoDomPedroI {
   
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    // public String getHomePage(){
    //     return "home";
    // }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(){
        return "login-page";
    }
}
