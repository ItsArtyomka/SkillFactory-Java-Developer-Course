package Exercise15_5_11;

import java.util.stream.IntStream;

public class Exercise15_5_11_Main {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        int sum = intStream
                .skip(50)
                .filter(num -> num % 2 == 0 || num % 5 == 0)
                .sum();
        System.out.println(sum); // Output: 2275
    }
}
