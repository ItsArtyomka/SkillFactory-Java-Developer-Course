package TheZoo;

public class Reptile extends Animal {
    public Reptile() {
    }

    @Override
    public void sound(){
        System.out.println("Ssssss");
    }

    @Override
    public void print() {
        System.out.println("I am a Reptile");
    }

    @Override
    public String toString() {
        return "I am a Reptile";
    }
}
