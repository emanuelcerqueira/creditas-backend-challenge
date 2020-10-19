package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import java.util.Set;

public class CustomerLoanTypesAvailability {

    private final Customer customer;
    private final Set<LoanType> availableLoanTypes;

    public CustomerLoanTypesAvailability(Customer customer, Set<LoanType> availableLoanTypes) {
        this.customer = customer;
        this.availableLoanTypes = availableLoanTypes;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public Set<LoanType> getLoans() {
        return availableLoanTypes;
    }
}
