package TheZoo;

public class Dog extends Mammal {
    public Dog() {
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void print() {
        System.out.println("I am a Dog");
    }

    @Override
    public String toString() {
        return "I am a Dog.";
    }
}
