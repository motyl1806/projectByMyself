package expbase;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_WEIGHT = 3.0;
    static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.5;
    private static final Double DEFAULT_WALK_LOOSE = 0.5;

    public final String species;
    private Double weight;
    public String name;
    public Boolean isAlive;

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }

    public Animal(String species) {
        this.species = species;
        this.weight = weight;

        switch (this.species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public void feed() {
        if (isAlive) {
            weight += DEFAULT_FOOD_WEIGHT;
            System.out.println("Yummy!");
        } else {
            System.out.println("Your puppy did not survive");
        }
    }

    public Double takeForWalk() {
        if (isAlive) {
            weight -= DEFAULT_WALK_LOOSE;
            System.out.println("Gogogo!");
        } else {
            System.out.println("Your puppy did not survive");
        }
        return this.weight;
    }
}
