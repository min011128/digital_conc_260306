package 배열실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력 받기 (5개의 가격을 연속으로 입력 받음)
// 세트 메뉴 가격 = (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 둘 중 싼 메뉴 가격) - 50(세트 할인)

// 실습 문제 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수 배열에 나누어 담아서 출력 하기

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] drinks = new int[2];
        System.out.println("햄버거 3개의 가격을 입력하세요 : ");
        int minBurger = 10000;
        for (int i = 0; i < burgers.length; i++) {
            burgers[i] = sc.nextInt();
            if (burgers[i] < minBurger) {
                minBurger = burgers[i];
            }
        }
        System.out.println("음료 2개의 가격을 입력하세요 : ");
        int minDrink = 10000;
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = sc.nextInt();
            if (drinks[i] < minDrink) {
                minDrink = drinks[i];
            }
        }
        int setPrice = (minBurger + minDrink) - 50;
        System.out.println("세트 메뉴 가격 : " + setPrice);

        System.out.println("\n[실습 문제 2번]");
        int[] nums = new int[8];
        int[] odd = new int[8];
        int[] even = new int[8];
        int oIdx = 0;
        int eIdx = 0;
        System.out.println("정수 8개 입력 : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] % 2 == 0) {
                even[eIdx] = nums[i];
                eIdx++;
            } else {
                odd[oIdx] = nums[i];
                oIdx++;
            }
        }
        System.out.print("홀수 배열 : ");
        for (int i = 0; i < oIdx; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.print("\n짝수 배열 : ");
        for (int i = 0; i < eIdx; i++) {
            System.out.print(even[i] + " ");
        }
        sc.close();
    }
}
