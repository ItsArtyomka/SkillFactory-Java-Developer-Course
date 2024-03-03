package Code.Module.Collections;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("rawtypes")
public class Main {
    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();

        int numberOfTasks = 5;
        // ArrayDeque implements Deque interface that allows to work with Deque interface methods with an toDoQueue object.
        // Class ArrayDeque implements Deque Interface
        Deque toDoQueue = new ArrayDeque(numberOfTasks);
        Boss boss = new Boss(toDoQueue);
        Worker worker = new Worker(toDoQueue);

        for (int i = 1; i <= numberOfTasks; i++) {
            boss.giveTask("Task " + i);
        }
        System.out.println("Boss finished giving tasks.");

        for (int i = 1; i <= numberOfTasks + 1; i++) {
            worker.takeTask();
        }
    }
}