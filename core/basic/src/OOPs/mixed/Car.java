package OOPs.mixed;

public class Car {

    private String name;
    private MusicPlayer player;

    public Car(String name, MusicPlayer player) {
        this.name = name;
        this.player = player;
    }

    public void startPlayer(){
        player.start();
    }

    public void stopPlayer(){
        player.stop();
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", player=" + player + "]";
    }

}
