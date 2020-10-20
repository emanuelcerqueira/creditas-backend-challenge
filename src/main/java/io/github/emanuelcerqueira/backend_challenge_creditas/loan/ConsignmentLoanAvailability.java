package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Component;

@Component
public class ConsignmentLoanAvailability implements LoanAvailability {

    @Override
    public Loan getLoan() {
        return new Loan(LoanType.CONSIGNMENT, 2);
    }

    @Override
    public boolean isLoanAvailable(LoanCriteria loanCriteria) {
        return loanCriteria.getIncome() >= 5000;
    }

}
