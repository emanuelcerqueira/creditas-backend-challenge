package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

public enum LoanType {

    PERSONAL("personal"),
    GUARANTEED("guaranteed"),
    CONSIGNMENT("consignment");

    private String type;

    LoanType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
