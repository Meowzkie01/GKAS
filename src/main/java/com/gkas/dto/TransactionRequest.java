package com.gkas.model.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionRequest {

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "1.00", message = "Minimum amount is ₱1.00")
    @DecimalMax(value = "100000.00", message = "Maximum amount is ₱100,000.00")
    private BigDecimal amount;

    private String reference;

    // For Send Money only
    private String recipientMobile;
    private String note;
}