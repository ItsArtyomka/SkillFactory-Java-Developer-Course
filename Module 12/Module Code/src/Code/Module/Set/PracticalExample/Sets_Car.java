package Code.Module.Set.PracticalExample;

import java.util.Objects;

public class Sets_Car {
    private final String name;
    private final String brand;
    private boolean onSale;

    public Sets_Car(String brand, String name, boolean onSale) {
        // Check for null.
        if (brand == null || name == null){
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    // ---Name---
    public String getName() {
        return name;
    }

    // ---Brand---
    public String getBrand() {
        return brand;
    }

    // ---Sale---
    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Map_Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", onSale=" + onSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sets_Car setsCar = (Sets_Car) o;
        return name.equals(setsCar.name) && brand.equals(setsCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand);
    }
}
