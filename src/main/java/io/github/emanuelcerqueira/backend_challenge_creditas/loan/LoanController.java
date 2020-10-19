package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping(value = "/api/loan/availability")
    public ResponseEntity<CustomerLoanTypesAvailability> findAvailableLoanTypesByCustomer(@RequestBody Customer customer) {
        Set<LoanType> availableLoanTypes = loanService.findAvailableLoanTypesByLoanCriteria(customer);
        return ResponseEntity.ok().body(new CustomerLoanTypesAvailability(customer, availableLoanTypes));
    }
}
