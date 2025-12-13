package OOPs.inheritance;

public class Circle {

    private int radius;
    private final double pi = 3.14;

    public Circle(int r){
        radius = r;
    }

    public void show(){
        // ++pi;
        System.out.println("Pi is " + pi + " radius = " + radius);
    }

    public void showArea(){
        double area = radius * radius * pi;
        System.out.println(area);
    }



}
