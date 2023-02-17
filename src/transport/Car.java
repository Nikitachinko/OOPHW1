package transport;

import java.security.Key;

public abstract class Car extends Transport <DriverB> {
    private final BodyType bodyType;
    public enum BodyType{
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        UNIVERSAL("Universal"),
        SUV("SUV"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Minivan");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType(){
            return bodyType;
        }

    }

    public Car(String brand, String model, double engineCapacity, DriverB driver, Type type, BodyType bodyType) {
        super(brand, model, engineCapacity, driver, type);
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType + " " + super.toString();
    }


    @Override
    public void startMove() {
        System.out.println("Автомобиль марки: " + getBrand() + " начал движение!");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки: " + getBrand() + " закончил движение!");
    }
    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void printType() {
        System.out.println("Тип автомобиля " + (this.bodyType != null ? this.bodyType.toString() : " Данных по транспортному средству недостаточно"));
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


