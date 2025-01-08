package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        // 계좌에 10,000원 입금
        account.deposit(10000);

        // 계좌에서 9,000원 출금
        account.withdraw(9000);

        // 계좌에서 2,000원 출금 -> 잔액 부족이 표시되야 함
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
