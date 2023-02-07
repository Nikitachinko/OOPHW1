package transport;

import java.security.Key;

public class Car extends Transport {

    private double engineVolume;


    private String gear;

    private final String tupeOfBody;

    private String regNumber;

    private final int capacity;

    private boolean summerTyres;
    private Key key;


    public static class Key{
        private final boolean remoteRun;

        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "Удаленный запуск двигателя" : "без удаленного запуска двигателя ") + " ," +
                    (withoutAccess ? "бесключевой доступ" : "безключевой доступ отсутствует");
        }
    }


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String gear,
               String tupeOfBody,
               String regNumber,
               int capacity,
               boolean summerTyres,
               Key key) {
        super(brand, model, year, country, color, maxSpeed);



        setEngineVolume(engineVolume);

        this.engineVolume = engineVolume;


        setGear(gear);
        if(tupeOfBody==null||tupeOfBody.isEmpty()){
            tupeOfBody= "Седан";
        }
        this.tupeOfBody = tupeOfBody;
        setRegNumber(regNumber);
        if(capacity<=0){
            capacity = 0;
        }
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        setKey(key);

    }



    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }







    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if(gear==null||gear.isEmpty()){
            gear="МККП";
        }
        this.gear = gear;
    }

    public String getTupeOfBody() {
        return tupeOfBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if(regNumber==null||regNumber.isEmpty()){
            regNumber = "X000XX000";
        }
        this.regNumber = regNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key==null){
            key = new Key( false, false);
        }
        this.key = key;
    }

    public void changeTyres(int month){
        if ((month >= 11 && month <= 12)||(month>=1&&month<=3)) {
       summerTyres = false;
        }
        if (month>=4&&month<=10){
            summerTyres = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Объем двигателя  : " + engineVolume + " ," +
                "Коробка передач : " + gear + " ," +
                "Тип кузова : " + tupeOfBody + " ," +
                "Регистрационный номер : " + regNumber + "  ," +
                "Кол-во мест : " + capacity + " ," +
                (summerTyres?" Летнаяя ":" Зимняя  ")+ " резина " + " ," +
                key;
    }
}


