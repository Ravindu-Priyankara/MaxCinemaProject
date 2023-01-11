package com.ravindupriyankarapremachandra.maxcinemaproject.controllers;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Cookies;
import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seats;
import com.ravindupriyankarapremachandra.maxcinemaproject.models.BookSeat;
import com.ravindupriyankarapremachandra.maxcinemaproject.repo.*;
import com.ravindupriyankarapremachandra.maxcinemaproject.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Controller
public class seatController {

    public int seat_count = 0;

    @Autowired
    SeatRepo seatRepo;

    @Autowired
    SeatService seatService;

    @Autowired
    SeatsRepo seatsRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    MoviesRepo moviesRepo;

    @Autowired
    CookiesRepo cookiesRepo;


    @GetMapping("/seats/{film_name}/{username}")
    public String seats(Model model,@PathVariable("film_name") String name,@PathVariable("username")String userName) {



        //long deleteRows = seatRepo.deleteByStatus(false);
        Cookies cookies = new Cookies(1,userName);
        cookiesRepo.save(cookies);




        model.addAttribute("userSeat", new BookSeat());
        model.addAttribute("filmName", name); // use this on url
        model.addAttribute("url",name);
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

    @PostMapping("seats/bookSeat/{filmName}")
    public String getSeat(@ModelAttribute BookSeat bookSeat, Model model,@PathVariable("filmName")String filmName){

        String username = cookiesRepo.getCookiesById(1);
        System.out.println("user name is:"+username);
        System.out.println("user id is:-"+userRepo.findByUsername(username));
        System.out.println("get movie id:"+moviesRepo.getMovieByName(filmName));


        Random rand = new Random(); //generate random number
        int upperBound = 999999999;
        int rand_number = rand.nextInt(upperBound);



        if(bookSeat.isSeat01()){
            try{
                Seats seats01 = new Seats(rand_number, 1, true,userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats01);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if (bookSeat.isSeat02()) {
            try {
                Seats seats02 = new Seats(rand_number, 2, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats02);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }


        if(bookSeat.isSeat03()){
            try{
                Seats seats03 = new Seats(rand_number, 3, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats03);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat04()){
            try{
                Seats seats04 = new Seats(rand_number, 4, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats04);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat05()){
            try{
                Seats seats05 = new Seats(rand_number, 5, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats05);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat06()){
            try{
                Seats seats06 = new Seats(rand_number, 6, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats06);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat07()){
            try{
                Seats seats07 = new Seats(rand_number, 7, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats07);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat08()){
            try{
                Seats seats08 = new Seats(rand_number, 8, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats08);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat09()){
            try{
                Seats seats09 = new Seats(rand_number, 9, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats09);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat10()){
            try{
                Seats seats10 = new Seats(rand_number, 10, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats10);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat11()){
            try{
                Seats seats11 = new Seats(rand_number, 11, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats11);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat12()){
            try{
                Seats seats12 = new Seats(rand_number, 12, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats12);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat13()){
            try{
                Seats seats13 = new Seats(rand_number, 13, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats13);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat14()){
            try{
                Seats seats14 = new Seats(rand_number, 14, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats14);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat15()){
            try{
                Seats seats15 = new Seats(rand_number, 15, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats15);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat16()){
            try{
                Seats seats16 = new Seats(rand_number, 16, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats16);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat17()){
            try{
                Seats seats17 = new Seats(rand_number, 17, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats17);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat18()){
            try{
                Seats seats18 = new Seats(rand_number, 18, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats18);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat19()){
            try{
                Seats seats19 = new Seats(rand_number, 19, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats19);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat20()){
            try{
                Seats seats20 = new Seats(rand_number, 20, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats20);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat21()){
            try{
                Seats seats21 = new Seats(rand_number, 21, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats21);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat22()){
            try{
                Seats seats22 = new Seats(rand_number, 22, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats22);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat23()){
            try{
                Seats seats23 = new Seats(rand_number, 23, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats23);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat24()){
            try{
                Seats seats24 = new Seats(rand_number, 24, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats24);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat25()){
            try{
                Seats seats25 = new Seats(rand_number, 25, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats25);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat26()){
            try{
                Seats seats26 = new Seats(rand_number, 26, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats26);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat27()){
            try{
                Seats seats27 = new Seats(rand_number, 27, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats27);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat28()){
            try{
                Seats seats28 = new Seats(rand_number, 28, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats28);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat29()) {
            try{

                Seats seats29 = new Seats(rand_number, 29, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats29);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat30()){
            try{
                Seats seats30 = new Seats(rand_number, 30, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats30);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat31()){
            try{
                Seats seats31 = new Seats(rand_number, 31, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats31);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat32()){
            try{
                Seats seats32 = new Seats(rand_number, 32, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats32);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat33()){
            try{
                Seats seats33 = new Seats(rand_number, 33, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats33);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat34()){
            try{
                Seats seats34 = new Seats(rand_number, 34, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats34);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat35()){
            try{
                Seats seats35 = new Seats(rand_number, 35, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats35);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat36()){
            try{
                Seats seats36 = new Seats(rand_number, 36, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats36);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat37()){
            try{
                Seats seats37 = new Seats(rand_number, 37, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats37);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat38()){
            try{
                Seats seats38 = new Seats(rand_number, 38, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats38);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat39()){
            try{
                Seats seats39 = new Seats(rand_number, 39, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats39);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat40()){
            try{
                Seats seats40 = new Seats(rand_number, 40, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats40);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat41()){
            try{
                Seats seats41 = new Seats(rand_number, 41, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats41);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat42()){
            try{
                Seats seats42 = new Seats(rand_number, 42, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats42);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat43()){
            try{
                Seats seats43 = new Seats(rand_number, 43, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats43);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat44()){
            try{
                Seats seats44 = new Seats(rand_number, 44, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats44);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat45()){
            try{
                Seats seats45 = new Seats(rand_number,45,true,userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats45);
                seat_count +=1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat46()){
            try{
                Seats seats46 = new Seats(rand_number, 46, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats46);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat47()){
            try{
                Seats seats47 = new Seats(rand_number, 47, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats47);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat48()){
            try{
                Seats seats48 = new Seats(rand_number, 48, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats48);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat49()){
            try{
                Seats seats49 = new Seats(rand_number, 49, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats49);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat50()){
            try{
                Seats seats50 = new Seats(rand_number, 50, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats50);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat51()){
            try{
                Seats seats51 = new Seats(rand_number, 51, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats51);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat52()){
            try{
                Seats seats52 = new Seats(rand_number, 52, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats52);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat53()){
            try{
                Seats seats53 = new Seats(rand_number, 53, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats53);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat54()){
            try{
                Seats seats54 = new Seats(rand_number, 54, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats54);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat55()){
            try{
                Seats seats55 = new Seats(rand_number, 55, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats55);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat56()){
            try{
                Seats seats56 = new Seats(rand_number, 56, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats56);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat57()){
            try{
                Seats seats57 = new Seats(rand_number, 57, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats57);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat58()){
            try{
                Seats seats58 = new Seats(rand_number, 58, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats58);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat59()){
            try{
                Seats seats59 = new Seats(rand_number, 59, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats59);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat60()){
            try{
                Seats seats60 = new Seats(rand_number, 60, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats60);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat61()){
            try{
                Seats seats61 = new Seats(rand_number, 61, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats61);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat62()){
            try{
                Seats seats62 = new Seats(rand_number, 62, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats62);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat63()){
            try{
                Seats seats63 = new Seats(rand_number, 63, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats63);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat64()){
            try{
                Seats seats64 = new Seats(rand_number, 64, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats64);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat65()){
            try{
                Seats seats65 = new Seats(rand_number, 65, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats65);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat66()){
            try{
                Seats seats66 = new Seats(rand_number, 66, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats66);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat67()){
            try{
                Seats seats67 = new Seats(rand_number, 67, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats67);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat68()){
            try{
                Seats seats68 = new Seats(rand_number, 68, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats68);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat69()){
            try{
                Seats seats69 = new Seats(rand_number, 69, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats69);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat70()){
            try{
                Seats seats70 = new Seats(rand_number, 70, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats70);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat71()){
            try{
                Seats seats71 = new Seats(rand_number, 71, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats71);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }
        if(bookSeat.isSeat72()){
            try{
                Seats seats72 = new Seats(rand_number, 72, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats72);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat73()){
            try{
                Seats seats73 = new Seats(rand_number, 73, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats73);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat74()){
            try{
                Seats seats74 = new Seats(rand_number, 74, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats74);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat75()){
            try{
                Seats seats75 = new Seats(rand_number, 75, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats75);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat76()){
            try{
                Seats seats76 = new Seats(rand_number, 76, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats76);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat77()){
            try{
                Seats seats77 = new Seats(rand_number, 77, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats77);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat78()){
            try{
                Seats seats78 = new Seats(rand_number, 78, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats78);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat79()){
            try{
                Seats seats79 = new Seats(rand_number, 79, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats79);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat80()){
            try{
                Seats seats80 = new Seats(rand_number, 80, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats80);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat81()){
            try{
                Seats seats81 = new Seats(rand_number, 81, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats81);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat82()){
            try{
                Seats seats82 = new Seats(rand_number, 82, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats82);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat83()){
            try{
                Seats seats83 = new Seats(rand_number, 83, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats83);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat84()){
            try{
                Seats seats84 = new Seats(rand_number, 84, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats84);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat85()){
            try{
                Seats seats85 = new Seats(rand_number, 85, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats85);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat86()){
            try{
                Seats seats86 = new Seats(rand_number, 86, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats86);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat87()){
            try{
                Seats seats87 = new Seats(rand_number, 87, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats87);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }

        if(bookSeat.isSeat88()){
            try{
                Seats seats88 = new Seats(rand_number, 88, true, userRepo.findByUsername(username), moviesRepo.getMovieByName(filmName));
                seatsRepo.save(seats88);
                seat_count += 1;
            }catch (Exception e){
                return "/home";
            }
        }






        model.addAttribute("userSeat",new BookSeat());
        return "redirect:http://127.0.0.1:8080/payment/"+seat_count;
    }

    @GetMapping("/payment/{value}") // pass values through the url
    public String payment(Model model, @PathVariable("value") int values){
        double value = (double) (values * 1.81); //type casting
        model.addAttribute("value",value);
        model.addAttribute("currency","USD");
        return "payment";
    }

}
//EOF
