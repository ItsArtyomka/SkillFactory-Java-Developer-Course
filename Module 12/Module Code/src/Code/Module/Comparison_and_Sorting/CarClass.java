package Code.Module.Comparison_and_Sorting;

import java.util.Comparator;
import java.util.Objects;

public class CarClass {
    private final String name;
    private final String brand;
    private boolean onSale;

    public CarClass(String brand, String name, boolean onSale) {
        // Check for null.
        if (brand == null || name == null) {
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

    // String Output Override
    @Override
    public String toString() {
        return "CarClass{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", onSale=" + onSale +
                '}';
    }

    // Other Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarClass carClass = (CarClass) o;
        return onSale == carClass.onSale && name.equals(carClass.name) && brand.equals(carClass.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, onSale);
    }
}

// Creating own CarComparator that compares and sorts car names in alphabetical order.
class CarComparator implements Comparator<CarClass> {
    public int compare(CarClass car1, CarClass car2) {
        return car1.getName().compareTo(car2.getName());
    }
}
