package expbase;

public class Main {

    public static void main(String[] args) {
    Animal dog = new Animal("dog");
    dog.isAlive = true;
    dog.name = "Reksio";

        /* System.out.println(dog.getWeight());
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println(dog.getWeight());
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println(dog.getWeight()); */

        Car seicento = new Car("Fiat", "Seicento");
        seicento.milleage = 30000;
        seicento.horsePower = 55;

        Human marcin = new Human ("Marcin");
        marcin.setCar(seicento);
        System.out.println("Marcina samochód to : " + marcin.getCar().model);

        marcin.setCar(new Car("Ford","Mustang"));
        marcin.getCar();
        System.out.println("Marcina samochód to : " + marcin.getCar().model);

        marcin.setSalary(250.0);
        System.out.println("Wynagrodzenie Marcina wynosi: " + marcin.getSalary() + "BTC/msc");
    }
}
