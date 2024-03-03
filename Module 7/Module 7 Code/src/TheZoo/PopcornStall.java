package TheZoo;

public class PopcornStall implements Soundable {
    // Overriding the Object's toString() method to suit the popcorn stall.
    @Override
    public String toString(){
        return "Popcorn Stall.";
    }

    @Override
    public void sound() {
        System.out.println("Popcorn Stall Here!");
    }
}
