package Code.Module.Generics;

@SuppressWarnings("rawtypes")
// Example class that implements a generic class
public class ShippableCrate implements Shippable<Crate> {

    @Override
    public void ship(Crate thing) {
        System.out.println("Shipping " + thing);
    }
}
