package 영화표예매하기;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // MovieTicket class를 사용해 객체 생성
        // 입력을 받기 위한 스캐너 객체 생성
        // 메뉴 기능 구현을 위해 무한 반복문
        // 메뉴 이름 출력
        // 메뉴 선택 하기
        // 선택된 메뉴 실행
        MovieTicket movieTicket = new MovieTicket(12000);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 영화표 예매 시스템 ===");
            System.out.println("1. 예매하기");
            System.out.println("2. 취소하기");
            System.out.println("3. 종료하기");
            System.out.print("메뉴 선택 : ");
            int select = sc.nextInt();
            if (select == 1) {
                movieTicket.selectSeat();
            } else if (select == 2) {
                movieTicket.cancelSeat();
            } else if (select == 3) {
                System.out.println("총 판매 금액 : " + movieTicket.totalAmount() + "원");
                break;
            } else {
                System.out.println("메뉴 선택이 잘못되었습니다. 다시 입력하세요.");
            }
        }
    }
}
