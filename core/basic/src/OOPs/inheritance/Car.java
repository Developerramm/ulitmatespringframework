package OOPs.inheritance;

public class Car extends Vehicle{

    public Car(){
        super("four wheeler");
        System.out.println("Car constructor is called");
    }

    public void reverse(){
        System.out.println("Car.reverse()");
    }

}
