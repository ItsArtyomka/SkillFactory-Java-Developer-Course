package Code.Module.Map;

import java.util.Objects;

public class Map_Car {
    private final String name;
    private final String brand;
    private boolean onSale;

    public Map_Car(String brand, String name, boolean onSale) {
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
        Map_Car mapCar = (Map_Car) o;
        return onSale == mapCar.onSale && name.equals(mapCar.name) && brand.equals(mapCar.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, onSale);
    }
}
