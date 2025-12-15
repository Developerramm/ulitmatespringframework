package OOPs.mixed;

public class Elephant implements Animal{

    @Override
    public void makeSound() {
        System.out.println("trumpet is the sound of Elephant");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grasses and leaves");
    }

}
