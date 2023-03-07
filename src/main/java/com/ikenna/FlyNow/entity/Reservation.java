package com.ikenna.FlyNow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "reservation_tbl")
public class Reservation extends Base{
    private Long reservationUId;
    private Long uuid;
    private Long flightUId;
    @OneToMany
    private List<Seats> seats;

}
