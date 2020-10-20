package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Loan {

    private LoanType loanType;
    private Integer taxes;

    public Loan() {
    }

    public Loan(LoanType loanType, Integer taxes) {
        this.loanType = loanType;
        this.taxes = taxes;
    }

    @JsonIgnore
    public LoanType getLoanType() {
        return loanType;
    }

    public String getType() {
        return loanType.getType();
    }

    public Integer getTaxes() {
        return taxes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return loanType == loan.loanType &&
                Objects.equals(taxes, loan.taxes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanType, taxes);
    }
}
