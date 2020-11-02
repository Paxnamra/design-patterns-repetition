package creational.builder;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        BankAccount doggoAccount = new BankAccount.Builder(1111, "Doggo")
                .openingBalnce(new BigDecimal("1200.50"))
                .atRate(new BigDecimal("4.1"))
                .build();

        BankAccount birbAccount = new BankAccount.Builder(223233, "Birb")
                .atRate(new BigDecimal("4.0"))
                .openingBalnce(new BigDecimal("2010.50"))
                .build();

        BankAccount noAnimal = new BankAccount.Builder(677676, "Ghost").build();

        System.out.println(doggoAccount);
        System.out.println(birbAccount);
        System.out.println(noAnimal);
    }
}
