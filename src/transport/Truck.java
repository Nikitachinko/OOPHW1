package transport;

public class Truck extends Transport<DriverC>{

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки: " + getBrand() + " начал движение!");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки: " + getBrand() + " закончил движение!");
    }
    public void pitStop(){
        System.out.println("Пит стоп у грузовика");
    }
    public void theBestTime(){
        int minT=90;
        int maxT =140;
        int maxTime = (int) (minT +( maxT-minT)* Math.random());
        System.out.println("Лучшее время круга для грузовика " + maxTime);

    }
    public void maxSpeed(){
        int minSp=90;
        int maxSp =120;
        int maxSpeed = (int) (minSp +( maxSp-minSp)* Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);
    }

}
