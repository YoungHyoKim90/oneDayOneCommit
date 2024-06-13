package M2024_06;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("입금 완료: " + amount + "원");
        } else {
            System.out.println("금액이 유효하지 않습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("출금 완료: " + amount + "원");
        } else {
            System.out.println("잔액이 부족하거나 금액이 유효하지 않습니다.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // 계좌 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + " | 잔액: " + balance + "원";
    }
}
