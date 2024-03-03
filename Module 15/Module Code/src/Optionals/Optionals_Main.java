package Optionals;

import java.util.Optional;

public class Optionals_Main {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();

        int sum = 0;
        for (int score : scores)
            sum += score;

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> average = average(23, 46, 52, 13, 17);
//        average.ifPresent(System.out::println);
        System.out.println(average.orElse(Double.NaN));
        System.out.println(average.orElseGet(Math::random));
        System.out.println(average.orElseThrow(IllegalStateException::new));
    }
}
