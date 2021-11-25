package Animal;

public abstract class Animal {

    String name;
    int age;
    String habitat;
    Boolean isDometic;

    public Animal() {
    }

    public Animal(String name, int age, String habitat, Boolean isDometic) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isDometic = isDometic;
    }

    abstract String animalName();
    abstract int animalAge();
    abstract String habitat();
    abstract boolean isDomestic();
}
