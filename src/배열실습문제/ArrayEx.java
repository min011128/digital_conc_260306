package 배열실습문제;

import java.util.Scanner;

// 알고리즘 문제풀이 > 3단계 중급 문제 > 핸드폰 요금
// - 영식 요금제 : 30초마다 10원, 기본 통화 10
// - 민식 요금제 : 60초마다 15원, 기본 통화 15
// - 통화의 개수 : 20
// - 통화 시간은 10000 보다 작은 자연수
// 알고리즘 문제풀이 > 3단계 중급 문제 > 저항
// - 3개 저항값을 색상으로 입력
// - 첫번째 : 10의 자리 값
// - 두번째 : 1의 자리 값
// - 세번째 : 곱의 자리
public class ArrayEx {
    public static void main(String[] args) {
        // 실습 문제 1번
        // phoneBillEx();
        // 실습 문제 2번
         resistanceEx();
    }
    static void phoneBillEx() {
        Scanner sc = new Scanner(System.in);
        int[] call = new int[20]; // 통화의 개수
        int yPay = 0, mPay = 0;  // 영식 요금제와 민식 요금제의 요금 계산을 위한 변수
        System.out.print("통화 횟수 입력 : ");
        int n = sc.nextInt();
        System.out.print("통화 시간 입력 : ");
        for (int i =0; i < n; i++) {  // 통화 횟수에 대한 통화 시간을 잊력
            call[i] = sc.nextInt();  //  통화 시간 배열에 저장
        }
        for (int i = 0; i < n; i++) {
            yPay += (call[i] / 30) * 10 + 10; // 영식 요금제 통화당 요금을 누적
            mPay += (call[i] / 60) * 15 + 15; // 민식 요금제 통화당 요금을 누적
        }
        if (yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println("Y M " + yPay);
        }
    }
    static void resistanceEx() {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "gray", "white"};
        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000,
                10000000, 100000000, 1000000000};
        int fVal = 0, sVal = 0, tVal = 0;
        System.out.print("색 입력 : ");
        String fColor = sc.nextLine();
        System.out.print("색 입력 : ");
        String sColor = sc.nextLine();
        System.out.print("색 입력 : ");
        String tColor = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (fColor.equals(color[i])) fVal = i; // 입력 받은 컬러값과 배열 내의 컬러값이 같으면 해당 인덱스 값을 저장 함
            if (sColor.equals(color[i])) sVal = i; // 1의 자리
            if (tColor.equals(color[i])) tVal = mul[i];
        }
        System.out.println((long)((fVal * 10) + sVal) * tVal);
    }
}
