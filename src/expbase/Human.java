package expbase;

import expbase.devices.Car;
import expbase.devices.Phone;

public class Human extends Animal {
    public Animal pet;
    public String name;
    public int age;
    private Car car;
    private Double salary;
    public Double cash;
    public Phone mobile;

    public Human(String marcin) {
        super("homo sapiens");
        this.cash = 10000.0;
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }

    public Car getCar() {
        return this.car;
    }
    public Phone getMobile() {
        return this.mobile;
    }
    public void setMobile(Phone mobile){
    this.mobile = mobile;
    }

    public void setCar(Car car) {
        if (this.salary > car.value){
            System.out.println("Kupiłeś samochód za gotówkę! :" + car.model);
            this.car = car;
        } else if (this.salary > car.value / 12.0){
            System.out.println("Kupiłeś samochód na kredyt :" + car.model);
            this.car = car;
        } else {
            System.out.println("Nie stać Cię na ten samochód");
        }
    }

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public double setSalary(double Salary) {
        if (Salary < 0) {
            System.out.println("Wynagrodzenie nie może być ujemne!");
        } else {
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Proszę odebrać aneks u Pani Hani.");
            System.out.println("Twoje dane trafiły do ZUS i US.");
            this.salary = Salary;
            return this.salary;
        }
        return Salary;
    }
}
