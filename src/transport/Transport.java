package transport;

public    class  Transport<T extends Driver>    {
    private final String brand;
    private final String model;

    private  double engineVolume;
    private T driver;





    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver
        ){

        if (brand == null || brand.isEmpty()) {
            System.out.println("default");
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            System.out.println("default");
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

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
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }


    public  void startMove() {

    }

    public void finishMove() {

    }
    public void printInfo(){
        System.out.println("водитель " + driver.getName() + " управляет автомобилем " + getBrand()+ " и будет участвовать в заезде");
    }


    public String toString() {
        return "Марка : " + brand + " ," +
                "Модель : " + model + " ," +
                "Объем двигателя : " + engineVolume;




    }
}
