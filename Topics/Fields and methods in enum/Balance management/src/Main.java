/**
 * You are given the enum Operation and the class Account.
 * Your task is to implement the method changeBalance to control balances.
 * If the given operation is DEPOSIT the method adds the sum to the account's balance.
 * If the operation is WITHDRAW the method subtracts the given sum from the account's balance. If the given sum is
 * greater than the balance, the method shouldn't change it. Instead, the method must output the string "Not enough
 * money to withdraw." (without quotes, don't forget the full point).
 * In any case, the method returns a boolean value — true if the balance has changed, false if it hasn't.
 */

import java.util.Scanner;

public class Main {

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        // write your implementation here
        switch (operation) {
            case DEPOSIT -> {
                long balance = account.getBalance();
                balance += sum;
                account.setBalance(balance);
                return true;
            }
            case WITHDRAW -> {
                long balance = account.getBalance();
                if (sum <= balance) {
                    balance -= sum;
                    account.setBalance(balance);
                    return true;
                } else {
                    System.out.println("Not enough money to withdraw.");
                    return false;
                }
            }
            default -> System.out.println("Incorrect selection");
        }
        return false;
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}