package OOPs.pratice;

public class Box {

    private int length;
    private int breadth, height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(int side) {
        this(side,side,side);
        // length = side;
        // breadth = side;
        // height = side;
    }

    public Box() {
        this(0,0,0);
        // length = 0;
        // breadth = 0;
        // height = 0;
    }

    @Override
    public String toString() {
        return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }

}
