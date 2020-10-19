package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Component;

@Component
public class PersonalLoanAvailability implements LoanAvailability {
    @Override
    public LoanType getLoanType() {
        return LoanType.PERSONAL;
    }

    @Override
    public boolean isLoanAvailable(LoanCriteria loanCriteria) {
        return true;
    }
}
