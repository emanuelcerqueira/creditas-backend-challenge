package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import org.springframework.stereotype.Component;

@Component
public class GuaranteedLoanAvailability implements LoanAvailability {

    @Override
    public Loan getLoan() {
        return new Loan(LoanType.GUARANTEED, 3);
    }

    @Override
    public boolean isLoanAvailable(LoanCriteria loanCriteria) {

        if (loanCriteria.getIncome() <= 3000) {
            return isAgeLessThan30(loanCriteria) && isLocationSp(loanCriteria);
        }
        else if (loanCriteria.getIncome() > 3000 && loanCriteria.getIncome() <= 5000) {
            return isLocationSp(loanCriteria);
        }
        else  if (loanCriteria.getIncome() > 5000) {
            return isAgeLessThan30(loanCriteria);
        }
        return false;
    }

    private boolean isAgeLessThan30(LoanCriteria loanCriteria) {
        return loanCriteria.getAge() < 30;
    }

    private boolean isLocationSp(LoanCriteria loanCriteria) {
        return loanCriteria.getLocation().equalsIgnoreCase("SP");
    }
}
