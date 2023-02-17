package transport;

public abstract class  Transport<T extends Driver> implements Campeting   {
    private final String brand;
    private final String model;

    private  double engineVolume;
    private T driver;
    private final Type type;
    public Transport(String brand, String model,double engineCapacity,T driver, Type type) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.type = type;
    }


//    if (brand == null || brand.isEmpty()) {
//            System.out.println("default");
//        }
//        this.brand = brand;
//        if (model == null || model.isEmpty()) {
//            System.out.println("default");
//        }
//        this.model = model;
//        setEngineVolume(engineVolume);
//        setDriver(driver);
//
//             }

//    public T getDriver() {
//        return driver;
//    }
//
//    public void setDriver(T driver) {
//        this.driver = driver;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            engineVolume = 1.6;
//        }
//        this.engineVolume = engineVolume;
//    }
//
//
//    public abstract void startMove();
//
//
//    public abstract void finishMove();
//    public abstract Type getType();
//    public abstract void printType();
//
//
//
public T getDriver() {
    return driver;
}

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving();

    public abstract  void finishMoving();
    public void printInfo(){
        System.out.println("Водитель " + getDriver() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    public abstract Type getType();
    public abstract void printType();

    @Override
    public String toString() {
        return "Тип транспорта: "+ getType() + " Brand: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", Водитель " + driver;
    }
//    @Override
//    public String toString() {
//        return "Марка : " + brand + " ," +
//                "Модель : " + model + " ," +
//                "Объем двигателя : " + engineVolume;
//
//
//
//
//    }
}
