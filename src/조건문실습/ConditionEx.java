package 조건문실습;
// 시간과 분을 입력 받아 45분 일찍 시간이 설정되도록 구현
// 23 45 => 23 00
// 0 30 => 23 45
// 0 45 => 0 0
// 13 40 => 12 55

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 시간 / 분 입력 받기
        // 계산 편의를 위해서 전부 분으로 환산
        // 환산된 분이 45 미만이면 하루치 시간을 더 해줌
        // 환산된 시간에서 45를 빼줌
        // 다시 시간과 분으로 환산 후 결과 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 / 분 입력 : ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int totalMinute = (h * 60) + m;

        if (totalMinute < 45) {
            totalMinute += 1440;
        }
        totalMinute -= 45;
        h = totalMinute / 60;
        m = totalMinute % 60;
        System.out.println("설정된 알람 : " + h + "시 " + m + "분");
    }
}
