package expbase.devices;

import java.util.Objects;

public class Car {
    public String producent;
    public String model;
    public double horsePower;
    public int milleage;
    String color;
    public int value;

    @Override
    public String toString() {
        return "Car{" +
                ", producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", milleage=" + milleage +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    public Car(String producent, String model) {
        this.producent = producent;
        this.model = model;
        this.milleage = milleage;
        this.horsePower = horsePower;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.horsePower, horsePower) == 0 && milleage == car.milleage && value == car.value && Objects.equals(producent, car.producent) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, model, horsePower, milleage, color, value);
    }
}
