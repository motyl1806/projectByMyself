package expbase.devices;

import expbase.Human;

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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
    if (seller.getCar() != this) {
        throw new Exception("Sprzedawca nie posiada tego samochodu");
    }
    if (buyer.cash < price) {
        System.out.println("Kupujący nie ma tyle pieniędzy");
    }
    buyer.cash -= price;
    seller.cash += price;
    buyer.car = this;
    seller.car = null;
        System.out.println("Sprzedano samochód");
    }

}