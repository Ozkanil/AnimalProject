package Animal;

public class Runner {

    public static void main(String[] args) {
        System.out.println("======ANIMAL-1=======");

        Animal anm= new Cat("Sebastian", 22, "land", true);
        System.out.println(anm.animalAge());
        System.out.println(anm.name);

    }

}
