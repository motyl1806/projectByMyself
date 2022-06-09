package expbase.devices;

import expbase.Human;
import jdk.jshell.spi.ExecutionControl;

public class Phone {
    public String name;
    public Double screenSize;
    public String os;
    public Double value;

    public Phone(String name, Double screenSize, String os, Double value) {
        this.name = name;
        this.screenSize = screenSize;
        this.os = os;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", value=" + value +
                '}';
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new ExecutionControl.NotImplementedException(("not implemented"));
    }
}
