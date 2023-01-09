package com.ravindupriyankarapremachandra.maxcinemaproject.repo;

import com.ravindupriyankarapremachandra.maxcinemaproject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    @Query(value = "select password from users s where s.username = ?1",nativeQuery = true)
    String pass(String username);
}
