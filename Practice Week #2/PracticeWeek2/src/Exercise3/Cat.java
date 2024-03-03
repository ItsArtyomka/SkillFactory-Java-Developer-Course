package Exercise3;

public class Cat implements Movable, Eat, Edible{
    @Override
    public void eat() {
        System.out.println("Cat eats.");
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }

    @Override
    public void beEaten() {
        System.out.println("Cat got eaten.");
    }
}
