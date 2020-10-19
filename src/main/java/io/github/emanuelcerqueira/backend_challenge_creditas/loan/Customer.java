package io.github.emanuelcerqueira.backend_challenge_creditas.loan;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("customer")
public class Customer implements LoanCriteria {

    private String name;
    private String cpf;
    private int age;
    private String location;
    private int income;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getIncome() {
        return income;
    }

}
