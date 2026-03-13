package 회원관리;

public class Member {
    private static int totalCount = 0;
    private int userNum;
    private String name;
    private String id;
    private String pw;
    private int age;
    public Member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
        totalCount++;
        this.userNum = totalCount;
    }
    public void printInfo() {
        System.out.printf("회원정보 : %d | 이름 : %s | 아이디 : %s | 나이 : %d세\n", userNum, name, id, age);
    }
    public static void decreaseCount() {
        totalCount--;
    }
    public static int getTotalCount() { return totalCount; }
    public String getId() { return id; }
    public String getPw() { return pw; }
    public void setPw(String pw) { this.pw = pw; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
}
