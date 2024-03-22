package DTO;

public class BankCode {
    private int tCode;    // 코드 번호
    private String tType; // 코드 유형

    public BankCode() {
    }

    // 코드 번호 getter
    public int gettCode() {
        return tCode;
    }

    // 코드 번호 setter
    public void settCode(int tCode) {
        this.tCode = tCode;
    }

    // 코드 유형 getter
    public String gettType() {
        return tType;
    }

    // 코드 유형 setter
    public void settType(String tType) {
        this.tType = tType;
    }

    @Override
    public String toString() {
        return "Code{" +
                "tCode=" + tCode +
                ", tType='" + tType + '\'' +
                '}';
    }
}
