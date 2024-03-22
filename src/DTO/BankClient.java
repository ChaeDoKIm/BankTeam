package DTO;

public class BankClient {

    // 필드
    private int tNum;           // 고객 번호
    private String tId;         // 고객 ID
    private String tPw;         // 고객 비밀번호
    private String tName;       // 고객 이름
    private String tPhone;      // 고객 전화번호
    private String tAddr;       // 고객 주소

    public BankClient() {
    }

    // 고객 번호 getter
    public int gettNum() {
        return tNum;
    }

    // 고객 번호 setter
    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    // 고객 ID getter
    public String gettId() {
        return tId;
    }

    // 고객 ID setter
    public void settId(String tId) {
        this.tId = tId;
    }

    // 고객 비밀번호 getter
    public String gettPw() {
        return tPw;
    }

    // 고객 비밀번호 setter
    public void settPw(String tPw) {
        this.tPw = tPw;
    }

    // 고객 이름 getter
    public String gettName() {
        return tName;
    }

    // 고객 이름 setter
    public void settName(String tName) {
        this.tName = tName;
    }

    // 고객 전화번호 getter
    public String gettPhone() {
        return tPhone;
    }

    // 고객 전화번호 setter
    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    // 고객 주소 getter
    public String gettAddr() {
        return tAddr;
    }

    // 고객 주소 setter
    public void settAddr(String tAddr) {
        this.tAddr = tAddr;
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "BankClient{" +
                "tNum=" + tNum +
                ", tId='" + tId + '\'' +
                ", tPw='" + tPw + '\'' +
                ", tName='" + tName + '\'' +
                ", tPhone='" + tPhone + '\'' +
                ", tAddr='" + tAddr + '\'' +
                '}';
    }
}
