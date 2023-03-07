package com.ikenna.FlyNow.entity;

import com.ikenna.FlyNow.enums.Availability;
import com.ikenna.FlyNow.enums.SeatClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "seat_tbl")
public class Seats extends Base{
    private Long seatUId;
    private SeatClass seatClass;
    private Availability availability;
}
