package 자동차만들기;

public class Bus extends Car {
    public Bus(String name) {
        super(name);
        this.setSpeed(250);
        this.setFuel(8);
        this.setTankSize(30);
        this.setSeatNum(2);
    }

    @Override
    public void applySpecialFunction() {  // 버스에 부가기능 추가
        System.out.println(getCarName() + " 의 부가기능 : 보조연료탱크 30L가 추가됩니다.");
        this.setTankSize(getTankSize() + 30);
    }
}
