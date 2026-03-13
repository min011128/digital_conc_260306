package 문자열실습;

// 1번 : 입력 받은 문자열에 대해 대소문자 변경
// 입력 : AbCdEfG => aBcDeFg
// 문자열 에서 chatAt()을 이용해 추출하고 추출된 문자가 대문자 인지 소문자인지 판별해서 풀기

// 2번 : 문자열 추가 하기 : lenth(), sustring()
// 2개의 문자열을 변수 s와 k에, 양의 정수를 정수형 변수 n에 각각 전달 받아,
// s 문자열의 뒤 부분의 n개 문자를 k문자열 앞에 끼워 넣는 코드 작성
// 입력 : s = "seoul", k = "Korea", n = 2
// 결과 : ulkorea

// 3번 : 알고리즘 문제 풀이 > 3단계-중급문제 > KMP는 왜 KMP일까?
// 입력 : Knuth-Morris-Pratt => KMP
// - 대문자만 골라내서 출력하는 방법
// - 첫번째 문자 출력 이후 '-' 문자를 찾아서 그 다음에 오는 문자 출력
// - split("-") 문자열을 부분 문자열로 분리하고 부분 문자열의 첫번째 문자 출력
// - 문자열을 문자 배열로 바꾸고 ASCII 코드값으로 대문자 추출 하는 방식

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        // 실습문제 1번
        // caseConvertEx();
        // 실습 문제 2번
        // stringInsertEx();
        // 실습 문제 3번
        kmpAlogorithmEx();
    }
    static void caseConvertEx() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 입력 : ");
        String input =sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println("결과 : " + result);
    }
    static void stringInsertEx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[실습 문제 2번]");
        System.out.print("s 입력 (예 : seoul) : ");
        String s = sc.next();
        System.out.print("k 입력 (예 : Korea) : ");
        String k = sc.next();
        System.out.print("n 입력 (예 : 2) : ");
        int n = sc.nextInt();
        String sub = s.substring(s.length() - n);
        String result = sub + k;
        System.out.println("결과 : " + result);
    }
    static void kmpAlogorithmEx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[실습 문제 3번]");
        System.out.print("문자열 입력 : ");
        String name = sc.next();
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }
//        for (int i = 0; i < name.length(); i++) {
//            if (i == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }
//        String[] splitName = name.split("-");
//        for (String e : splitName) {
//            System.out.print(e.charAt(0));
//        }
        char[] chName = name.toCharArray();
        for (char e : chName) {
            if (e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}
