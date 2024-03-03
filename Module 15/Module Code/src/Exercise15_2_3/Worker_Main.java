package Exercise15_2_3;

@SuppressWarnings("ALL")
public class Worker_Main {
    public static void main(String[] args) {
        doubleFromString(100, value -> Double.valueOf(value)); // method reference
        doubleFromString(50, Double::valueOf); // lambda-function
    }

    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }
}
