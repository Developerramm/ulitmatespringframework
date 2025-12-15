package OOPs.mixed;

public class UseAnimal {

    public static void main(String[] args) {
        Animal animal = new Elephant();
        animal.eat();
        animal.makeSound();

        animal = new Lion();
        animal.makeSound();
        animal.eat();
    }

}
