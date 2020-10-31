package creational.builder;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        BankAccount doggoAccount = new BankAccount.Builder()
                .withAccountNumber(1111)
                .withOwner("Doggo")
                .openingBalnce(new BigDecimal("1200.50"))
                .atRate(new BigDecimal("4.1"))
                .build();

        BankAccount birbAccount = new BankAccount.Builder()
                .withOwner("Birb")
                .withAccountNumber(223233)
                .atRate(new BigDecimal("4.0"))
                .openingBalnce(new BigDecimal("2010.50"))
                .build();

        System.out.println(doggoAccount);
        System.out.println(birbAccount);
    }
}
