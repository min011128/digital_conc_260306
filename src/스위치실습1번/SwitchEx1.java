package 스위치실습1번;
// 좌변 값, 연산자, 우변값을 입력 받아 산술 연산(+, -, *, /, %)을 수행하는 스위치문 만들기
// 입력 : 23 + 45
// 출력 : 68

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 (예: 11 + 34) : ");
        int x = sc.nextInt();
        String op = sc.next(); // 문자 입력 (연산자)
        int y = sc.nextInt();
        int result = 0;
        switch (op) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            case "%":
                result = x % y;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }
        System.out.println("출력 : " + result);
    }
}
