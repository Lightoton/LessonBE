package de.telran.lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Account {
    private String accountNumber;
    private Country country;
    private Currency currency;
    private boolean isDebit;
    private BigDecimal balance;
}

class Bank {
    Branch[] branches;
}

class Branch {
    private String branchName;
    Empl[] employees;
}

class Empl {
    private String name;
    private String surName;
    private Account[] account;

    private Citezeship citizenship;
}

enum Country {
    GERMANY,
    ISRAEL,
    CANADA
}

enum Currency {
    EURO,
    SHEKEL,
    DOLLAR
}

enum Citezeship {
    GERMANY,
    ISRAEL,
    CANADA
}
