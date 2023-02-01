public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country) {
        if (brand == null || brand.isEmpty()) {
            System.out.println("default");
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            System.out.println("default");
        }
            this.model = model;
            if (engineVolume <= 0) {
                engineVolume = 1.5;
            }
            this.engineVolume = engineVolume;
            if (color == null || color.isEmpty()) {
                color = "Белый";
            }
            this.color = color;
            if (year <= 0) {
                year = 2000;
            }
            this.year = year;
            if (country == null || country.isEmpty()) {
                System.out.println("default");
            }
            this.country = country;

        }
        @Override
        public String toString () {
            return "Марка : " + brand + " ," +
                    "Модель : " + model + " ," +
                    "Объем двигателя  : " + engineVolume + " ," +
                    "Цвет : " + color + " ," +
                    "Год выпуска : " + year + " ," +
                    "Страна производитель : " + country;
        }
    }


