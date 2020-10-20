package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalLoanAvailabilityTest {

    @Test
    void getLoan_whenCreated_thenLoanMustBePersonalWith4PercentTaxes() {
        LoanAvailability consignmentLoanAvailability = new PersonalLoanAvailability();
        assertEquals(consignmentLoanAvailability.getLoan().getLoanType(), LoanType.PERSONAL,
                "Loan type must be personal");
        assertEquals(consignmentLoanAvailability.getLoan().getTaxes(), 4,
                "Loan taxes must be 4%");
    }

    @Test
    void isLoanAvailable_whenRegardlessOfTheConsumer_thenReturnTrue() {
        Customer customer1 = new Customer("Joseph", "123.456.789-10", 20, "BH", 5000);
        Customer customer2 = new Customer("John", "789.456.789-10", 18, "AM", 12000);
        Customer customer3 = new Customer("Jermaine", "444.456.789-10", 35, "BA", 1509);
        Customer customer4 = new Customer("Kendrick", "333.456.789-10", 33, "SP", 2000);

        LoanAvailability consignmentLoanAvailability = new PersonalLoanAvailability();

        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer1), "Regardless of the consumer, returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer2), "Regardless of the consumer, returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer3), "Regardless of the consumer, returns true");
        assertTrue(consignmentLoanAvailability.isLoanAvailable(customer4), "Regardless of the consumer, returns true");


    }
}