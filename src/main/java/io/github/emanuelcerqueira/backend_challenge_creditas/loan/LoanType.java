package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LoanType {

    PERSONAL("personal", 4),
    GUARANTEED("guaranteed", 3),
    CONSIGNMENT("consignment", 2);

    private String type;
    private Integer taxes;

    LoanType(String type, int interestRate) {
        this.type = type;
        this.taxes = interestRate;
    }

    public String getType() {
        return type;
    }

    public Integer getTaxes() {
        return taxes;
    }
}
