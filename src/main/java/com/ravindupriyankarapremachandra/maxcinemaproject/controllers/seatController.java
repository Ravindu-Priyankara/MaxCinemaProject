package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.SeatRepo;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


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

        if(bookSeat.isSeat01()){
            Seat seat01 = new Seat(1, bookSeat.isSeat01(), 1);
            seatRepo.save(seat01);
        }
        if(bookSeat.isSeat02()){
            Seat seat02 = new Seat(2, bookSeat.isSeat02(), 1);
            seatRepo.save(seat02);
        }

        if(bookSeat.isSeat03()){
            Seat seat03 = new Seat(3, bookSeat.isSeat03(), 1);
            seatRepo.save(seat03);
        }

        if(bookSeat.isSeat04()){
            Seat seat04 = new Seat(4, bookSeat.isSeat04(), 1);
            seatRepo.save(seat04);
        }

        if(bookSeat.isSeat05()){
            Seat seat05 = new Seat(5, bookSeat.isSeat05(), 1);
            seatRepo.save(seat05);
        }

        if(bookSeat.isSeat06()){
            Seat seat06 = new Seat(6, bookSeat.isSeat06(), 1);
            seatRepo.save(seat06);
        }

        if(bookSeat.isSeat07()){
            Seat seat07 = new Seat(7, bookSeat.isSeat07(), 1);
            seatRepo.save(seat07);
        }

        if(bookSeat.isSeat08()){
            Seat seat08 = new Seat(8, bookSeat.isSeat08(), 1);
            seatRepo.save(seat08);
        }

        if(bookSeat.isSeat09()){
            Seat seat09 = new Seat(9, bookSeat.isSeat09(), 1);
            seatRepo.save(seat09);
        }

        if(bookSeat.isSeat10()){
            Seat seat10 = new Seat(10, bookSeat.isSeat10(), 1);
            seatRepo.save(seat10);
        }

        if(bookSeat.isSeat11()){
            Seat seat11 = new Seat(11, bookSeat.isSeat11(), 1);
            seatRepo.save(seat11);
        }
        if(bookSeat.isSeat12()){
            Seat seat12 = new Seat(12, bookSeat.isSeat12(), 1);
            seatRepo.save(seat12);
        }

        if(bookSeat.isSeat13()){
            Seat seat13 = new Seat(13, bookSeat.isSeat13(), 1);
            seatRepo.save(seat13);
        }

        if(bookSeat.isSeat14()){
            Seat seat14 = new Seat(14, bookSeat.isSeat14(), 1);
            seatRepo.save(seat14);
        }

        if(bookSeat.isSeat15()){
            Seat seat15 = new Seat(15, bookSeat.isSeat15(), 1);
            seatRepo.save(seat15);
        }

        if(bookSeat.isSeat16()){
            Seat seat16 = new Seat(16, bookSeat.isSeat16(), 1);
            seatRepo.save(seat16);
        }

        if(bookSeat.isSeat17()){
            Seat seat17 = new Seat(17, bookSeat.isSeat17(), 1);
            seatRepo.save(seat17);
        }

        if(bookSeat.isSeat18()){
            Seat seat18 = new Seat(18, bookSeat.isSeat18(), 1);
            seatRepo.save(seat18);
        }

        if(bookSeat.isSeat19()){
            Seat seat19 = new Seat(19, bookSeat.isSeat19(), 1);
            seatRepo.save(seat19);
        }

        if(bookSeat.isSeat20()){
            Seat seat20 = new Seat(20, bookSeat.isSeat20(), 1);
            seatRepo.save(seat20);
        }

        if(bookSeat.isSeat21()){
            Seat seat21 = new Seat(21, bookSeat.isSeat21(), 1);
            seatRepo.save(seat21);
        }
        if(bookSeat.isSeat22()){
            Seat seat22 = new Seat(22, bookSeat.isSeat22(), 1);
            seatRepo.save(seat22);
        }

        if(bookSeat.isSeat23()){
            Seat seat23 = new Seat(23, bookSeat.isSeat23(), 1);
            seatRepo.save(seat23);
        }

        if(bookSeat.isSeat24()){
            Seat seat24 = new Seat(24, bookSeat.isSeat24(), 1);
            seatRepo.save(seat24);
        }

        if(bookSeat.isSeat25()){
            Seat seat25 = new Seat(25, bookSeat.isSeat25(), 1);
            seatRepo.save(seat25);
        }

        if(bookSeat.isSeat26()){
            Seat seat26 = new Seat(26, bookSeat.isSeat26(), 1);
            seatRepo.save(seat26);
        }

        if(bookSeat.isSeat27()){
            Seat seat27 = new Seat(27, bookSeat.isSeat27(), 1);
            seatRepo.save(seat27);
        }

        if(bookSeat.isSeat28()){
            Seat seat28 = new Seat(28, bookSeat.isSeat28(), 1);
            seatRepo.save(seat28);
        }

        if(bookSeat.isSeat29()){
            Seat seat29 = new Seat(29, bookSeat.isSeat29(), 1);
            seatRepo.save(seat29);
        }

        if(bookSeat.isSeat30()){
            Seat seat30 = new Seat(30, bookSeat.isSeat30(), 1);
            seatRepo.save(seat30);
        }

        if(bookSeat.isSeat31()){
            Seat seat31 = new Seat(31, bookSeat.isSeat31(), 1);
            seatRepo.save(seat31);
        }
        if(bookSeat.isSeat32()){
            Seat seat32 = new Seat(32, bookSeat.isSeat32(), 1);
            seatRepo.save(seat32);
        }

        if(bookSeat.isSeat33()){
            Seat seat33 = new Seat(33, bookSeat.isSeat33(), 1);
            seatRepo.save(seat33);
        }

        if(bookSeat.isSeat34()){
            Seat seat34 = new Seat(34, bookSeat.isSeat34(), 1);
            seatRepo.save(seat34);
        }

        if(bookSeat.isSeat35()){
            Seat seat35 = new Seat(35, bookSeat.isSeat35(), 1);
            seatRepo.save(seat35);
        }

        if(bookSeat.isSeat36()){
            Seat seat36 = new Seat(36, bookSeat.isSeat36(), 1);
            seatRepo.save(seat36);
        }

        if(bookSeat.isSeat37()){
            Seat seat37 = new Seat(37, bookSeat.isSeat37(), 1);
            seatRepo.save(seat37);
        }

        if(bookSeat.isSeat38()){
            Seat seat38 = new Seat(38, bookSeat.isSeat38(), 1);
            seatRepo.save(seat38);
        }

        if(bookSeat.isSeat39()){
            Seat seat39 = new Seat(39, bookSeat.isSeat39(), 1);
            seatRepo.save(seat39);
        }

        if(bookSeat.isSeat40()){
            Seat seat40 = new Seat(40, bookSeat.isSeat40(), 1);
            seatRepo.save(seat40);
        }

        if(bookSeat.isSeat41()){
            Seat seat41 = new Seat(41, bookSeat.isSeat41(), 1);
            seatRepo.save(seat41);
        }
        if(bookSeat.isSeat42()){
            Seat seat42 = new Seat(42, bookSeat.isSeat42(), 1);
            seatRepo.save(seat42);
        }

        if(bookSeat.isSeat43()){
            Seat seat43 = new Seat(43, bookSeat.isSeat43(), 1);
            seatRepo.save(seat43);
        }

        if(bookSeat.isSeat44()){
            Seat seat44 = new Seat(44, bookSeat.isSeat44(), 1);
            seatRepo.save(seat44);
        }

        if(bookSeat.isSeat45()){
            Seat seat45 = new Seat(45, bookSeat.isSeat45(), 1);
            seatRepo.save(seat45);
        }

        if(bookSeat.isSeat46()){
            Seat seat46 = new Seat(46, bookSeat.isSeat46(), 1);
            seatRepo.save(seat46);
        }

        if(bookSeat.isSeat47()){
            Seat seat47 = new Seat(47, bookSeat.isSeat47(), 1);
            seatRepo.save(seat47);
        }

        if(bookSeat.isSeat48()){
            Seat seat48 = new Seat(48, bookSeat.isSeat48(), 1);
            seatRepo.save(seat48);
        }

        if(bookSeat.isSeat49()){
            Seat seat49 = new Seat(49, bookSeat.isSeat49(), 1);
            seatRepo.save(seat49);
        }

        if(bookSeat.isSeat50()){
            Seat seat50 = new Seat(50, bookSeat.isSeat50(), 1);
            seatRepo.save(seat50);
        }

        if(bookSeat.isSeat51()){
            Seat seat51 = new Seat(51, bookSeat.isSeat51(), 1);
            seatRepo.save(seat51);
        }
        if(bookSeat.isSeat52()){
            Seat seat52 = new Seat(52, bookSeat.isSeat52(), 1);
            seatRepo.save(seat52);
        }

        if(bookSeat.isSeat53()){
            Seat seat53 = new Seat(53, bookSeat.isSeat53(), 1);
            seatRepo.save(seat53);
        }

        if(bookSeat.isSeat54()){
            Seat seat54 = new Seat(54, bookSeat.isSeat54(), 1);
            seatRepo.save(seat54);
        }

        if(bookSeat.isSeat55()){
            Seat seat55 = new Seat(55, bookSeat.isSeat55(), 1);
            seatRepo.save(seat55);
        }

        if(bookSeat.isSeat56()){
            Seat seat56 = new Seat(56, bookSeat.isSeat56(), 1);
            seatRepo.save(seat56);
        }

        if(bookSeat.isSeat57()){
            Seat seat57 = new Seat(57, bookSeat.isSeat57(), 1);
            seatRepo.save(seat57);
        }

        if(bookSeat.isSeat58()){
            Seat seat58 = new Seat(58, bookSeat.isSeat58(), 1);
            seatRepo.save(seat58);
        }

        if(bookSeat.isSeat59()){
            Seat seat59 = new Seat(59, bookSeat.isSeat59(), 1);
            seatRepo.save(seat59);
        }

        if(bookSeat.isSeat60()){
            Seat seat60 = new Seat(60, bookSeat.isSeat60(), 1);
            seatRepo.save(seat60);
        }

        if(bookSeat.isSeat61()){
            Seat seat61 = new Seat(61, bookSeat.isSeat61(), 1);
            seatRepo.save(seat61);
        }
        if(bookSeat.isSeat62()){
            Seat seat62 = new Seat(62, bookSeat.isSeat62(), 1);
            seatRepo.save(seat62);
        }

        if(bookSeat.isSeat63()){
            Seat seat63 = new Seat(63, bookSeat.isSeat63(), 1);
            seatRepo.save(seat63);
        }

        if(bookSeat.isSeat64()){
            Seat seat64 = new Seat(64, bookSeat.isSeat64(), 1);
            seatRepo.save(seat64);
        }

        if(bookSeat.isSeat65()){
            Seat seat65 = new Seat(65, bookSeat.isSeat65(), 1);
            seatRepo.save(seat65);
        }

        if(bookSeat.isSeat66()){
            Seat seat66 = new Seat(66, bookSeat.isSeat66(), 1);
            seatRepo.save(seat66);
        }

        if(bookSeat.isSeat67()){
            Seat seat67 = new Seat(67, bookSeat.isSeat67(), 1);
            seatRepo.save(seat67);
        }

        if(bookSeat.isSeat68()){
            Seat seat68 = new Seat(68, bookSeat.isSeat68(), 1);
            seatRepo.save(seat68);
        }

        if(bookSeat.isSeat69()){
            Seat seat69 = new Seat(69, bookSeat.isSeat69(), 1);
            seatRepo.save(seat69);
        }

        if(bookSeat.isSeat70()){
            Seat seat70 = new Seat(70, bookSeat.isSeat70(), 1);
            seatRepo.save(seat70);
        }

        if(bookSeat.isSeat71()){
            Seat seat71 = new Seat(71, bookSeat.isSeat71(), 1);
            seatRepo.save(seat71);
        }
        if(bookSeat.isSeat72()){
            Seat seat72 = new Seat(72, bookSeat.isSeat72(), 1);
            seatRepo.save(seat72);
        }

        if(bookSeat.isSeat73()){
            Seat seat73 = new Seat(73, bookSeat.isSeat73(), 1);
            seatRepo.save(seat73);
        }

        if(bookSeat.isSeat74()){
            Seat seat74 = new Seat(74, bookSeat.isSeat74(), 1);
            seatRepo.save(seat74);
        }

        if(bookSeat.isSeat75()){
            Seat seat75 = new Seat(75, bookSeat.isSeat75(), 1);
            seatRepo.save(seat75);
        }

        if(bookSeat.isSeat76()){
            Seat seat76 = new Seat(76, bookSeat.isSeat76(), 1);
            seatRepo.save(seat76);
        }

        if(bookSeat.isSeat77()){
            Seat seat77 = new Seat(77, bookSeat.isSeat77(), 1);
            seatRepo.save(seat77);
        }

        if(bookSeat.isSeat78()){
            Seat seat78 = new Seat(78, bookSeat.isSeat78(), 1);
            seatRepo.save(seat78);
        }

        if(bookSeat.isSeat79()){
            Seat seat79 = new Seat(79, bookSeat.isSeat79(), 1);
            seatRepo.save(seat79);
        }

        if(bookSeat.isSeat80()){
            Seat seat80 = new Seat(80, bookSeat.isSeat80(), 1);
            seatRepo.save(seat80);
        }

        if(bookSeat.isSeat81()){
            Seat seat81 = new Seat(81, bookSeat.isSeat81(), 1);
            seatRepo.save(seat81);
        }
        if(bookSeat.isSeat82()){
            Seat seat82 = new Seat(82, bookSeat.isSeat82(), 1);
            seatRepo.save(seat82);
        }

        if(bookSeat.isSeat83()){
            Seat seat83 = new Seat(83, bookSeat.isSeat83(), 1);
            seatRepo.save(seat83);
        }

        if(bookSeat.isSeat84()){
            Seat seat84 = new Seat(84, bookSeat.isSeat84(), 1);
            seatRepo.save(seat84);
        }

        if(bookSeat.isSeat85()){
            Seat seat85 = new Seat(85, bookSeat.isSeat85(), 1);
            seatRepo.save(seat85);
        }

        if(bookSeat.isSeat86()){
            Seat seat86 = new Seat(86, bookSeat.isSeat86(), 1);
            seatRepo.save(seat86);
        }

        if(bookSeat.isSeat87()){
            Seat seat87 = new Seat(87, bookSeat.isSeat87(), 1);
            seatRepo.save(seat87);
        }

        if(bookSeat.isSeat88()){
            Seat seat88 = new Seat(88, bookSeat.isSeat88(), 1);
            seatRepo.save(seat88);
        }



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
