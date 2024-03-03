package Exercise3;

public class Dog implements Movable, Eat{
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }
}
