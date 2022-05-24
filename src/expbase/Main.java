package expbase;

public class Main {

    public static void main(String[] args) {
    Animal dog = new Animal("dog");
    dog.isAlive = true;
    dog.name = "Reksio";

        System.out.println(dog.getWeight());
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println(dog.getWeight());
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println(dog.getWeight());
    }
}
