package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Movie {

    @Id
    private int id;
    private String name;
    private Date release_date;
    private String img_link;

    public Movie(int id, String name, Date release_date, String img_link) {
        this.id = id;
        this.name = name;
        this.release_date = release_date;
        this.img_link = img_link;
    }
}
