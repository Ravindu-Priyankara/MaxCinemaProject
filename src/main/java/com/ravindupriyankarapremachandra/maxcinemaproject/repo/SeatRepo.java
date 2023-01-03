package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepo extends JpaRepository<Seat,Integer> {
    @Query(value = "select * from seat s where s.seat_no = ?1", nativeQuery = true)
    List<Seat> getAllRecords (int id);


    /*@Query(value = "delete from seat where status = ")
    @Override
    void delete(Seat status);*/

    long deleteByStatus(boolean value);
}
