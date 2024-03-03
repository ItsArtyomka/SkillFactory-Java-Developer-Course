package Code.Module.Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("ReassignedVariable")
public class WildcardExamples {
    public static void main(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        printList(keywords); // Output: Java
    }

    private static void printList(Queue<?> keywords) { // ? aka Wildcard
        for (Object o : keywords) {
            System.out.println(o);
        }
    }

    // Upper-Bounded Wildcard method example.
    private static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }
}
