package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookiesController {

    @GetMapping("/check_cookies")
    public String check_cookies(@CookieValue(value = "USERNAME")String username){
        if (username != null){
            System.out.println(username);
            return "redirect:http://127.0.0.1:8080/seats";
        }
        return "redirect:http://127.0.0.1:8080/login";

    }
}
