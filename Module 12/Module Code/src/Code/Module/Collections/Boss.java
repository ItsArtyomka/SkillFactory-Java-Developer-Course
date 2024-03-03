package Code.Module.Collections;

import java.util.Deque;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Boss {
    private final Deque toDoQueue;
    public Boss(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;
    }
    public void giveTask(String task) {
        toDoQueue.add(task);
        System.out.println("Gave task " + task);
    }
}