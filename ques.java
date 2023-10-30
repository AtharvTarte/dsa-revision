import java.util.LinkedList;
import java.util.Queue;

public class ques {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();

        q.offer("blockchain");
        q.offer("fullstack");
        q.offer("devops");
        q.offer("ai_ml");
        q.offer("ml_ops");
        q.offer("dev_rel");

        System.out.println(q);

        String a = q.peek();

        System.out.println(q.peek());
        System.out.println(a);

        q.poll();
        q.poll();

        System.out.println(q);

        System.out.println(q.element());

        System.out.println(q.isEmpty());

        System.out.println(q.size());

        System.out.println(q.contains("devops"));







    }
}
