package Exercise3;

public class Mouse implements Movable, Edible{
    @Override
    public void beEaten() {
        System.out.println("Mouse is eaten");
    }

    @Override
    public void move() {
        System.out.println("Mouse moves");
    }
}
