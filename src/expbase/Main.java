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
        Car mustang = new Car("Ford","Mustang");
        Car mustang2 = new Car("Ford","Mustang");

        System.out.println(mustang.equals(mustang2));
        System.out.println(mustang.equals(seicento));
        System.out.println(mustang2.equals(seicento));

//        System.out.println(mustang);
//        System.out.println(mustang2);

        seicento.milleage = 30000;
        seicento.horsePower = 55;
        seicento.value = 3000;
        marcin.setCar(seicento);

        {
        }
        }
        }
