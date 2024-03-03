package Code.Module.Set.PracticalExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practical_Main2 {
    // Name Variables
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        // Creating the cars.
        Sets_Car setsCar1 = new Sets_Car(TOYOTA, "GR86", false);
        Sets_Car setsCar2 = new Sets_Car(TOYOTA, "GR Supra", false);
        Sets_Car setsCar3 = new Sets_Car(TOYOTA, "GR Corolla", true);
        Sets_Car setsCar4 = new Sets_Car(BMW, "X5", false);
        Sets_Car setsCar5 = new Sets_Car(BMW, "X6", false);
        Sets_Car setsCar6 = new Sets_Car(BMW, "320i", true);
        Sets_Car setsCar7 = new Sets_Car(BMW, "E30 M3", false);
        Sets_Car setsCar8 = new Sets_Car(KIA, "Stinger", true);
        Sets_Car setsCar9 = new Sets_Car(KIA, "K5", false);
        Sets_Car setsCar10 = new Sets_Car(KIA, "Forte", true);
        Sets_Car setsCar11 = new Sets_Car(TOYOTA, "GR86", false);
        Sets_Car setsCar12 = new Sets_Car(TOYOTA, "GR Supra", false);
        Sets_Car setsCar13 = new Sets_Car(TOYOTA, "GR Corolla", true);
        Sets_Car setsCar14 = new Sets_Car(BMW, "X5", false);
        Sets_Car setsCar15 = new Sets_Car(BMW, "X6", false);
        Sets_Car setsCar16 = new Sets_Car(BMW, "320i", true);
        Sets_Car setsCar17 = new Sets_Car(BMW, "E30 M3", false);
        Sets_Car setsCar18 = new Sets_Car(KIA, "Stinger", true);
        Sets_Car setsCar19 = new Sets_Car(KIA, "K5", false);
        Sets_Car setsCar20 = new Sets_Car(KIA, "Forte", true);
        Sets_Car setsCar21 = new Sets_Car(TOYOTA, "GR86", false);
        Sets_Car setsCar22 = new Sets_Car(TOYOTA, "GR Supra", false);
        Sets_Car setsCar23 = new Sets_Car(TOYOTA, "GR Corolla", true);
        Sets_Car setsCar24 = new Sets_Car(BMW, "X5", false);
        Sets_Car setsCar25 = new Sets_Car(BMW, "X6", false);
        Sets_Car setsCar26 = new Sets_Car(BMW, "320i", true);
        Sets_Car setsCar27 = new Sets_Car(BMW, "E30 M3", false);
        Sets_Car setsCar28 = new Sets_Car(KIA, "Stinger", true);
        Sets_Car setsCar29 = new Sets_Car(KIA, "K5", false);
        Sets_Car setsCar30 = new Sets_Car(KIA, "Forte", true);

        // Adding cars to the list
        List<Sets_Car> setsCarList = new ArrayList<>();
        setsCarList.add(setsCar1);
        setsCarList.add(setsCar2);
        setsCarList.add(setsCar3);
        setsCarList.add(setsCar4);
        setsCarList.add(setsCar5);
        setsCarList.add(setsCar6);
        setsCarList.add(setsCar7);
        setsCarList.add(setsCar8);
        setsCarList.add(setsCar9);
        setsCarList.add(setsCar10);
        setsCarList.add(setsCar11);
        setsCarList.add(setsCar12);
        setsCarList.add(setsCar13);
        setsCarList.add(setsCar14);
        setsCarList.add(setsCar15);
        setsCarList.add(setsCar16);
        setsCarList.add(setsCar17);
        setsCarList.add(setsCar18);
        setsCarList.add(setsCar19);
        setsCarList.add(setsCar20);
        setsCarList.add(setsCar21);
        setsCarList.add(setsCar22);
        setsCarList.add(setsCar23);
        setsCarList.add(setsCar24);
        setsCarList.add(setsCar25);
        setsCarList.add(setsCar26);
        setsCarList.add(setsCar27);
        setsCarList.add(setsCar28);
        setsCarList.add(setsCar29);
        setsCarList.add(setsCar30);

        // Adding list' cars to the set.
        Set<Sets_Car> setsCarSet = new HashSet<>(setsCarList);
        // Output
        for (Sets_Car car: setsCarSet) {
            System.out.println(car); // Output: 10 Unique cars.
        }
        // More output
        System.out.println(setsCarList.size()); // 30
        System.out.println(setsCarSet.size()); // 10
    }
}
