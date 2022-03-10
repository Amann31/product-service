package com.example.productservice.proxy;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coupon {
    private Long id;
    private String code;
    private BigDecimal discount;
    private String expDate;
}
