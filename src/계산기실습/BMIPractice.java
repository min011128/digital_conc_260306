package 계산기실습;
// BMI(체질량 지수) : BMI = 몸무게(kg) / 키(cm) x 키(cm)
// 18.5 미만 : 저체중
// 23 미만 : 정상
// 25 미만 : 과체중
// 25 이상 : 비만

import java.util.Scanner;

public class BMIPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요 : ");
        double height = sc.nextDouble(); // 실수 타입으로 입력 받음
        System.out.print("몸무게(kg)를 입력하세요 : ");
        double weight = sc.nextDouble();
        double meterHeight = height / 100;
        double bmi = weight / (meterHeight * meterHeight);
        System.out.printf("당신의 BMI는 %.2f 입니다.%n", bmi);
        if (bmi < 18.5) {
            System.out.println("저체중 입니다.");
        } else if (bmi < 23) {
            System.out.println("정상 체중 입니다.");
        } else if (bmi < 25) {
            System.out.println("과체중 입니다.");
        } else {
            System.out.println("비만 입니다.");
        }
    }
}
