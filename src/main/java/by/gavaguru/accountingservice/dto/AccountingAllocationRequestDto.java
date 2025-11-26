package by.gavaguru.accountingservice.dto;

import java.math.BigDecimal;

public record AccountingAllocationRequestDto(
        Long requestId,
        String type,
        BigDecimal budget
){}
