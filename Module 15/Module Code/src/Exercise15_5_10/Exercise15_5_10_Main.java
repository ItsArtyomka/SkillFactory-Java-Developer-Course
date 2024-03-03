package Exercise15_5_10;

/* Task:
Rewrite code below using streams:

List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
List<Double> doubles = new ArrayList<>();
for (String s : list2) {
    doubles.add(Double.valueOf(s));
}
Set<Double> sortedDoubles = new TreeSet<>(Comparator.reverseOrder());
sortedDoubles.addAll(list);
sortedDoubles.addAll(doubles);
for (double d : sortedDoubles) {
    System.out.println(d);
}
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise15_5_10_Main {
    public static void main(String[] args) {
        // Lists
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");

        // Lists --> Streams + Operations
        Stream.concat(list.stream(),
                list2.stream().map(Double::valueOf))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
