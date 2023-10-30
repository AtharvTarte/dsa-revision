import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {

    public static void main(String[] args) {

        Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());

        q.offer(89.2);
        q.offer(90.5);
        q.offer(72.9);
        q.offer(68.1);
        q.offer(98.0);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
