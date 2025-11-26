package by.gavaguru.accountingservice.controller;

import by.gavaguru.accountingservice.dto.AccountingAllocationRequestDto;
import by.gavaguru.accountingservice.dto.AccountingAllocationResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounting")
public class AccountingController {

    @PostMapping("/allocation")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountingAllocationResponseDto allocate(@RequestBody AccountingAllocationRequestDto request) {
        // Мок-логика: всегда выделяем бюджет успешно
        return new AccountingAllocationResponseDto(
                10L,              // захардкоженный id запроса на стороне accounting-service
                request.requestId(),
                true              // всегда allocated = true
        );
    }
}

