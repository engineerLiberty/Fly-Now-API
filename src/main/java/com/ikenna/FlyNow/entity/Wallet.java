package com.ikenna.FlyNow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wallet_tbl")
public class Wallet extends Base{
    @Column(nullable = false)
    private BigDecimal balance;
    @Column(nullable = false)
    private Long uuid;
}
