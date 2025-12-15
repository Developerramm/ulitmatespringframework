package OOPs.mixed;

public class UseCar {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("sony");
        Car car = new Car("Brazza", player);

        System.out.println(car);
    }

}
