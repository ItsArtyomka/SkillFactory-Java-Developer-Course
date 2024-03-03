package Code.Module.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//
//        queue.add("John");
//        queue.add("Sam");
//        queue.add("Mary");
//        queue.add("Smith");
//        queue.add("Adam");
//
//        List<String> list = new ArrayList<>(queue);
//
//        int size = list.size(); // 5
//
//        list.add(null);
//
//        int newSize = list.size(); // 6
//
//        String elementAtIndex = list.get(5); // java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 5
//        System.out.println(elementAtIndex);
//
//        List<Integer> list1 = new LinkedList<>();
//        for (int i = 0; i <= 3; i++) {
//            list1.add(i);
//        }
//        // System.out.println(list1.get(list1.size())); // java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
//
//        LinkedList<Integer> intList = new LinkedList<>();
//        intList.add(15);
//        intList.addLast(28);
//        intList.remove(0);
//        intList.set(0, 33);
//        intList.addFirst(null);
//        List<Integer> anotherList = intList; // 1
//        System.out.println(anotherList);

        // Exercise 12.4.6
        List<Integer> integerList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }
        System.out.println(integerList); // ArrayList from 0 to 99.
        Collections.reverse(integerList); // Now reversing the ArrayList integerList.
        System.out.println(integerList); // ArrayList from 99 to 0.
    }
}
