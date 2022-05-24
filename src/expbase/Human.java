package expbase;

public class Human {
    public Animal pet;
    final public String name;
    public int age;
    private Car car;
    public String setCar;

    public Human(String name) {
        this.name = name;
    }
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
