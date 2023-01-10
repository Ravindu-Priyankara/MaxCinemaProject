package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {

    @Query(value = "Select * from movies m where m.id = ?1",nativeQuery = true)
    List<Movie> getAllById(int id);
}
