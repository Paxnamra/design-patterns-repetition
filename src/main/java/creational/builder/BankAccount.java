package creational.builder;

import java.math.BigDecimal;

public class BankAccount {
    private long bankAccount;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;

    private BankAccount() {}
    
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

        public Builder withAccountNumber(long bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
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
            BankAccount account = new BankAccount();
            account.bankAccount = this.bankAccount;
            account.owner = this.owner;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }
    }
}
