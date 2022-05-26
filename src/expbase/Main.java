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

        Human marcin = new Human ("Marcin");
        marcin.setSalary(2500.0);
        System.out.println("Wynagrodzenie Marcina wynosi: " + marcin.getSalary() + "PLN");

        Car seicento = new Car("Fiat", "Seicento");
        seicento.milleage = 30000;
        seicento.horsePower = 55;
        seicento.value = 3000;
        marcin.setCar(seicento);
    }
}
