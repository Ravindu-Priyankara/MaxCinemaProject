package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    MovieRepo movieRepo;

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("Movies",movieRepo.getAllById(1));
        mav.addObject("Movies2",movieRepo.getAllById(2));
        mav.addObject("Movies3",movieRepo.getAllById(3));
        mav.addObject("Movies4",movieRepo.getAllById(4));
        mav.addObject("Movies5",movieRepo.getAllById(5));
        mav.addObject("Movies6",movieRepo.getAllById(6));
        mav.addObject("Movies7",movieRepo.getAllById(7));
        mav.addObject("Movies8",movieRepo.getAllById(8));
        mav.addObject("Movies9",movieRepo.getAllById(9));
        return mav;
    }
    @GetMapping("/pai")
    public String pai(){
        return "payment";
    }
}
