package transport;

public class DriverC extends Driver {
    public DriverC(String name,
                   boolean hasDriverLicense,
                   int experienceYear) {
        super(name, hasDriverLicense, experienceYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C" + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C" + getName() + " начал движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C" + getName() + " начал движение");
    }
}
