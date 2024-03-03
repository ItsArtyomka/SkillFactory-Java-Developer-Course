package Code.Module.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practical_Main3 {
    // Name Variables
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        // Creating the cars.
        Map_Car mapCar1 = new Map_Car(TOYOTA, "GR86", false);
        Map_Car mapCar2 = new Map_Car(TOYOTA, "GR Supra", false);
        Map_Car mapCar3 = new Map_Car(TOYOTA, "GR Corolla", true);
        Map_Car mapCar4 = new Map_Car(BMW, "X5", false);
        Map_Car mapCar5 = new Map_Car(BMW, "X6", false);
        Map_Car mapCar6 = new Map_Car(BMW, "320i", true);
        Map_Car mapCar7 = new Map_Car(BMW, "E30 M3", false);
        Map_Car mapCar8 = new Map_Car(KIA, "Stinger", true);
        Map_Car mapCar9 = new Map_Car(KIA, "K5", false);
        Map_Car mapCar10 = new Map_Car(KIA, "Forte", true);
        Map_Car mapCar11 = new Map_Car(TOYOTA, "GR86", false);
        Map_Car mapCar12 = new Map_Car(TOYOTA, "GR Supra", false);
        Map_Car mapCar13 = new Map_Car(TOYOTA, "GR Corolla", true);
        Map_Car mapCar14 = new Map_Car(BMW, "X5", false);
        Map_Car mapCar15 = new Map_Car(BMW, "X6", false);
        Map_Car mapCar16 = new Map_Car(BMW, "320i", true);
        Map_Car mapCar17 = new Map_Car(BMW, "E30 M3", false);
        Map_Car mapCar18 = new Map_Car(KIA, "Stinger", true);
        Map_Car mapCar19 = new Map_Car(KIA, "K5", false);
        Map_Car mapCar20 = new Map_Car(KIA, "Forte", true);
        Map_Car mapCar21 = new Map_Car(TOYOTA, "GR86", false);
        Map_Car mapCar22 = new Map_Car(TOYOTA, "GR Supra", false);
        Map_Car mapCar23 = new Map_Car(TOYOTA, "GR Corolla", true);
        Map_Car mapCar24 = new Map_Car(BMW, "X5", false);
        Map_Car mapCar25 = new Map_Car(BMW, "X6", false);
        Map_Car mapCar26 = new Map_Car(BMW, "320i", true);
        Map_Car mapCar27 = new Map_Car(BMW, "E30 M3", false);
        Map_Car mapCar28 = new Map_Car(KIA, "Stinger", true);
        Map_Car mapCar29 = new Map_Car(KIA, "K5", false);
        Map_Car mapCar30 = new Map_Car(KIA, "Forte", true);

        // Adding cars to the list
        List<Map_Car> mapCarList = new ArrayList<>();
        mapCarList.add(mapCar1);
        mapCarList.add(mapCar2);
        mapCarList.add(mapCar3);
        mapCarList.add(mapCar4);
        mapCarList.add(mapCar5);
        mapCarList.add(mapCar6);
        mapCarList.add(mapCar7);
        mapCarList.add(mapCar8);
        mapCarList.add(mapCar9);
        mapCarList.add(mapCar10);
        mapCarList.add(mapCar11);
        mapCarList.add(mapCar12);
        mapCarList.add(mapCar13);
        mapCarList.add(mapCar14);
        mapCarList.add(mapCar15);
        mapCarList.add(mapCar16);
        mapCarList.add(mapCar17);
        mapCarList.add(mapCar18);
        mapCarList.add(mapCar19);
        mapCarList.add(mapCar20);
        mapCarList.add(mapCar21);
        mapCarList.add(mapCar22);
        mapCarList.add(mapCar23);
        mapCarList.add(mapCar24);
        mapCarList.add(mapCar25);
        mapCarList.add(mapCar26);
        mapCarList.add(mapCar27);
        mapCarList.add(mapCar28);
        mapCarList.add(mapCar29);
        mapCarList.add(mapCar30);

        // Creating a Map with Car and Value
        // Then looping through the map and seeing i car with the same key exists(see equals() as it is the key).
        // Value for that key increases if the same key(car) with the same characteristics is found.
        Map<Map_Car, Integer> carMap = new HashMap<>();
        for (Map_Car car : mapCarList) {
            if (carMap.containsKey(car)) {
                int value = carMap.get(car);
                carMap.put(car, ++value);
            } else {
                carMap.put(car, 1);
            }
        }

        // Map.Entry is used for outputting from the map.
        for (Map.Entry<Map_Car, Integer> carEntry : carMap.entrySet()) {
            System.out.println(carEntry.getKey() + " = " + carEntry.getValue());
        }
    }
}
