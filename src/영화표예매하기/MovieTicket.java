package 영화표예매하기;

import java.util.Scanner;

// 빈 좌석은 [ ], 예매됨 [V]
// 영화표 가격은 생성자에서 매개변수로 전달 받음
// 생성자
// 좌석 상태 출력 메서드
// 예매 기능 수행하는 메서드
// 취소 기능 수행하는 메서드
// 총 판매 금액 반환
public class MovieTicket {
    // 좌석은 10개 (배열 사용)
    // 좌석 가격에 대한 인스턴스 필드 생성
    // 입력을 받기 위한 스캐너 생성

    // 생성자를 만드는데 매개변수로 가격을 전달 받음

    // 좌석 상태 출력 메서드

    // 예매 기능 수행하는 메서드

    // 취소 기능을 수행하는 메서드

    // 총 판매 금액 반환
    private final int[] seat = new int[10];  // 10개 좌석에 대한 배열의 참조 변수 생성
    private final int price;
    private final Scanner sc = new Scanner(System.in);
    // 생성자를 통해서 가격을 전달 받음
    public MovieTicket(int price) {
        this.price = price;
    }
    public void printSeat() {
        for (int e : seat) {
            System.out.print(e == 0 ? "[ ]" : "[V]"); // 0이면 비어 있음, 1이면 예매됨
        }
        System.out.println();
    }
    private boolean isValidPos(int seatPos) {
        return seatPos >= 1 && seatPos <= seat.length;
    }
    public void selectSeat() {
        printSeat();
        System.out.print("예매할 좌석 번호(1~10): ");
        int seatPos = sc.nextInt();
        if (!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1~10 사이로 입력하세요.");
            return;
        }
        if (seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1;
            System.out.println(seatPos + "빈 좌석 예매 완료");
            printSeat();
        } else {
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    public void cancelSeat() {
        printSeat();
        System.out.print("취소할 좌석 번호 (1~10): ");
        int seatPos = sc.nextInt();
        if (!isValidPos(seatPos)) {
            System.out.println("좌석 번호는 1~10 사이로 입력하세요");
            return;
        }
        if (seat[seatPos - 1] == 1) {
            seat[seatPos - 1] = 0;
            System.out.println(seatPos + "번 좌석 예매 취소 완료");
            printSeat();
        } else {
            System.out.println("해당 좌석은 예약되어 있지 않습니다");
        }
    }
    public int totalAmount() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * price;
    }

}
