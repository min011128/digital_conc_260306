package 자동차만들기;

public abstract class Car {
        private final int FUELPRICE = 2000; // 기름 가격
        private int speed; // 속도
        private double fuel; // 연비
        private int tankSize; // 연료 탱크 크기
        private int seatNum;  // 좌석 수
        private String carName;  // 자동차 이름
        private int totalmov;  // 총 이동횟수
        private int totalDis;  // 총 이동거리
        private double totalFuel; // 총 연료 소모량


        public Car(String carName) {
            this.carName = carName;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public double getFuel() {
            return fuel;
        }

        public void setFuel(double fuel) {
            this.fuel = fuel;
        }

        public int getTankSize() {
            return tankSize;
        }

        public void setTankSize(int tankSize) {
            this.tankSize = tankSize;
        }

        public int getSeatNum() {
            return seatNum;
        }

        public void setSeatNum(int seatNum) {
            this.seatNum = seatNum;
        }

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public int mov(int passenger, int seatNum){ // 총 이동 횟수 계산
            this.totalmov = (int) Math.ceil((double) passenger / seatNum);
            return totalmov;
        }

        public int fuelCount(int distance){
            totalDis = distance * totalmov; // 총 이동 거리 계산
            totalFuel = (double) totalDis / fuel; // 총 연료 소모량 계산
            int rst = (int) Math.ceil(totalFuel / tankSize); // 총 주유 횟수 계산
            return rst;
        }

        public int totalMoney(){ // 총 비용 계산
            int money = (int) Math.ceil((double) totalFuel * FUELPRICE);
            return money;
        }

        public String totalTime(double weather){ // 이동 시간 계산
            double time = (double) totalDis / speed * weather;
            double totalMinutes = time * 60;
            int hour = (int) totalMinutes / 60;
            int min = (int) totalMinutes % 60;
            return hour + "시간 " + min + "분";
        }

        public abstract void applySpecialFunction();
}
