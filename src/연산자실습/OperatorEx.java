package 연산자실습;
// 윤년 계산하기
// 1. 연도가 4로 나누어 떨어짐 (4의 배수)
// 2. 100으로 나누어 떨어지면 윤년이 아님 (4의 배수이고 100의 배수가 아님)
// 3. 400으로 나누어 떨어지면 윤년임

// [100의 자리 정수 나누어 대입]
// 정수 입력 : 649
//100의 자리 정수 : 6
// 10의 자리 정수 : 4
// 1의 자리 정수 : 9
// 이중 가장 큰 수 출력

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //년도 입력 받기
        System.out.print("년도 입력 : ");
        int year = sc.nextInt();
        //윤년 판별하기
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 평년입니다.");
        }
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = in.nextInt();
        int a = num / 100; // 100의 나눈 몫을 구하면 됨
        int b = (num % 100) / 10; // 100으로 나눈 나머지에서 10으로 나눈 몫을 구함
        int c = num % 10; // 10으로 나눈 나머지
        System.out.println("100의 자리 : " + a + ", 10의 자리 : " + b + ", 1의자리 : " + c);
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("이중 가장 큰 수 : " + max);

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int rst1 = val1 + val2 * val3; // *, / 은 +, - 우선순위가 높음, 30
        int rst2 = (val1 + val2) * val3; // () 작은 괄호는 연산자 우선 순위가 가장 높음, 50
        int rst3 = val1 + (++val2) * val3; // 값 증가 후 곱셈, 덧셈 수행, 35
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
    }
}
