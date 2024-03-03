package Code.Module.Generics;

public class WorkingWithGenerics {
    public static void main(String[] args) {
        // There is new objects as arguments because we're creating specific Crate objects.
        Crate<Elephant> crateForElephant = new Crate<>(new Elephant());
        Crate<Monkey> crateForMonkey = new Crate<>(new Monkey());
        Crate<Wolf> crateForWolf = new Crate<>(new Wolf());

        // Getting contents of crates.
        Elephant elephant = crateForElephant.getContents();
        Monkey monkey = crateForMonkey.getContents();
        Wolf wolf = crateForWolf.getContents();

        // In this case each variable prints out its hashcode.
        System.out.println(elephant);
        System.out.println(monkey);
        System.out.println(wolf);
        // crateForElephant.setContents(new Wolf()); // compile error.
    }

    // Example method that implements Upper Bound Types
    public static <T extends ShippableCrate> void ship(T shippableCrate){
        System.out.println("Shipping... " + shippableCrate);
    }

}

// Creating classes for Crate content.
// Implemented Soundable to practice OOP :)
class Elephant implements Soundable {
    @Override
    public String sound() {
        return "Whooooow";
    }
}

class Monkey implements Soundable {
    @Override
    public String sound() {
        return "Uuu Uuuu Aaah Aaah";
    }
}

class Wolf implements Soundable {
    @Override
    public String sound() {
        return "Woooooo";
    }
}
