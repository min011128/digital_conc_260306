package For문;
// for(초기값;최종값;증감값) {}

import javax.swing.text.Style;
import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt();

//        for (int i = 0; i < num; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();
        // 정수 값을 입력 받음
        // 입력 받은 정수 값 범위의 5의 배수를 1줄에 10개씩 출력하기
//        Scanner in = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num1 = in.nextInt();
//        int cnt =0;
//        for (int i = 1; i <= num1; i++) {
//            if (i % 5 == 0) {
//                System.out.printf("%4d", i);
//                cnt++;
//                if (cnt % 10 == 0) {
//                    System.out.println();  // 10개 출력 후 줄바꿈
//                }
//            }
//        }
//        in.close();

        // 정수 num을 입력 받아 num * num 출력하기
        // 싱글 for문 사용하기
        // 입력 : 3
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // 2. 문자열을 입력 받아 역순으로 출력 하기
        //"ABCDEFG" => "GFEDCBA"
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num2 = sc.nextInt();
        for (int i = 1; i <= num2 * num2; i++) {
            System.out.print(i + "\t");
            if (i % num2 == 0) {
                System.out.println();
            }
        }
        System.out.print("문자열 입력 : ");
        String input = sc.next();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }
}
