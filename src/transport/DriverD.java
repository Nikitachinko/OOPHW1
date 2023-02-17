package transport;

public class DriverD extends Driver {
    public DriverD(String name, boolean hasDriverLicense, int experienceYear) {
        super(name, hasDriverLicense, experienceYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D" + getName() + " начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории B" + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории B" + getName() + " заправляет авто");
    }
}
