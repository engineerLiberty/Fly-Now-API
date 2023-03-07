package com.ikenna.FlyNow.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction_tbl")
public class Transaction{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long transactionId;

    private String flutterTransactionId;

    private Long uuid;

    private String status;
    private String currency;

    private String txRef;

    private BigDecimal amount;

}
