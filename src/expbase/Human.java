package expbase;

public class Human {
    public Animal pet;
    final public String name;
    public int age;
    private Car car;
    private Double Salary;

    public Human(String name) {
        this.name = name;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane " + java.time.LocalDateTime.now());
        return this.Salary;
    }

    public double setSalary(double Salary) {
        if (Salary < 0) {
            System.out.println("Wynagrodzenie nie może być ujemne!");
        } else {
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Proszę odebrać aneks u Pani Hani.");
            System.out.println("Twoje dane trafiły do ZUS i US.");
            this.Salary = Salary;
            return this.Salary;
        }
        return Salary;
    }
}
