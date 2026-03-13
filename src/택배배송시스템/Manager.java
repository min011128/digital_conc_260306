package 택배배송시스템;

public class Manager {
    String name;
    public Manager(String name) {
        this.name = name;
    }
    public void send(Delivery d) {
        System.out.println(name + "매니저가 " + d.getCompany() + "회사의 배송을 지시합니다.");
        d.deliver();
        System.out.println();
    }
}
