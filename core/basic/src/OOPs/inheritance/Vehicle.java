package OOPs.inheritance;

public class Vehicle {

    public Vehicle(String type){
        System.out.println("Vehicle constructor is called " + type);
    }

    public Vehicle(){
        System.out.println("Vehicle default constructor is called");
    }

    public void start(){
        System.out.println("Vehicle.start()");
    }

    public void accelerate(){
        System.out.println("Vehicle.accelerate()");
    }

    public void turnLeft(){
        System.out.println("Vehicle.turnLeft()");
    }

    public void turnRight(){
        System.out.println("Vehicle.turnRight()");
    }

}
