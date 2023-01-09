package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Users {

    @Id
    private int id;
    private String username;
    private String password;
    private String phone_number;

    public Users(int id, String username, String password, String phone_number) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
    }
}
