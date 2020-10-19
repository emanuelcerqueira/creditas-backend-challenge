package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

public interface LoanAvailability {

    LoanType getLoanType();
    boolean isLoanAvailableByLoanCriteria(LoanCriteria loanCriteria);
}
