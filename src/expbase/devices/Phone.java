package expbase.devices;

public class Phone {
    public String brand;
    public String system;
    public int RAM;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", system='" + system + '\'' +
                ", RAM=" + RAM +
                '}';
    }

    public Phone(String brand, String system) {
        this.brand = brand;
        this.system = system;

    }
}
