package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Component;

@Component
public class PersonalLoanAvailability implements LoanAvailability {
    @Override
    public Loan getLoan() {
        return new Loan(LoanType.PERSONAL, 4);
    }

    @Override
    public boolean isLoanAvailable(LoanCriteria loanCriteria) {
        return true;
    }
}
