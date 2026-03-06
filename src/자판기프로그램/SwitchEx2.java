package 자판기프로그램;
// 매뉴 선택이 잘못된 경우 재 입력 요구하도록 수정

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(32));
        System.out.println("\t자판기에 오신걸 환영합니다!");
        System.out.println("=".repeat(32));
        System.out.println("1. 콜라 - 1,500원");
        System.out.println("2. 사이다 - 1,500원");
        System.out.println("3. 커피 - 1,000원");
        System.out.println("4. 생수 - 500원");
        System.out.println("=".repeat(32));
        System.out.print("투입 금액 입력 : ");
        int inputMoney = sc.nextInt();
        String productName = "";
        int price = 0;
        while (true) {  // 무한 반복문에 대한 탈출 조건도 break
            System.out.print("메뉴 번호 선택 : ");
            int menuNum = sc.nextInt();
            switch (menuNum) {
                case 1:
                    productName = "콜라";
                    price = 1500;
                    break;
                case 2:
                    productName = "사이다";
                    price = 1500;
                    break;
                case 3:
                    productName = "커피";
                    price = 1000;
                    break;
                case 4:
                    productName = "생수";
                    price = 500;
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    continue;
            }
            break;
        }
        System.out.println("=".repeat(32));

        if (inputMoney >= price) {
            int change = inputMoney - price;
            System.out.println("✅ " + productName + " 가 나왔습니다!");
            System.out.println("투입 금액 : " + inputMoney + "원");
            System.out.println("상품 금액 : " + price + "원");
            System.out.println("거스름돈 : " + change + "원");
        } else {
            int lackMoney = price - inputMoney;
            System.out.println("잔액이 부족합니다.");
            System.out.println("투입 금액 : " + inputMoney + "원");
            System.out.println("필요 금액 : " + price + "원");
            System.out.println("부족 금액 : " + lackMoney + "원");
        }
        System.out.println("=".repeat(32));
        sc.close();
    }
}
