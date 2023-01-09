package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.dto.UserDTO;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Users;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.CheckUsers;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.GetUsers;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.UserRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;
import java.util.Random;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("checking",new CheckUsers());
        return "login";
    }

    @GetMapping("/register")
    public String register( Model model){
        model.addAttribute("userData",new GetUsers());
        return "register";
    }

    @PostMapping("/register_user")
    public String register_users(@ModelAttribute GetUsers getUsers, Model model){
        Random rand = new Random(); //generate random number
        int upperBound = 999999999;
        int rand_number = rand.nextInt(upperBound);


        try {
            if (Objects.equals(getUsers.getPassword(), getUsers.getRetypePassword())) {
                Users users = new Users(rand_number, getUsers.getUsername(), getUsers.getPassword(), getUsers.getPhNumber());
                userRepo.save(users);
            }
        }catch (Exception e){
            System.out.println(e); //use this exception for stop crash a program
        }
        model.addAttribute("checking",new CheckUsers());
        return "login";
    }

    @PostMapping("/checkUser")
    public String checkUsers(@ModelAttribute CheckUsers checkUsers){
        if(Objects.equals(checkUsers.getPassword(), userRepo.pass(checkUsers.getUsername()))){
            System.out.println("login success");
        }
        else{
            System.out.println("login not success");
        }
        return "";
    }
}
