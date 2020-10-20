package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import java.util.Set;

public class CustomerLoanTypesAvailability {

    private String customer;
    private Set<Loan> availableLoans;

    public CustomerLoanTypesAvailability(Customer customer, Set<Loan> availableLoanTypes) {
        this.customer = customer.getName();
        this.availableLoans = availableLoanTypes;
    }

    public String getCustomer() {
        return customer;
    }

    public Set<Loan> getLoans() {
        return availableLoans;
    }
}
