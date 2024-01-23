package M2024_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금 완료. 현재 잔액: $" + balance);
        } else {
            System.out.println("유효하지 않은 입금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("출금 완료. 현재 잔액: $" + balance);
        } else {
            System.out.println("유효하지 않은 출금액이거나 잔액이 부족합니다.");
        }
    }
}

class Bank {
    private Map<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount account = new BankAccount(accountNumber, initialBalance);
            accounts.put(accountNumber, account);
            System.out.println("계좌 생성 완료. 계좌번호: " + accountNumber);
        } else {
            System.out.println("이미 존재하는 계좌번호입니다.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("은행 입출금 프로그램을 시작합니다.");

        while (true) {
            System.out.println("\n1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("새로 생성할 계좌번호를 입력하세요: ");
                    String accountNumber = scanner.next();
                    System.out.print("초기 입금액을 입력하세요: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, initialBalance);
                    break;
                case 2:
                    System.out.print("계좌번호를 입력하세요: ");
                    String depositAccountNumber = scanner.next();
                    BankAccount depositAccount = bank.getAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("입금액을 입력하세요: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("존재하지 않는 계좌번호입니다.");
                    }
                    break;
                case 3:
                    System.out.print("계좌번호를 입력하세요: ");
                    String withdrawAccountNumber = scanner.next();
                    BankAccount withdrawAccount = bank.getAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("출금액을 입력하세요: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("존재하지 않는 계좌번호입니다.");
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}

