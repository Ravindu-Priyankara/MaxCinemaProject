package com.ravindupriyankarapremachandra.maxcinemaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Seat {
    @Id
    private int seat_id;
    private boolean status;
    private int user_id;

    public Seat(int seat_id, boolean status, int user_id) {
        this.seat_id = seat_id;
        this.status = status;
        this.user_id = user_id;
    }

}
