 package 주사위게임;
// int rand = (int) (Math.random() * 6) + 1; // 1 ~ 6 사이의 임의의 정수를 생성

import java.util.Scanner;

public class RandomEx1 {
    public static void main(String[] args) {
        // 2개의 주사위를 굴려서 2개의 주사위 수가 같은 값이 나오면 무인도 탈출하기
        // 탈출 시 2개의 주사위 값을 표시하고, 몇 번 만에 탈출 했는데 회수 표시
        int count = 0;
        while (true) {
            count++;
            int rand1 = (int) (Math.random() * 6) + 1;
            int rand2 = (int) (Math.random() * 6) + 1;
            System.out.println("주사위 결과 : [" + rand1 + "], [" + rand2 + "]");
            if (rand1 == rand2) {
                System.out.println("무인도 탈출 성공!!");
                System.out.println("총 " + count + "회 만에 탈출하셨습니다.");
                break;
            }
        }
    }
}
