package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.dto.seatDTO;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.SeatRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class seatController {

    @Autowired
    SeatRepo seatRepo;

    @Autowired
    private SeatService seatService;

    @GetMapping("/seats")
    public String seats(Model model) {
        model.addAttribute("userSeat", new BookSeat());
        model.addAttribute("filmName", "Avatar 02"); // use this on database
        model.addAttribute("seat01", "not booked");
        model.addAttribute("seat02", "not booked");

        return "seat";
    }

    /*@PostMapping("bookSeat")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model) {
        System.out.println();

        model.addAttribute("userSeat",new BookSeat());
        return "seat";
    }*/
    @PostMapping("bookSeat")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model){

        Seat seat01 = new Seat(1, bookSeat.isSeat01(), 1);
        Seat seat02 = new Seat(2, bookSeat.isSeat02(), 1);
        Seat seat03 = new Seat(3, bookSeat.isSeat03(),1 );
        Seat seat04 = new Seat(4, bookSeat.isSeat04(),1 );
        Seat seat05 = new Seat(5, bookSeat.isSeat05(),1 );
        Seat seat06 = new Seat(6, bookSeat.isSeat06(),1 );
        Seat seat07 = new Seat(7, bookSeat.isSeat07(),1 );
        Seat seat08 = new Seat(8, bookSeat.isSeat08(),1 );
        Seat seat09 = new Seat(9, bookSeat.isSeat09(),1 );
        Seat seat10 = new Seat(10, bookSeat.isSeat10(),1 );

        Seat seat11 = new Seat(11, bookSeat.isSeat11(), 1);
        Seat seat12 = new Seat(12, bookSeat.isSeat12(), 1);
        Seat seat13 = new Seat(13, bookSeat.isSeat13(),1 );
        Seat seat14 = new Seat(14, bookSeat.isSeat14(),1 );
        Seat seat15 = new Seat(15, bookSeat.isSeat15(),1 );
        Seat seat16 = new Seat(16, bookSeat.isSeat16(),1 );
        Seat seat17 = new Seat(17, bookSeat.isSeat17(),1 );
        Seat seat18 = new Seat(18, bookSeat.isSeat18(),1 );
        Seat seat19 = new Seat(19, bookSeat.isSeat19(),1 );
        Seat seat20 = new Seat(20, bookSeat.isSeat20(),1 );

        Seat seat21 = new Seat(21, bookSeat.isSeat21(), 1);
        Seat seat22 = new Seat(22, bookSeat.isSeat22(), 1);
        Seat seat23 = new Seat(23, bookSeat.isSeat23(),1 );
        Seat seat24 = new Seat(24, bookSeat.isSeat24(),1 );
        Seat seat25 = new Seat(25, bookSeat.isSeat25(),1 );
        Seat seat26 = new Seat(26, bookSeat.isSeat26(),1 );
        Seat seat27 = new Seat(27, bookSeat.isSeat27(),1 );
        Seat seat28 = new Seat(28, bookSeat.isSeat28(),1 );
        Seat seat29 = new Seat(29, bookSeat.isSeat29(),1 );
        Seat seat30 = new Seat(30, bookSeat.isSeat30(),1 );

        Seat seat31 = new Seat(31, bookSeat.isSeat31(), 1);
        Seat seat32 = new Seat(32, bookSeat.isSeat32(), 1);
        Seat seat33 = new Seat(33, bookSeat.isSeat33(),1 );
        Seat seat34 = new Seat(34, bookSeat.isSeat34(),1 );
        Seat seat35 = new Seat(35, bookSeat.isSeat35(),1 );
        Seat seat36 = new Seat(36, bookSeat.isSeat36(),1 );
        Seat seat37 = new Seat(37, bookSeat.isSeat37(),1 );
        Seat seat38 = new Seat(38, bookSeat.isSeat38(),1 );
        Seat seat39 = new Seat(39, bookSeat.isSeat39(),1 );
        Seat seat40 = new Seat(40, bookSeat.isSeat40(),1 );

        Seat seat41 = new Seat(41, bookSeat.isSeat41(), 1);
        Seat seat42 = new Seat(42, bookSeat.isSeat42(), 1);
        Seat seat43 = new Seat(43, bookSeat.isSeat43(),1 );
        Seat seat44 = new Seat(44, bookSeat.isSeat44(),1 );
        Seat seat45 = new Seat(45, bookSeat.isSeat45(),1 );
        Seat seat46 = new Seat(46, bookSeat.isSeat46(),1 );
        Seat seat47 = new Seat(47, bookSeat.isSeat47(),1 );
        Seat seat48 = new Seat(48, bookSeat.isSeat48(),1 );
        Seat seat49 = new Seat(49, bookSeat.isSeat49(),1 );
        Seat seat50 = new Seat(50, bookSeat.isSeat50(),1 );

        Seat seat51 = new Seat(51, bookSeat.isSeat51(), 1);
        Seat seat52 = new Seat(52, bookSeat.isSeat52(), 1);
        Seat seat53 = new Seat(53, bookSeat.isSeat53(),1 );
        Seat seat54 = new Seat(54, bookSeat.isSeat54(),1 );
        Seat seat55 = new Seat(55, bookSeat.isSeat55(),1 );
        Seat seat56 = new Seat(56, bookSeat.isSeat56(),1 );
        Seat seat57 = new Seat(57, bookSeat.isSeat57(),1 );
        Seat seat58 = new Seat(58, bookSeat.isSeat58(),1 );
        Seat seat59 = new Seat(59, bookSeat.isSeat59(),1 );
        Seat seat60 = new Seat(60, bookSeat.isSeat60(),1 );

        Seat seat61 = new Seat(61, bookSeat.isSeat61(), 1);
        Seat seat62 = new Seat(62, bookSeat.isSeat62(), 1);
        Seat seat63 = new Seat(63, bookSeat.isSeat63(),1 );
        Seat seat64 = new Seat(64, bookSeat.isSeat64(),1 );
        Seat seat65 = new Seat(65, bookSeat.isSeat65(),1 );
        Seat seat66 = new Seat(66, bookSeat.isSeat66(),1 );
        Seat seat67 = new Seat(67, bookSeat.isSeat67(),1 );
        Seat seat68 = new Seat(68, bookSeat.isSeat68(),1 );
        Seat seat69 = new Seat(69, bookSeat.isSeat69(),1 );
        Seat seat70 = new Seat(70, bookSeat.isSeat70(),1 );

        Seat seat71 = new Seat(71, bookSeat.isSeat71(), 1);
        Seat seat72 = new Seat(72, bookSeat.isSeat72(), 1);
        Seat seat73 = new Seat(73, bookSeat.isSeat73(),1 );
        Seat seat74 = new Seat(74, bookSeat.isSeat74(),1 );
        Seat seat75 = new Seat(75, bookSeat.isSeat75(),1 );
        Seat seat76 = new Seat(76, bookSeat.isSeat76(),1 );
        Seat seat77 = new Seat(77, bookSeat.isSeat77(),1 );
        Seat seat78 = new Seat(78, bookSeat.isSeat78(),1 );
        Seat seat79 = new Seat(79, bookSeat.isSeat79(),1 );
        Seat seat80 = new Seat(80, bookSeat.isSeat80(),1 );

        Seat seat81 = new Seat(81, bookSeat.isSeat81(), 1);
        Seat seat82 = new Seat(82, bookSeat.isSeat82(), 1);
        Seat seat83 = new Seat(83, bookSeat.isSeat83(),1 );
        Seat seat84 = new Seat(84, bookSeat.isSeat84(),1 );
        Seat seat85 = new Seat(85, bookSeat.isSeat85(),1 );
        Seat seat86 = new Seat(86, bookSeat.isSeat86(),1 );
        Seat seat87 = new Seat(87, bookSeat.isSeat87(),1 );
        Seat seat88 = new Seat(88, bookSeat.isSeat88(),1 );



        seatRepo.save(seat01);
        seatRepo.save(seat02);
        seatRepo.save(seat03);
        seatRepo.save(seat04);
        seatRepo.save(seat05);
        seatRepo.save(seat06);
        seatRepo.save(seat07);
        seatRepo.save(seat08);
        seatRepo.save(seat09);
        seatRepo.save(seat10);

        seatRepo.save(seat11);
        seatRepo.save(seat12);
        seatRepo.save(seat13);
        seatRepo.save(seat14);
        seatRepo.save(seat15);
        seatRepo.save(seat16);
        seatRepo.save(seat17);
        seatRepo.save(seat18);
        seatRepo.save(seat19);
        seatRepo.save(seat20);

        seatRepo.save(seat21);
        seatRepo.save(seat22);
        seatRepo.save(seat23);
        seatRepo.save(seat24);
        seatRepo.save(seat25);
        seatRepo.save(seat26);
        seatRepo.save(seat27);
        seatRepo.save(seat28);
        seatRepo.save(seat29);
        seatRepo.save(seat30);

        seatRepo.save(seat31);
        seatRepo.save(seat32);
        seatRepo.save(seat33);
        seatRepo.save(seat34);
        seatRepo.save(seat35);
        seatRepo.save(seat36);
        seatRepo.save(seat37);
        seatRepo.save(seat38);
        seatRepo.save(seat39);
        seatRepo.save(seat40);

        seatRepo.save(seat41);
        seatRepo.save(seat42);
        seatRepo.save(seat43);
        seatRepo.save(seat44);
        seatRepo.save(seat45);
        seatRepo.save(seat46);
        seatRepo.save(seat47);
        seatRepo.save(seat48);
        seatRepo.save(seat49);
        seatRepo.save(seat50);

        seatRepo.save(seat51);
        seatRepo.save(seat52);
        seatRepo.save(seat53);
        seatRepo.save(seat54);
        seatRepo.save(seat55);
        seatRepo.save(seat56);
        seatRepo.save(seat57);
        seatRepo.save(seat58);
        seatRepo.save(seat59);
        seatRepo.save(seat60);

        seatRepo.save(seat61);
        seatRepo.save(seat62);
        seatRepo.save(seat63);
        seatRepo.save(seat64);
        seatRepo.save(seat65);
        seatRepo.save(seat66);
        seatRepo.save(seat67);
        seatRepo.save(seat68);
        seatRepo.save(seat69);
        seatRepo.save(seat70);

        seatRepo.save(seat71);
        seatRepo.save(seat72);
        seatRepo.save(seat73);
        seatRepo.save(seat74);
        seatRepo.save(seat75);
        seatRepo.save(seat76);
        seatRepo.save(seat77);
        seatRepo.save(seat78);
        seatRepo.save(seat79);
        seatRepo.save(seat80);

        seatRepo.save(seat81);
        seatRepo.save(seat82);
        seatRepo.save(seat83);
        seatRepo.save(seat84);
        seatRepo.save(seat85);
        seatRepo.save(seat86);
        seatRepo.save(seat87);
        seatRepo.save(seat88);


        model.addAttribute("userSeat",new BookSeat());
        return "seat";
    }

   @GetMapping("check/")
    public String findBySeat_id(Model model){
       seatService.findBySeat_id();
       model.addAttribute("userSeat",new BookSeat());
       return "seat";
   }
}