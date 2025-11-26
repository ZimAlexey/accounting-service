package by.gavaguru.accountingservice.dto;

public record AccountingAllocationResponseDto(
        Long id,
        Long requestId,
        boolean allocated
) {
}
