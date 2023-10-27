package lessons.lesson17.queue;

import java.util.*;

public class DequeExample {

    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();

        queue.push(3);
        queue.push(44);
        queue.push(22);
        queue.push(11);
        queue.push(2222);
        queue.push(543);


        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }

        System.out.println(queue.size());

    }
}



