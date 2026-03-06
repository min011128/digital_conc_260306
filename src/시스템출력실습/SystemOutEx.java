package 시스템출력실습;

public class SystemOutEx {
    public static void main(String[] args) {
        System.out.println("=".repeat(32));
        System.out.println("나를 소개합니다!");
        System.out.println("=".repeat(32));
        System.out.println("이름 : 박민");
        System.out.println("나이 : 26세");
        System.out.println("취미 : 음악감상, 독서, 글짓기");
        System.out.println("한마디 : \"안녕하세요, 잘 부탁합니다!\"");
        System.out.println("=".repeat(32));
        System.out.println("\t\tJAVA CAFE 영수증");
        System.out.println("=".repeat(32));
        System.out.printf("%-16s %3s %,6d원\n", "아메리카노", "2잔", 9000);
        System.out.printf("%-15s %4s %,7d원\n", "카페라떼", "1잔", 5500);
        System.out.printf("%-15s %3s %,6d원\n", "치즈케이크", "1조각", 6800);
        System.out.println("-".repeat(32));
        System.out.printf("%-15s  %,10d원\n", "합계", 21300);
        System.out.println("=".repeat(32));
        System.out.println("감사합니다. 또 방문해주세요!");
        System.out.println("-".repeat(32));
        System.out.println("\t\t구구단 3단");
        System.out.println("-".repeat(32));
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %2d\n", i, 3, i * 3);
        }
    }
}
