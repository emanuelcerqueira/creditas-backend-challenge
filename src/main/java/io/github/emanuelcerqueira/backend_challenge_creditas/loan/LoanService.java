package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LoanService {

    private final Set<LoanAvailability> loanAvailabilities;

    public LoanService(Set<LoanAvailability> loanAvailabilities) {
        this.loanAvailabilities = loanAvailabilities;
    }

    public Set<Loan> findAvailableLoanTypesByLoanCriteria(LoanCriteria loanCriteria) {

        return loanAvailabilities.stream()
                .filter(loanAvailability -> loanAvailability.isLoanAvailable(loanCriteria))
                .map(LoanAvailability::getLoan)
                .collect(Collectors.toSet());
    }

}
