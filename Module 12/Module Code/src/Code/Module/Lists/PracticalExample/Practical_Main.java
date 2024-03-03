package Code.Module.Lists.PracticalExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"CommentedOutCode"})
public class Practical_Main {
    // Name Variables
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Lists_Car listsCar1 = new Lists_Car(TOYOTA, "GR86", false);
        Lists_Car listsCar2 = new Lists_Car(TOYOTA, "GR Supra", false);
        Lists_Car listsCar3 = new Lists_Car(TOYOTA, "GR Corolla", true);
        Lists_Car listsCar4 = new Lists_Car(BMW, "X5", false);
        Lists_Car listsCar5 = new Lists_Car(BMW, "X6", false);
        Lists_Car listsCar6 = new Lists_Car(BMW, "320i", true);
        Lists_Car listsCar7 = new Lists_Car(BMW, "E30 M3", false);
        Lists_Car listsCar8 = new Lists_Car(KIA, "Stinger", true);
        Lists_Car listsCar9 = new Lists_Car(KIA, "K5", false);
        Lists_Car listsCar10 = new Lists_Car(KIA, "Forte", true);

        List<Lists_Car> listsCarList = new ArrayList<>();
        listsCarList.add(listsCar1);
        listsCarList.add(listsCar2);
        listsCarList.add(listsCar3);
        listsCarList.add(listsCar4);
        listsCarList.add(listsCar5);
        listsCarList.add(listsCar6);
        listsCarList.add(listsCar7);
        listsCarList.add(listsCar8);
        listsCarList.add(listsCar9);
        listsCarList.add(listsCar10);

        // Not the right method to iterate through list.
        /* for (Lists_Car car : listsCarList) {
            if (car.getBrand().equals(KIA)) {
                listsCarList.remove(car);
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setOnSale(true);
            }
        }*/

        // The right way via using the Iterator:
        Iterator<Lists_Car> iterator = listsCarList.iterator();

        while (iterator.hasNext()) {
            Lists_Car listsCar = iterator.next();
            if (listsCar.getBrand().equals(KIA)) {
                iterator.remove();
            } else if (listsCar.getBrand().equals(TOYOTA)) {
                listsCar.setOnSale(true);
            }
        }

        for (Lists_Car listsCar : listsCarList) {
            System.out.println(listsCar);
        }
    }
}
