package transport;

public class Truck extends Transport<DriverC>{
    private final LoadCapacity loadCapacity;

    enum LoadCapacity {
        N1(null,3.5F),
        N2(3.5F,12F),
        N3(12F,null);

        private final Float upperLoadLimits;
        private final Float lowerLoadLimits;

        LoadCapacity(Float lowerLoadLimits, Float upperLoadLimits) {
            this.lowerLoadLimits = lowerLoadLimits;
            this.upperLoadLimits = upperLoadLimits;
        }

        public Float getUpperLoadLimits() {
            return upperLoadLimits;
        }

        public Float getLowerLoadLimits() {
            return lowerLoadLimits;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: " +
                    (getLowerLoadLimits() == null ? "" : "от " + getLowerLoadLimits() + " тонн ") +
                    (getUpperLoadLimits() == null ? "" : "до " + getUpperLoadLimits() + " тонн.");
        }
    }

    public Truck(String brand, String model, double engineCapacity, DriverC driver, Type type, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, driver, type);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    @Override
    public String toString() {
        return loadCapacity +
                " " + super.toString();
    }


    public void startMove() {
        System.out.println("Грузовик марки: " + getBrand() + " начал движение!");
    }


    public void finishMove() {
        System.out.println("Грузовик марки: " + getBrand() + " закончил движение!");
    }
    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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
