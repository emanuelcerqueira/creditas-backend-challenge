package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsignmentLoanAvailabilityTest {

    @Test
    void getLoan_whenCreated_thenLoanMustBeConsignmentWith2PercentTaxes() {
        LoanAvailability consignmentLoanAvailability = new ConsignmentLoanAvailability();
        assertEquals(consignmentLoanAvailability.getLoan().getLoanType(), LoanType.CONSIGNMENT,
                "Loan type must be consignment");
        assertEquals(consignmentLoanAvailability.getLoan().getTaxes(), 2,
                "Loan taxes must be 2%");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsGreaterThanOrEqual5000_thenReturnTrue() {

        Customer customer1 = new Customer("Joseph", "123.456.789-10", 20, "BH", 5000);
        Customer customer2 = new Customer("John", "789.456.789-10", 18, "AM", 12000);

        LoanAvailability consignmentLoanAvailability = new ConsignmentLoanAvailability();
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer1), "When salary is equal 5000 returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer2), "When salary is greater than 5000 returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsLessThan5000_thenReturnFalse() {

        Customer customer1 = new Customer("Jermaine", "444.456.789-10", 35, "BA", 4999);
        Customer customer2 = new Customer("Kendrick", "333.456.789-10", 33, "SP", 2000);

        LoanAvailability consignmentLoanAvailability = new ConsignmentLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1), "When salary is less than 5000 returns false");
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer2), "When salary is less than 5000 returns false");
    }
}