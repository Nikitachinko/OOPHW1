package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки: " + getBrand() + " начал движение!");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки: " + getBrand() + " закончил движение!");
    }
    public void pitStop(){
        System.out.println("Пит стоп у автобуса");
    }
    public void theBestTime(){
        int minT=100;
        int maxT =150;
        int maxTime = (int) (minT +( maxT-minT)* Math.random());
        System.out.println("Лучшее время круга для автобуса " + maxTime);

    }
    public void maxSpeed(){
        int minSp=80;
        int maxSp =120;
        int maxSpeed = (int) (minSp +( maxSp-minSp)* Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }
}


