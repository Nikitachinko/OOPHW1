package transport;

public class Bus extends Transport<DriverD> {
    private final CapacityType capacityType;

    enum CapacityType{
        EXTRA_SMALL (null,10),
        SMALL (null,25),
        MEDIUM (25,50),
        LARGE (50,80),
        ESPECIALLY_LARGE(80,120);

        private final Integer lowerLimitsOfCapacity;
        private final Integer upperLimitsOfCapacity;

        CapacityType(Integer lowerLimitsOfCapacity, Integer upperLimitsOfCapacity){
            this.lowerLimitsOfCapacity = lowerLimitsOfCapacity;
            this.upperLimitsOfCapacity = upperLimitsOfCapacity;
        }

        public Integer getLowerLimitsOfCapacity() {
            return lowerLimitsOfCapacity;
        }

        public Integer getUpperLimitsOfCapacity() {
            return upperLimitsOfCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость: " +
                    (getLowerLimitsOfCapacity() == null ? "" : "от " + getLowerLimitsOfCapacity() + "") +
                    (getUpperLimitsOfCapacity() == null ? "" : " до " + getUpperLimitsOfCapacity() + "");
        }
    }

    public Bus(String brand, String model, double engineCapacity, DriverD driver, Type type, CapacityType capacityType) {
        super(brand, model, engineCapacity, driver, type);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    @Override
    public String toString() {
        return capacityType +
                " " + super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус марки " + getBrand() + "остановился");
    }


    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if (capacityType != null) {
            System.out.println("Автобус: " + capacityType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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


