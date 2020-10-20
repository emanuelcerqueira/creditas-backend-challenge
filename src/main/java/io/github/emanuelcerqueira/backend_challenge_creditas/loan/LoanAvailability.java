package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

public interface LoanAvailability {

    Loan getLoan();
    boolean isLoanAvailable(LoanCriteria loanCriteria);
}
