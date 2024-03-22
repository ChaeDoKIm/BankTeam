package DTO;

public class Account {
    private String tAccount;        // 계좌 번호
    private String tClientId;       // 고객 ID
    private String tCodeNum;        // 코드 번호
    private int balance;            // 잔액

    public Account() {
    }

    // 계좌 번호 getter
    public String gettAccount() {
        return tAccount;
    }

    // 계좌 번호 setter
    public void settAccount(String tAccount) {
        this.tAccount = tAccount;
    }

    // 고객 ID getter
    public String gettClientId() {
        return tClientId;
    }

    // 고객 ID setter
    public void settClientId(String tClientId) {
        this.tClientId = tClientId;
    }

    // 코드 번호 getter
    public String gettCodeNum() {
        return tCodeNum;
    }

    // 코드 번호 setter
    public void settCodeNum(String tCodeNum) {
        this.tCodeNum = tCodeNum;
    }

    // 잔액 getter
    public int getBalance() {
        return balance;
    }

    // 잔액 setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "Account{" +
                "tAccount='" + tAccount + '\'' +
                ", tClientId='" + tClientId + '\'' +
                ", tCodeNum='" + tCodeNum + '\'' +
                ", balance=" + balance +
                '}';
    }
}
