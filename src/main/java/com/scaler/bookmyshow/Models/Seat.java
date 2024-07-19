package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel{

    private String name;
    private SeatType seatType;
}
