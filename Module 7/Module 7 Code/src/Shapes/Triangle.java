package Shapes;

public class Triangle extends Figure{
    double h;
    double w;

    @Override
    public double getArea() {
        return (h * w) / 2;
    }
}
