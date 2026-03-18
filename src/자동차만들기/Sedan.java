package 자동차만들기;

import 에어컨만들기.AirCon;

public class Sedan extends Car implements CarAirCon, Audio, AutoPilot {
    private boolean isAirConOn;
    private boolean isAutoPilotOn;
    private boolean isAudioOn;
    public Sedan(String name) {
        super(name);
        this.setSpeed(200);
        this.setFuel(12);
        this.setTankSize(45);
        this.setSeatNum(4);
    }

    @Override
    public void applySpecialFunction() {  // 승용차 부가기능
        System.out.println(getCarName() + "의 부가 기능: 좌석이 1석 추가됩니다.");
        this.setSeatNum(getSeatNum() + 1);
    }

    @Override
    public void setAudio(int mode) {
        if (mode == Audio.turnON) {
            this.isAudioOn = true;
            System.out.println("오디오가 켜집니다.");
        } else if (mode == Audio.turnOFF) {
            this.isAudioOn = false;
            System.out.println("오디오가 꺼집니다.");
        }
    }

    @Override
    public boolean isAudioOn() {
        return this.isAudioOn;
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