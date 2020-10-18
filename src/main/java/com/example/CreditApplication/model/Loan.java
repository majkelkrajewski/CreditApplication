package com.example.CreditApplication.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@Builder
@Entity
public class Loan {
    @Id
    private String Id;

    @NotNull
    private BigDecimal ammount;

    @NotNull
    private BigDecimal amountWithInterest;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    @NotNull
    private Period period;
}
