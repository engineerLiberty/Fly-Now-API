package com.ikenna.FlyNow.entity;

import com.ikenna.FlyNow.enums.FlightStatus;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="flight_tbl")
public class Flight extends Base{
    private Long flightUId;
    private Integer flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private LocalDateTime flightDuration;
    private String airline;
    private Integer seatCapacity;
    private BigDecimal price;
    private FlightStatus flightStatus;

}
