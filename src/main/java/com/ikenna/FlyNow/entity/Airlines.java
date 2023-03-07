package com.ikenna.FlyNow.entity;

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
@Table(name= "airlines_tbl")
public class Airlines extends Base{
    private String name;
    private String airlineCode;
    private String contactEmail;
    private String phoneNumber;
}
