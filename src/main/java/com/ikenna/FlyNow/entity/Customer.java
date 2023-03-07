package com.ikenna.FlyNow.entity;

import com.ikenna.FlyNow.enums.Gender;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_tbl")
public class Customer extends Base{
    @Column(nullable = false)
    private Long uuid;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String otherNames;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String dateOfBirth;
    private String address;
}
