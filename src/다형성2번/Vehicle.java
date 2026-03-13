package 다형성2번;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    public void move() {
        System.out.println("택시가 달립니다.");
    }
}
class SportCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
//    void drive(Vehicle vehicle) {
//        System.out.print(name + "의 ");
//        vehicle.move();
//    }
    void drive(Bus bus) {
        System.out.print(name + "이 버스를 운전합니다.");
        bus.move();
    }
    void drive(Taxi taxi) {
        System.out.print(name + "이 택시를 운전합니다.");
        taxi.move();
    }
    void drive(SportCar sportCar) {
        System.out.print(name + "이 스포츠카를 운전합니다.");
        sportCar.move();
    }
    void drive(Truck truck) {
        System.out.print(name + "이 트럭을 운전합니다.");
        truck.move();
    }
}
class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("트럭이 짐을 싣고 달립니다.");
    }
}