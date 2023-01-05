package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.SeatRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;


@Controller
public class seatController {

    @Autowired
    SeatRepo seatRepo;

    @Autowired
    SeatService seatService;

    @GetMapping("/seats")
    public String seats(Model model) {

        //long deleteRows = seatRepo.deleteByStatus(false);



        model.addAttribute("userSeat", new BookSeat());
        model.addAttribute("filmName", "Avatar 02"); // use this on database
        model.addAttribute("listOfSeats", seatRepo.getAllRecords(1));
        model.addAttribute("listOfSeats2", seatRepo.getAllRecords(2));
        model.addAttribute("listOfSeats3", seatRepo.getAllRecords(3));
        model.addAttribute("listOfSeats4", seatRepo.getAllRecords(4));
        model.addAttribute("listOfSeats5", seatRepo.getAllRecords(5));
        model.addAttribute("listOfSeats6", seatRepo.getAllRecords(6));
        model.addAttribute("listOfSeats7", seatRepo.getAllRecords(7));
        model.addAttribute("listOfSeats8", seatRepo.getAllRecords(8));
        model.addAttribute("listOfSeats9", seatRepo.getAllRecords(9));
        model.addAttribute("listOfSeats10", seatRepo.getAllRecords(10));

        model.addAttribute("listOfSeats11", seatRepo.getAllRecords(11));
        model.addAttribute("listOfSeats12", seatRepo.getAllRecords(12));
        model.addAttribute("listOfSeats13", seatRepo.getAllRecords(13));
        model.addAttribute("listOfSeats14", seatRepo.getAllRecords(14));
        model.addAttribute("listOfSeats15", seatRepo.getAllRecords(15));
        model.addAttribute("listOfSeats16", seatRepo.getAllRecords(16));
        model.addAttribute("listOfSeats17", seatRepo.getAllRecords(17));
        model.addAttribute("listOfSeats18", seatRepo.getAllRecords(18));
        model.addAttribute("listOfSeats19", seatRepo.getAllRecords(19));
        model.addAttribute("listOfSeats20", seatRepo.getAllRecords(20));

        model.addAttribute("listOfSeats21", seatRepo.getAllRecords(21));
        model.addAttribute("listOfSeats22", seatRepo.getAllRecords(22));
        model.addAttribute("listOfSeats23", seatRepo.getAllRecords(23));
        model.addAttribute("listOfSeats24", seatRepo.getAllRecords(24));
        model.addAttribute("listOfSeats25", seatRepo.getAllRecords(25));
        model.addAttribute("listOfSeats26", seatRepo.getAllRecords(26));
        model.addAttribute("listOfSeats27", seatRepo.getAllRecords(27));
        model.addAttribute("listOfSeats28", seatRepo.getAllRecords(28));
        model.addAttribute("listOfSeats29", seatRepo.getAllRecords(29));
        model.addAttribute("listOfSeats30", seatRepo.getAllRecords(30));

        model.addAttribute("listOfSeats31", seatRepo.getAllRecords(31));
        model.addAttribute("listOfSeats32", seatRepo.getAllRecords(32));
        model.addAttribute("listOfSeats33", seatRepo.getAllRecords(33));
        model.addAttribute("listOfSeats34", seatRepo.getAllRecords(34));
        model.addAttribute("listOfSeats35", seatRepo.getAllRecords(35));
        model.addAttribute("listOfSeats36", seatRepo.getAllRecords(36));
        model.addAttribute("listOfSeats37", seatRepo.getAllRecords(37));
        model.addAttribute("listOfSeats38", seatRepo.getAllRecords(38));
        model.addAttribute("listOfSeats39", seatRepo.getAllRecords(39));
        model.addAttribute("listOfSeats40", seatRepo.getAllRecords(40));

        model.addAttribute("listOfSeats41", seatRepo.getAllRecords(41));
        model.addAttribute("listOfSeats42", seatRepo.getAllRecords(42));
        model.addAttribute("listOfSeats43", seatRepo.getAllRecords(43));
        model.addAttribute("listOfSeats44", seatRepo.getAllRecords(44));
        model.addAttribute("listOfSeats45", seatRepo.getAllRecords(45));
        model.addAttribute("listOfSeats46", seatRepo.getAllRecords(46));
        model.addAttribute("listOfSeats47", seatRepo.getAllRecords(47));
        model.addAttribute("listOfSeats48", seatRepo.getAllRecords(48));
        model.addAttribute("listOfSeats49", seatRepo.getAllRecords(49));
        model.addAttribute("listOfSeats50", seatRepo.getAllRecords(50));

        model.addAttribute("listOfSeats51", seatRepo.getAllRecords(51));
        model.addAttribute("listOfSeats52", seatRepo.getAllRecords(52));
        model.addAttribute("listOfSeats53", seatRepo.getAllRecords(53));
        model.addAttribute("listOfSeats54", seatRepo.getAllRecords(54));
        model.addAttribute("listOfSeats55", seatRepo.getAllRecords(55));
        model.addAttribute("listOfSeats56", seatRepo.getAllRecords(56));
        model.addAttribute("listOfSeats57", seatRepo.getAllRecords(57));
        model.addAttribute("listOfSeats58", seatRepo.getAllRecords(58));
        model.addAttribute("listOfSeats59", seatRepo.getAllRecords(59));
        model.addAttribute("listOfSeats60", seatRepo.getAllRecords(60));

        model.addAttribute("listOfSeats61", seatRepo.getAllRecords(61));
        model.addAttribute("listOfSeats62", seatRepo.getAllRecords(62));
        model.addAttribute("listOfSeats63", seatRepo.getAllRecords(63));
        model.addAttribute("listOfSeats64", seatRepo.getAllRecords(64));
        model.addAttribute("listOfSeats65", seatRepo.getAllRecords(65));
        model.addAttribute("listOfSeats66", seatRepo.getAllRecords(66));
        model.addAttribute("listOfSeats67", seatRepo.getAllRecords(67));
        model.addAttribute("listOfSeats68", seatRepo.getAllRecords(68));
        model.addAttribute("listOfSeats69", seatRepo.getAllRecords(69));
        model.addAttribute("listOfSeats70", seatRepo.getAllRecords(70));

        model.addAttribute("listOfSeats71", seatRepo.getAllRecords(71));
        model.addAttribute("listOfSeats72", seatRepo.getAllRecords(72));
        model.addAttribute("listOfSeats73", seatRepo.getAllRecords(73));
        model.addAttribute("listOfSeats74", seatRepo.getAllRecords(74));
        model.addAttribute("listOfSeats75", seatRepo.getAllRecords(75));
        model.addAttribute("listOfSeats76", seatRepo.getAllRecords(76));
        model.addAttribute("listOfSeats77", seatRepo.getAllRecords(77));
        model.addAttribute("listOfSeats78", seatRepo.getAllRecords(78));
        model.addAttribute("listOfSeats79", seatRepo.getAllRecords(79));
        model.addAttribute("listOfSeats80", seatRepo.getAllRecords(80));

        model.addAttribute("listOfSeats81", seatRepo.getAllRecords(81));
        model.addAttribute("listOfSeats82", seatRepo.getAllRecords(82));
        model.addAttribute("listOfSeats83", seatRepo.getAllRecords(83));
        model.addAttribute("listOfSeats84", seatRepo.getAllRecords(84));
        model.addAttribute("listOfSeats85", seatRepo.getAllRecords(85));
        model.addAttribute("listOfSeats86", seatRepo.getAllRecords(86));
        model.addAttribute("listOfSeats87", seatRepo.getAllRecords(87));
        model.addAttribute("listOfSeats88", seatRepo.getAllRecords(88));

        //model.addAttribute("filmName", deleteRows);




        return "seat";
    }

    @PostMapping("bookSeat")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model){

        Random rand = new Random(); //instance of random class
        int upperbound = 999999999;

        Seat seat01 = new Seat(rand.nextInt(upperbound),1,bookSeat.isSeat01(),1);
        Seat seat02 = new Seat(rand.nextInt(upperbound),2, bookSeat.isSeat02(), 1);
        Seat seat03 = new Seat(rand.nextInt(upperbound),3, bookSeat.isSeat03(),1 );
        Seat seat04 = new Seat(rand.nextInt(upperbound),4, bookSeat.isSeat04(),1 );
        Seat seat05 = new Seat(rand.nextInt(upperbound),5, bookSeat.isSeat05(),1 );
        Seat seat06 = new Seat(rand.nextInt(upperbound),6, bookSeat.isSeat06(),1 );
        Seat seat07 = new Seat(rand.nextInt(upperbound),7, bookSeat.isSeat07(),1 );
        Seat seat08 = new Seat(rand.nextInt(upperbound),8, bookSeat.isSeat08(),1 );
        Seat seat09 = new Seat(rand.nextInt(upperbound),9, bookSeat.isSeat09(),1 );
        Seat seat10 = new Seat(rand.nextInt(upperbound),10, bookSeat.isSeat10(),1 );

        Seat seat11 = new Seat(rand.nextInt(upperbound),11, bookSeat.isSeat11(), 1);
        Seat seat12 = new Seat(rand.nextInt(upperbound),12, bookSeat.isSeat12(), 1);
        Seat seat13 = new Seat(rand.nextInt(upperbound),13, bookSeat.isSeat13(),1 );
        Seat seat14 = new Seat(rand.nextInt(upperbound),14, bookSeat.isSeat14(),1 );
        Seat seat15 = new Seat(rand.nextInt(upperbound),15, bookSeat.isSeat15(),1 );
        Seat seat16 = new Seat(rand.nextInt(upperbound),16, bookSeat.isSeat16(),1 );
        Seat seat17 = new Seat(rand.nextInt(upperbound),17, bookSeat.isSeat17(),1 );
        Seat seat18 = new Seat(rand.nextInt(upperbound),18, bookSeat.isSeat18(),1 );
        Seat seat19 = new Seat(rand.nextInt(upperbound),19, bookSeat.isSeat19(),1 );
        Seat seat20 = new Seat(rand.nextInt(upperbound),20, bookSeat.isSeat20(),1 );

        Seat seat21 = new Seat(rand.nextInt(upperbound),21, bookSeat.isSeat21(), 1);
        Seat seat22 = new Seat(rand.nextInt(upperbound),22, bookSeat.isSeat22(), 1);
        Seat seat23 = new Seat(rand.nextInt(upperbound),23, bookSeat.isSeat23(),1 );
        Seat seat24 = new Seat(rand.nextInt(upperbound),24, bookSeat.isSeat24(),1 );
        Seat seat25 = new Seat(rand.nextInt(upperbound),25, bookSeat.isSeat25(),1 );
        Seat seat26 = new Seat(rand.nextInt(upperbound),26, bookSeat.isSeat26(),1 );
        Seat seat27 = new Seat(rand.nextInt(upperbound),27, bookSeat.isSeat27(),1 );
        Seat seat28 = new Seat(rand.nextInt(upperbound),28, bookSeat.isSeat28(),1 );
        Seat seat29 = new Seat(rand.nextInt(upperbound),29, bookSeat.isSeat29(),1 );
        Seat seat30 = new Seat(rand.nextInt(upperbound),30, bookSeat.isSeat30(),1 );

        Seat seat31 = new Seat(rand.nextInt(upperbound),31, bookSeat.isSeat31(), 1);
        Seat seat32 = new Seat(rand.nextInt(upperbound),32, bookSeat.isSeat32(), 1);
        Seat seat33 = new Seat(rand.nextInt(upperbound),33, bookSeat.isSeat33(),1 );
        Seat seat34 = new Seat(rand.nextInt(upperbound),34, bookSeat.isSeat34(),1 );
        Seat seat35 = new Seat(rand.nextInt(upperbound),35, bookSeat.isSeat35(),1 );
        Seat seat36 = new Seat(rand.nextInt(upperbound),36, bookSeat.isSeat36(),1 );
        Seat seat37 = new Seat(rand.nextInt(upperbound),37, bookSeat.isSeat37(),1 );
        Seat seat38 = new Seat(rand.nextInt(upperbound),38, bookSeat.isSeat38(),1 );
        Seat seat39 = new Seat(rand.nextInt(upperbound),39, bookSeat.isSeat39(),1 );
        Seat seat40 = new Seat(rand.nextInt(upperbound),40, bookSeat.isSeat40(),1 );

        Seat seat41 = new Seat(rand.nextInt(upperbound),41, bookSeat.isSeat41(), 1);
        Seat seat42 = new Seat(rand.nextInt(upperbound),42, bookSeat.isSeat42(), 1);
        Seat seat43 = new Seat(rand.nextInt(upperbound),43, bookSeat.isSeat43(),1 );
        Seat seat44 = new Seat(rand.nextInt(upperbound),44, bookSeat.isSeat44(),1 );
        Seat seat45 = new Seat(rand.nextInt(upperbound),45, bookSeat.isSeat45(),1 );
        Seat seat46 = new Seat(rand.nextInt(upperbound),46, bookSeat.isSeat46(),1 );
        Seat seat47 = new Seat(rand.nextInt(upperbound),47, bookSeat.isSeat47(),1 );
        Seat seat48 = new Seat(rand.nextInt(upperbound),48, bookSeat.isSeat48(),1 );
        Seat seat49 = new Seat(rand.nextInt(upperbound),49, bookSeat.isSeat49(),1 );
        Seat seat50 = new Seat(rand.nextInt(upperbound),50, bookSeat.isSeat50(),1 );

        Seat seat51 = new Seat(rand.nextInt(upperbound),51, bookSeat.isSeat51(), 1);
        Seat seat52 = new Seat(rand.nextInt(upperbound),52, bookSeat.isSeat52(), 1);
        Seat seat53 = new Seat(rand.nextInt(upperbound),53, bookSeat.isSeat53(),1 );
        Seat seat54 = new Seat(rand.nextInt(upperbound),54, bookSeat.isSeat54(),1 );
        Seat seat55 = new Seat(rand.nextInt(upperbound),55, bookSeat.isSeat55(),1 );
        Seat seat56 = new Seat(rand.nextInt(upperbound),56, bookSeat.isSeat56(),1 );
        Seat seat57 = new Seat(rand.nextInt(upperbound),57, bookSeat.isSeat57(),1 );
        Seat seat58 = new Seat(rand.nextInt(upperbound),58, bookSeat.isSeat58(),1 );
        Seat seat59 = new Seat(rand.nextInt(upperbound),59, bookSeat.isSeat59(),1 );
        Seat seat60 = new Seat(rand.nextInt(upperbound),60, bookSeat.isSeat60(),1 );

        Seat seat61 = new Seat(rand.nextInt(upperbound),61, bookSeat.isSeat61(), 1);
        Seat seat62 = new Seat(rand.nextInt(upperbound),62, bookSeat.isSeat62(), 1);
        Seat seat63 = new Seat(rand.nextInt(upperbound),63, bookSeat.isSeat63(),1 );
        Seat seat64 = new Seat(rand.nextInt(upperbound),64, bookSeat.isSeat64(),1 );
        Seat seat65 = new Seat(rand.nextInt(upperbound),65, bookSeat.isSeat65(),1 );
        Seat seat66 = new Seat(rand.nextInt(upperbound),66, bookSeat.isSeat66(),1 );
        Seat seat67 = new Seat(rand.nextInt(upperbound),67, bookSeat.isSeat67(),1 );
        Seat seat68 = new Seat(rand.nextInt(upperbound),68, bookSeat.isSeat68(),1 );
        Seat seat69 = new Seat(rand.nextInt(upperbound),69, bookSeat.isSeat69(),1 );
        Seat seat70 = new Seat(rand.nextInt(upperbound),70, bookSeat.isSeat70(),1 );

        Seat seat71 = new Seat(rand.nextInt(upperbound),71, bookSeat.isSeat71(), 1);
        Seat seat72 = new Seat(rand.nextInt(upperbound),72, bookSeat.isSeat72(), 1);
        Seat seat73 = new Seat(rand.nextInt(upperbound),73, bookSeat.isSeat73(),1 );
        Seat seat74 = new Seat(rand.nextInt(upperbound),74, bookSeat.isSeat74(),1 );
        Seat seat75 = new Seat(rand.nextInt(upperbound),75, bookSeat.isSeat75(),1 );
        Seat seat76 = new Seat(rand.nextInt(upperbound),76, bookSeat.isSeat76(),1 );
        Seat seat77 = new Seat(rand.nextInt(upperbound),77, bookSeat.isSeat77(),1 );
        Seat seat78 = new Seat(rand.nextInt(upperbound),78, bookSeat.isSeat78(),1 );
        Seat seat79 = new Seat(rand.nextInt(upperbound),79, bookSeat.isSeat79(),1 );
        Seat seat80 = new Seat(rand.nextInt(upperbound),80, bookSeat.isSeat80(),1 );

        Seat seat81 = new Seat(rand.nextInt(upperbound),81, bookSeat.isSeat81(), 1);
        Seat seat82 = new Seat(rand.nextInt(upperbound),82, bookSeat.isSeat82(), 1);
        Seat seat83 = new Seat(rand.nextInt(upperbound),83, bookSeat.isSeat83(),1 );
        Seat seat84 = new Seat(rand.nextInt(upperbound),84, bookSeat.isSeat84(),1 );
        Seat seat85 = new Seat(rand.nextInt(upperbound),85, bookSeat.isSeat85(),1 );
        Seat seat86 = new Seat(rand.nextInt(upperbound),86, bookSeat.isSeat86(),1 );
        Seat seat87 = new Seat(rand.nextInt(upperbound),87, bookSeat.isSeat87(),1 );
        Seat seat88 = new Seat(rand.nextInt(upperbound),88, bookSeat.isSeat88(),1 );



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


    @GetMapping({"/list", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", seatRepo.findAll());
        return mav;
    }
    @GetMapping("/lap")
    public ModelAndView readData () {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees",seatRepo.getAllRecords(1));
        return mav;

    }
}
