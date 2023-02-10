package transport;

import java.security.Key;

public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки: " + getBrand() + " начал движение!");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки: " + getBrand() + " закончил движение!");
    }
    public void pitStop(){
        System.out.println("Пит стоп у автомобиля");
    }
    public void theBestTime(){
        int minT=70;
        int maxT =120;
        int maxTime = (int) (minT +( maxT-minT)* Math.random());
        System.out.println("Лучшее время круга для автомобиля " + maxTime);

    }
    public void maxSpeed(){
        int minSp=100;
        int maxSp =160;
        int maxSpeed = (int) (minSp +( maxSp-minSp)* Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);
    }
}


