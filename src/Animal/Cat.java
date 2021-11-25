package Animal;

public class Cat extends Animal {

    String name;
    int age;
    String habitat;
    Boolean isDometic;

    public Cat(String name, int age, String habitat, Boolean isDometic) {
        super(name,age, habitat, isDometic);
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.isDometic = isDometic;
    }

    @Override
    String animalName() {
        return this.name;
    }

    @Override
    int animalAge() {
        return this.age;
    }

    @Override
    String habitat() {
        return this.habitat;
    }

    @Override
    boolean isDomestic() {
        return false;
    }
}
