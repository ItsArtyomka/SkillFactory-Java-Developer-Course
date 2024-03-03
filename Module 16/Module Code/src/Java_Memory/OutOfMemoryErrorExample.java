package Java_Memory;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        // Creating a list that refers to
        // 100 arrays 1Mb in size.
        List<Object> objects = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            objects.add(new byte[1024 * 1024]); // In total, 100Mb are allocated for Heap Memory
        }
        System.out.println("Success!");
    }
}
