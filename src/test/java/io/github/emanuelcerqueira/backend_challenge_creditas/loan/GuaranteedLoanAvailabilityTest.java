package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuaranteedLoanAvailabilityTest {

    @Test
    void getLoan_whenCreated_thenLoanMustBePersonalWith3PercentTaxes() {
        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertEquals(consignmentLoanAvailability.getLoan().getLoanType(), LoanType.GUARANTEED,
                "Loan type must be guaranteed");
        assertEquals(consignmentLoanAvailability.getLoan().getTaxes(), 3,
                "Loan taxes must be 3%");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsLessThanOrEqual3000TheirAgeIsLessThan30AndTheirLocationIsSp_thenReturnsTrue() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 23, "SP", 2000);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is less than or equal 3000, their age is less than 30, and their location is SP returns true");
    }
    @Test
    void isLoanAvailable_whenCustomerIncomeIsLessThanOrEqual3000TheirAgeIsGreaterThan30AndTheirLocationIsSp_thenReturnsFalse() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 33, "SP", 2000);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is less than or equal 3000, their age is greater than 30, and their location is SP returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsLessThanOrEqual3000TheirAgeIsLessThan30AndTheirLocationIsNotSp_thenReturnsFalse() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 23, "BH", 2000);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is less than or equal 3000, their age is less than 30, and their location isn't SP returns true");

    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsLessThanOrEqual3000TheirAgeIsGreaterThan30AndTheirLocationIsNotSp_thenReturnsFalse() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 33, "BH", 2000);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is less than or equal 3000, their age is greater than 30, and their location isn't SP returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsGreaterThan3000AndLessThanOrEqual5000AndTheirLocationIsSp_thenReturnsTrue() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 18, "SP", 3500);
        Customer customer2 = new Customer("Kendrick", "333.456.789-10", 68, "SP", 4500);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is greater than 3000 and less than or equal 5000, and their location is SP returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer2),
                "When customer income is greater than 3000 and less than or equal 5000, and their location is SP returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsGreaterThan3000AndLessThanOrEqual5000AndTheirLocationIsNotSp_thenReturnsFalse() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 18, "RJ", 3500);
        Customer customer2 = new Customer("Kendrick", "333.456.789-10", 68, "AC", 4500);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is greater than 3000 and less than or equal 5000, and their location is SP returns true");
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer2),
                "When customer income is greater than 3000 and less than or equal 5000, and their location is SP returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsGreaterThan5000AndTheirAgeIsLessThan30_thenReturnsTrue() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 29, "BA", 5500);
        Customer customer2 = new Customer("Kendrick", "333.456.789-10", 20, "SC", 12500);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is greater than 5000, and their age is less than 30 returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer2),
                "When customer income is greater than 5000, and their age is less than 30 returns true");
    }

    @Test
    void isLoanAvailable_whenCustomerIncomeIsGreaterThan5000AndTheirAgeIsNotLessThan30_thenReturnsFalse() {
        Customer customer1 = new Customer("Kendrick", "333.456.789-10", 30, "PA", 5500);
        Customer customer2 = new Customer("Kendrick", "333.456.789-10", 45, "AM", 12500);

        LoanAvailability consignmentLoanAvailability = new GuaranteedLoanAvailability();
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer1),
                "When customer income is greater than 5000, and their age is not less than 30 returns true");
        assertFalse(consignmentLoanAvailability.isLoanAvailable(customer2),
                "When customer income is greater than 5000, and their age is not less than 30 returns true");
    }


}