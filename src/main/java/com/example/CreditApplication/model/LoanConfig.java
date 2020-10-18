package com.example.CreditApplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.Period;

@Builder
@AllArgsConstructor
@Getter
public class LoanConfig {

    @Id
    private String id;

    private Period maxTerm;

    private Period minTerm;

    private BigDecimal maxAmmount;
}
