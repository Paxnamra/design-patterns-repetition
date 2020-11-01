package creational.builder;

import java.math.BigDecimal;

public class BankAccount {
    private long bankAccount;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
    
    public long getBankAccount() {
        return bankAccount;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getInterestRate() { return interestRate; }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccount=" + bankAccount +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    public static class Builder {
        private long bankAccount;
        private String owner;
        private BigDecimal balance;
        private BigDecimal interestRate;

        public Builder(long bankAccount, String owner) {
            this.bankAccount = bankAccount;
            this.owner = owner;
        }

        public Builder openingBalnce(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(BigDecimal rate) {
            this.interestRate = rate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    private BankAccount(Builder builder) {
        bankAccount = builder.bankAccount;
        owner = builder.owner;
        balance = builder.balance;
        interestRate = builder.interestRate;
    }
}
