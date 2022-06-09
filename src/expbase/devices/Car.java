package expbase.devices;

import java.util.Objects;

public class Car {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public double horsePower;
    public int milleage;
    String color;
    public int value;

    @Override
    public String toString() {
        return "Car{" +
                ", producent='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", milleage=" + milleage +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.milleage = milleage;
        this.horsePower = horsePower;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.horsePower, horsePower) == 0 && milleage == car.milleage && value == car.value && Objects.equals(producer, car.producer) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, horsePower, milleage, color, value);
    }

    public void turnOn() {
        System.out.println("dydydydy");
        System.out.println("dydydydy");
    }

}