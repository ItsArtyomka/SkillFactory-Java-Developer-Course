package Code.Module.Comparison_and_Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CarComparison {
    // Name Variables
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        // Creating the cars.
        CarClass car1 = new CarClass(TOYOTA, "GR86", false);
        CarClass car2 = new CarClass(TOYOTA, "GR Supra", false);
        CarClass car3 = new CarClass(TOYOTA, "GR Corolla", true);
        CarClass car4 = new CarClass(BMW, "X5", false);
        CarClass car5 = new CarClass(BMW, "X6", false);
        CarClass car6 = new CarClass(BMW, "320i", true);
        CarClass car7 = new CarClass(BMW, "E30 M3", false);
        CarClass car8 = new CarClass(KIA, "Stinger", true);
        CarClass car9 = new CarClass(KIA, "K5", false);
        CarClass car10 = new CarClass(KIA, "Forte", true);
        CarClass car11 = new CarClass(TOYOTA, "GR86", false);
        CarClass car12 = new CarClass(TOYOTA, "GR Supra", false);
        CarClass car13 = new CarClass(TOYOTA, "GR Corolla", true);
        CarClass car14 = new CarClass(BMW, "X5", false);
        CarClass car15 = new CarClass(BMW, "X6", false);
        CarClass car16 = new CarClass(BMW, "320i", true);
        CarClass car17 = new CarClass(BMW, "E30 M3", false);
        CarClass car18 = new CarClass(KIA, "Stinger", true);
        CarClass car19 = new CarClass(KIA, "K5", false);
        CarClass car20 = new CarClass(KIA, "Forte", true);
        CarClass car21 = new CarClass(TOYOTA, "GR86", false);
        CarClass car22 = new CarClass(TOYOTA, "GR Supra", false);
        CarClass car23 = new CarClass(TOYOTA, "GR Corolla", true);
        CarClass car24 = new CarClass(BMW, "X5", false);
        CarClass car25 = new CarClass(BMW, "X6", false);
        CarClass car26 = new CarClass(BMW, "320i", true);
        CarClass car27 = new CarClass(BMW, "E30 M3", false);
        CarClass car28 = new CarClass(KIA, "Stinger", true);
        CarClass car29 = new CarClass(KIA, "K5", false);
        CarClass car30 = new CarClass(KIA, "Forte", true);

        // Adding cars to the list
        List<CarClass> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        carList.add(car19);
        carList.add(car20);
        carList.add(car21);
        carList.add(car22);
        carList.add(car23);
        carList.add(car24);
        carList.add(car25);
        carList.add(car26);
        carList.add(car27);
        carList.add(car28);
        carList.add(car29);
        carList.add(car30);

        // Creating a carSet with CarComparator that orders the cars in alphabetical reversed order.
        Set<CarClass> carSet = new TreeSet<>(new CarComparator().reversed());
        carSet.addAll(carList);

        // Output
        for (CarClass car : carSet){
            System.out.println(car.getName());
        }
    }
}
