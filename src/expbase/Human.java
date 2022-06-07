package expbase;

import expbase.devices.Car;

public class Human {
    public Animal pet;
    final public String name;
    public int age;
    private Car car;
    private Double salary;

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

    public Human(String name) {
        this.name = name;
    }

    public Car getCar() {
        return this.car;
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
