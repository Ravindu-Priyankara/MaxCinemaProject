package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.dto.seatDTO;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class seatController {
    @Autowired
    private SeatService seatService;


    @GetMapping("/seats")
    public String seats(Model model){
        model.addAttribute("userSeat",new BookSeat());
        model.addAttribute("filmName","Avatar 02"); // use this on database
        model.addAttribute("seat01","not booked");

        return "seat";
    }
    @PostMapping("bookseat")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model, seatDTO seatDto){

        if(bookSeat.isSeat01()){
            //return "seatService.bookSeat(seatDto);";
            //System.out.println("yes");//
            /*seatDto.setSeat_id(1);
            seatDto.setStatus(true);
            seatDto.setUser_id(1);

            seatService.bookSeat(seatDto);*/
            return "http://127.0.0.1:8080/insert/1/true/1";
        }
        /*model.addAttribute("userSeat",new BookSeat());*/
        return "seat";
    }

    @PostMapping("tests")
    public seatDTO getit(@RequestBody seatDTO seatDto){
        return seatService.bookSeat(seatDto);
    }

    @GetMapping("/insert/{seat_id}/{status}/{user_id}")
    public String insertSeat(@PathVariable int seat_id,@PathVariable boolean status, @PathVariable int user_id){
        seatService.insertSeat(seat_id,status,user_id);
        return "done";
    }


}
