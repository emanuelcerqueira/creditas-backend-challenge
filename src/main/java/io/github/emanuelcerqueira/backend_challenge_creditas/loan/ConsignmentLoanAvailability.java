package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Component;

@Component
public class ConsignmentLoanAvailability implements LoanAvailability {

    @Override
    public LoanType getLoanType() {
        return LoanType.CONSIGNMENT;
    }

    @Override
    public boolean isLoanAvailableByLoanCriteria(LoanCriteria loanCriteria) {
        return loanCriteria.getIncome() >= 5000;
    }

}
