package StreamAPI.Debugging;

import java.util.stream.IntStream;

public class Debugging_Main {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,4);
        // peek() returns a stream consisting of element + performs action on each element.
        System.out.println(stream.peek(System.out::println).sum());


    }
}
