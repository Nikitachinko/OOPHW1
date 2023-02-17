package transport;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int experienceYear;

    public Driver(String name, boolean hasDriverLicense, int experienceYear) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.experienceYear = experienceYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();


}
