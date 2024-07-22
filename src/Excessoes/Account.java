    package Excessoes;

    import exceptions.BusinessException;
    import jdk.dynalink.NamedOperation;

    import java.util.Scanner;

    public class Account {
        private Integer number;
        private String holder;
        private double balance;
        private double withdrawLimit;

        public Account() {

        }

        public Account(Integer number, String holder, double balance, double withdrawLimit) {
            this.number = number;
            this.holder = holder;
            this.balance = balance;
            this.withdrawLimit = withdrawLimit;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getHolder() {
            return holder;
        }

        public void setHolder(String holder) {
            this.holder = holder;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getWithdrawLimit() {
            return withdrawLimit;
        }

        public void setWithdrawLimit(double withdrawLimit) {
            this.withdrawLimit = withdrawLimit;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            validateWithdraw(amount);
            balance -= amount;
        }

        private void validateWithdraw(double amount) {
            if (amount > getWithdrawLimit()) {
                throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
            }
            if (amount > getBalance()) {
                throw new BusinessException("Erro de saque: Saldo insuficiente");
            }
        }
    }
