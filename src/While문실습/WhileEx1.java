package While문실습;
// 이름은 문자열로 입력
// 나이는 정수로 입력 받는데, 0 ~ 199까지는 정상 입력, 나머지수는 "나이 입력이 잘 못 되었습니다." 재 입력 받기
// 성별은 문자로 입력, 'M', 'm', 'F', 'f'만 정상 입력으로 간주하고 다른 문자이면 "성별을 잘 못 입력 하셨습니다." 재 입력 받기
// 직업은 정수로 입력 [1]회사원 [2]학생 [3]주부 [4]무직, 1 ~ 4 사이의 값이 아니면 "직업을 잘 못 입력 하셨습니다." 재 입력받기
// - 출력은 "회사원", "학생", "주부", "무직"
// 모든 입력이 정상적으로 입력되면 출력 하기

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        int age;
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) break;
            System.out.println("나이 입력이 잘 못 되었습니다.");
        }
        char gender;
        while (true) {
            System.out.print("성별 입력(M/F) : ");
            gender = sc.next().charAt(0);
            if (gender =='M' || gender == 'm' || gender == 'F' || gender == 'f') break;
            System.out.println("성별을 잘 못 입력 하셨습니다.");
        }
        int job;
        String jobName = "";
        while (true) {
            System.out.print("직업 선택 [1]회사원 [2]학생 [3]주부 [4]무직 : ");
            job = sc.nextInt();
            if (job >= 1 && job <= 4) break;
            System.out.println("직업을 잘 못 입력 하셨습니다.");
        }
        switch (job) {
            case 1: jobName = "회사원"; break;
            case 2: jobName = "학생"; break;
            case 3: jobName = "주부"; break;
            case 4: jobName = "무직"; break;
        }
        System.out.println("=".repeat(32) + "\n회원정보\n" + "=".repeat(32));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + (gender == 'M' || gender == 'm' ? "남성" : "여성"));
        System.out.println("직업 : " + jobName);
        System.out.println("=".repeat(32));

    }
}
