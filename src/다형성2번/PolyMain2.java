package 다형성2번;

public class PolyMain2 {
    public static void main(String[] args) {
        // 운전자 생성
        Driver driver = new Driver("박민");
        // 1. 버스
        Bus bus = new Bus();
        driver.drive(new Bus());
        // 2. 택시
        Taxi taxi = new Taxi();
        driver.drive(new Taxi());
        // 3. 스포츠카
        SportCar sportCar = new SportCar();
        driver.drive(new SportCar());

        // 실습 예제 : 차량을 추가 해보기
        Truck truck = new Truck();
        driver.drive(new Truck());
        // 오버라이딩 -> 오버로딩으로 변경 가능한지 검토(Driver 클래스의 drive 메서드)
    }
}
