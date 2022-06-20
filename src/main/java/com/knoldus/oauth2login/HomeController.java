package com.knoldus.oauth2login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @GetMapping
    public String getHome(){
        return "index";
    }
}
