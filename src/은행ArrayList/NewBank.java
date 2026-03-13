package 은행ArrayList;

// ArrayList 활용예제
public class NewBank {
    private static int count = 0;
    private int id;  // 계좌 식별용 번호
    private  int account;  // 잔액
    private String bank;  // 은행 이름
    private String name;  // 예금주 이름

    public NewBank(String bank, String name, int account) {
        this.bank = bank;
        this.name = name;
        this.account = account;
        count++;  // 계좌 생성 개수
        id = count + 10000;  // 계좌 식별용 번호는 자동 생성
    }

    public int getId() {
        return id;
    }
    public static int getCount() {  // 계좌 생성 개수, 클래스 메서드
        return count;
    }
    public void deposit(final int money) {  // 입금 금액이 변경 되지 않도록 함
        this.account += money;  // 현재 잔액에 입금액을 누적
        System.out.println(money + "를 입금 했습니다.");
    }

    public void withdraw(final int money) {
        if (money <= account) {
            account -= money;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    public void printAccount() {
        System.out.println("은행병 : " + bank);
        System.out.println("예금주 : " +name);
        System.out.println("계좌번호 " + id);
        System.out.println("잔액 : " +account);
    }
}
