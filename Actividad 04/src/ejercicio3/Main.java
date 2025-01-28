package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();

        for (Animal animal : animals) {
            System.out.println(animal.getScientificName());
            System.out.println("Sound: " + animal.getSound());
            System.out.println("Food: " + animal.getFood());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
