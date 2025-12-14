package OOPs.mixed;

public class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("a Lion roars");
    }

    @Override
    public void eat() {
        System.out.println("A Lion eats flesh");
    }

}
