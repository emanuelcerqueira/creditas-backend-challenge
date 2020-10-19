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

    public Set<LoanType> findAvailableLoanTypesByLoanCriteria(LoanCriteria loanCriteria) {

        Set<LoanType> availableLoanTypes = loanAvailabilities.stream()
                .filter(loanAvailability -> loanAvailability.isLoanAvailableByLoanCriteria(loanCriteria))
                .map(loanAvailability -> loanAvailability.getLoanType())
                .collect(Collectors.toSet());

        return availableLoanTypes;
    }

}
