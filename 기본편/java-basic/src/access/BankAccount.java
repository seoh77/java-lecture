package access;

/*
    캡슐화
    - 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
    - 캡슐화를 통해 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.

    1. 데이터를 숨겨라
    - 캡슐화에서 가장 필수로 숨겨야 하는 것은 속성(데이터)다.
    - 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변경할 수 있다.
    - 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.

    2. 기능을 숨겨라
    - 객체의 기능 중에서 외부에서 사용하지 않고 내부에서만 사용하는 기능들이 있다. 이런 기능도 모두 감추는 것이 좋다.
    - 사용자 입장에서 꼭 필요한 기능만 외부에 노출하고, 나머지 기능은 모두 내부로 숨기자.

    정리하면 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.
 */

public class BankAccount {
    private int balance;

    // 단축키 : cmd + N
    public BankAccount() {
        balance = 0;
    }

    // public 메서드
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    /**
     * 제대로 된 금액이 들어왔는지 검사하는 메서드 (내부에서만 사용)
     */
    // -> 만약 해당 메서드가 public으로 되어 있다면 service 단계에서 이걸 사용해서 검증하고 입금, 출금을 해야하나 고민이 들 수 있음
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
