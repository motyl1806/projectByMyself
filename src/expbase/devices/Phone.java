package expbase.devices;

public class Phone {
    public Double screenSize;
    public String os;
    public Double value;

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", value=" + value +
                '}';
    }

    public Phone(Double screenSize, String os, Double value) {
        this.screenSize = screenSize;
        this.os = os;
        this.value = value;
    }
}
