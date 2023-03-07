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
@Table(name= "airport_tbl")
public class Airports extends Base{
        private String name;
        private String airportCode;
        private String location;
        private String contactEmail;
        private String phoneNumber;
        @OneToMany
        private List<Flight> availableFlights;
}
