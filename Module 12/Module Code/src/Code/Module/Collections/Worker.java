package Code.Module.Collections;

import java.util.Deque;

@SuppressWarnings("rawtypes")
public class Worker {
    private final Deque toDoQueue;
    public Worker(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;
    }
    public void takeTask() {
        Object task = toDoQueue.pollLast();
        if (task != null) {
            System.out.println("Doing task: " + task);
        } else {
            System.out.println("No more work. Time to go home");
        }
    }
}
