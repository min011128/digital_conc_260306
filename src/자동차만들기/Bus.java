package 자동차만들기;

public class Bus extends Car implements CarAirCon, AutoPilot {
    private boolean isAirConOn;
    private boolean isAutoPilotOn;
    public Bus(String name) {
        super(name);
        this.setSpeed(150);
        this.setFuel(5);
        this.setTankSize(100);
        this.setSeatNum(20);
    }

    @Override
    public void applySpecialFunction() {  // 버스에 부가기능 추가
        System.out.println(getCarName() + " 의 부가기능 : 보조연료탱크 30L가 추가됩니다.");
        this.setTankSize(getTankSize() + 30);
    }

    @Override
    public void setAutoPilot(int mode) {
        if (mode == AutoPilot.powerON) {
            if (!isAutoPilotOn) {
                System.out.println("자율 주행이 시작합니다. (제한 속도 -10%)");
                this.setSpeed((int)(this.getSpeed() * 0.9));
                isAutoPilotOn = true;
            } else {
                System.out.println("이미 자율 주행이 작동 중 입니다.");
            }
        } else if (mode == AutoPilot.powerOFF) {
            if (isAutoPilotOn) {
                System.out.println("자율 주행을 종료합니다.");
                this.setSpeed((int)(this.getSpeed() / 0.9));
                isAutoPilotOn = false;
            } else {
                System.out.println("이미 자율주행이 종료되었습니다.");
            }
        }
    }

    @Override
    public boolean isAutoPilotOn() {
        return this.isAutoPilotOn;
    }

    public String getAutoPilotStatus() {
        return isAutoPilotOn ? "ON" : "OFF";
    }

    @Override
    public void setCarAirCon(int mode) {
        if (mode == CarAirCon.AC_ON) {
            if (!isAirConOn) {
                System.out.println("에어컨이 켜집니다 연비가 5% 감소됩니다.");
                this.setFuel(this.getFuel() * 0.95);
                isAirConOn = true;
            } else {
                System.out.println("에어컨이 이미 켜져 있습니다.");
            }
        } else if (mode == CarAirCon.AC_OFF) {
            if (isAirConOn) {
                System.out.println("에어컨을 끕니다.");
                this.setFuel(this.getFuel() / 0.95);
                isAirConOn = false;
            } else {
                System.out.println("에어컨이 이미 꺼져 있습니다.");
            }
        }
    }

    @Override
    public boolean isAirConOn() {
        return this.isAirConOn;
    }

    public String getAirConStatus() {
        return isAirConOn ? "ON" : "OFF";
    }
}
