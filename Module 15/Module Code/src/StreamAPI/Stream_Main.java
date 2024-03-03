package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Working with Stream API
public class Stream_Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list
                .stream()
                .filter(n -> n.length() == 4 || n.length() == 5)
                .sorted()
                .limit(5)
                .forEach(System.out::println);
    }
}
