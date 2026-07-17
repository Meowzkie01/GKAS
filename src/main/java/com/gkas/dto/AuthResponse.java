package com.gkas.model.dto;

import lombok.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {
    private String token;
    private String fullName;
    private String mobileNumber;
    private String email;
    private String accountNumber;
    private BigDecimal balance;
    private String message;
}