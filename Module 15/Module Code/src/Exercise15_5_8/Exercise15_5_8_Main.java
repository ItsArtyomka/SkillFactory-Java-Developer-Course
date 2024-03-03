package Exercise15_5_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings({"ReassignedVariable", "unused"})
public class Exercise15_5_8_Main {
    // Without Streams
    public static void main(String[] args) {
        // Without Streams
        List<String> stringsList = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = new ArrayList<>();
        for (String s : stringsList) {
            // integerList.add(Integer.valueOf(s));
            // -OR-
            integerList.add(Integer.parseInt(s));
        }

        int multiply = 1;
        for (int number : integerList){
            multiply *= number;
        }

        // With Streams
        int streamsMultiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(streamsMultiply);
    }
}
