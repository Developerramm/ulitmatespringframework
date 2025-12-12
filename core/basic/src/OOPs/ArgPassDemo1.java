package OOPs;

public class ArgPassDemo1 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("After increment x = " + x + " y = " + y);
        increment(x,y);
        System.out.println("After increment x = " + x + " y = " + y);

    }

    public static void increment(int x, int y){
        x = x + 5;
        y = y + 10;
    }
}
