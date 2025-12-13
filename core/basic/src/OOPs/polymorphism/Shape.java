package OOPs.polymorphism;

public class Shape {

    public void area(double radus) {
        double ar = Math.PI * Math.pow(radus, 2);
        System.out.println("Area of cicle = " + ar);
    }

    public void area(int side) {
        int ar = side * side;
        System.out.println("Area of square = " + ar);
    }

    public void area(int len, int breadth) {
        int area = len * breadth;
        System.out.println("Area of rectangle is " + area);
    }

}
