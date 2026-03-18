package 자동차만들기;

public class SportsCar extends Car implements CarAirCon, Audio {
    private boolean isAirConOn;
    private boolean isAudioOn;
    public SportsCar(String name) {
        super(name);
        this.setSpeed(250);
        this.setFuel(8);
        this.setTankSize(30);
        this.setSeatNum(2);
    }

    @Override
    public void applySpecialFunction() { // 스포츠카 부가기능
        System.out.println(getCarName() + "의 터보 모드: 속도가 20% 증가합니다.");
        this.setSpeed((int) Math.ceil((double) this.getSpeed() * 1.2));
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
