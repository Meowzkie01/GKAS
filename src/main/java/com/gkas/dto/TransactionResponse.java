package com.gkas.model.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResponse {
    private Long id;
    private String type;
    private BigDecimal amount;
    private String senderName;
    private String receiverName;
    private String description;
    private String reference;
    private String status;
    private LocalDateTime createdAt;
    private BigDecimal newBalance;
}