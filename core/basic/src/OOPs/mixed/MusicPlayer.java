package OOPs.mixed;

public class MusicPlayer {

    private String name;

    public MusicPlayer(String name){
        this.name = name;
    }

    public void start(){
        System.out.println("MusicPlayer started) " + name);
    }

    public void stop(){
        System.out.println("MusicPlayer stopped " + name);
    }

    @Override
    public String toString() {
        return "MusicPlayer [name=" + name + "]";
    }


}
