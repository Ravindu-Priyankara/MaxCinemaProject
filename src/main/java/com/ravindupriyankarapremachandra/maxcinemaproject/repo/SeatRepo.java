package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeatRepo extends JpaRepository<Seat,Integer> {
    @Query(value = "INSERT into seat(seat_id,status,user_id) values (?1,?2,?3)",nativeQuery = true)
    Seat insertSeat(int seat_id,boolean status, int user_id);
}
