package 자동차만들기;

import java.awt.*;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = 0; // 지역 별 거리 초기화
        int passengers = 0;  // 승객 수 초기화
        while (true) {
            System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            int areaChoice = sc.nextInt();
            switch (areaChoice) { // 이동지역 별 거리 지정
                case 1: distance = 400; break; // 부산
                case 2: distance = 150; break; // 대전
                case 3: distance = 200; break; //강릉
                case 4: distance = 300; break;  //광주
                default:  System.out.println("지역 선택을 잘못 하셨습니다");
                continue;
            }
            System.out.print("이동할 승객 수 (1 ~ 100) : ");
            passengers = sc.nextInt();
            if (passengers < 1 || passengers > 100) {  // 승객 수(1 ~ 100)에 대한 조건문)
                System.out.println("승객 수는 1 ~ 100 사이여야 합니다. 다시 입력하세요.");
                continue;
            }
            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carChoice = sc.nextInt();
            Car myCar = null;  // 차량 선택 초기화
            if (carChoice == 1) {
                myCar = new SportsCar("스포츠카");
            } else if (carChoice == 2) {
                myCar = new Sedan("승용차");
            } else if (carChoice == 3) {
                myCar = new Bus("버스");
            } else {
                System.out.println("차량 선택이 잘못되었습니다.");
                continue;
            }
            System.out.print("부가기능 선택 [1]ON [2]OFF : ");
            int option = sc.nextInt();
            boolean isOptionOn = false;  // 부가기능 초기화
            if (option == 1) {
                isOptionOn = true;
            } else if (option == 2) {
                isOptionOn = false;
            } else {
                System.out.println("옵션 선택이 잘못되었습니다.");
                continue;
            }
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            int weatherChoice = sc.nextInt();
            sc.nextLine();
            double weatherWeight = 0; // 날씨 초기화
            if (weatherChoice == 1) {
                weatherWeight = 1.0;  // 맑음에 대한 보정 계수
            } else if (weatherChoice == 2) {
                weatherWeight = 1.2;  // 비에 대한 보정 계수(20%)
            } else if (weatherChoice == 3) {
                weatherWeight = 1.4;  // 눈에 대한 보정 계수(40%)
            } else {
                System.out.println("날씨 선택이 잘못되었습니다.");
                continue;
            }
                System.out.println("\n--- 상세 기능 설정 ---");
                if (myCar instanceof CarAirCon) {
                    System.out.print(myCar.getCarName() + " 에어컨 [1]ON [2]OFF : ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    ((CarAirCon) myCar).setCarAirCon(choice);
                    System.out.println(myCar.getCarName() + ": 에어컨 " + (choice == 1 ? "ON" : "OFF"));
                }
                if (myCar instanceof Audio) {
                    System.out.print(myCar.getCarName() + " 오디오 [1]ON [2]OFF : ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    ((Audio) myCar).setAudio(choice);
                    System.out.println(myCar.getCarName() + ": 오디오 " + (choice == 1 ? "ON" : "OFF"));
                }
                if (myCar instanceof AutoPilot) {
                    System.out.print(myCar.getCarName() + " 자율주행 [1]ON [2]OFF : ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    ((AutoPilot) myCar).setAutoPilot(choice);
                    System.out.println(myCar.getCarName() + ": 자율주행 " + (choice == 1 ? "ON" : "OFF"));
                }
                System.out.println("설정 완료");

                System.out.println("\n=====" + myCar.getCarName() + "=====");
            if (isOptionOn) {
                myCar.applySpecialFunction();
            }
            myCar.mov(passengers, myCar.getSeatNum()); // 총 이동 횟수
            int refuel = myCar.fuelCount(distance);  // 총 연료 소모량
            int cost = myCar.totalMoney(); // 총 비용
            String time = myCar.totalTime(weatherWeight);  // 이동 시간
            System.out.printf("총 비용 : %,d원\n", cost);
            System.out.println("총 주유 횟수 : " + refuel + "회");
            System.out.println("총 이동 시간 : " + time);
            if (myCar instanceof CarAirCon) {
                String status = ((CarAirCon) myCar).isAirConOn() ? "ON" : "OFF";
                System.out.println("에어컨 : " + status);
            }
            if (myCar instanceof Audio) {
                System.out.println("오디오 : " + (((Audio)myCar).isAudioOn() ? "ON" : "OFF"));
            }
            if (myCar instanceof AutoPilot) {
                System.out.println("자율주행 : " + (((AutoPilot)myCar).isAutoPilotOn() ? "ON" : "OFF"));
            }
            break;








        }

    }
}
