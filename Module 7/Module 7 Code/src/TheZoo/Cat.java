package TheZoo;

public class Cat extends Mammal {
    public Cat() {
    }

    @Override
    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public void print() {
        System.out.println("I am a Cat");
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }
}
