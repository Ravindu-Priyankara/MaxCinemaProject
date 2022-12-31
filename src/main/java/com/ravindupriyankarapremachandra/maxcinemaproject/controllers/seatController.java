package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class seatController {

    @GetMapping("/seats")
    public String seats(Model model){
        model.addAttribute("userSeat",new BookSeat());
        model.addAttribute("filmName","Avatar 02"); // use this on database
        model.addAttribute("seat01","booked");

        return "seat";
    }
    @PostMapping("bookseat")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model){
        if(bookSeat.isSeat01()){
            System.out.println("yes");
        }
        model.addAttribute("userSeat",new BookSeat());
        return "seat";
    }
}
