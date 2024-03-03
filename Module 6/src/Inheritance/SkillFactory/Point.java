package Inheritance.SkillFactory;

public class Point {
    private double x, y;
    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.print("Point with coords: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private int color;
    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }

    public void print() {
        super.print();
        System.out.print(" and color " + color);
    }
}
