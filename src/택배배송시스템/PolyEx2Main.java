package 택배배송시스템;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class PolyEx2Main {
    public static void main(String[] args) {
        Manager manager = new Manager("박민");
        Scanner sc = new Scanner(System.in);
        System.out.print("배송 시스템 선택 [1]택배 배송 [2]퀵 배송 [3]항공 배송 : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: manager.send(new ParcelDelivery("CJ대한통운")); break;
            case 2: manager.send(new QuickDelivery("쿠팡로켓배송")); break;
            case 3: manager.send(new AirDelivery("FedEx")); break;
            default: System.out.println("배송 시스템을 잘못 선택하셨습니다.");
        }
    }
}
