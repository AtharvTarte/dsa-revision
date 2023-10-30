import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();

        l.push("atharv");
        l.push("shree");
        l.push("kunal");
        l.push("sarvesh");
        l.push("abhishekh");

        System.out.println(l);

        l.add(4 , "raj");

        System.out.println(l);

        l.remove("raj");

        System.out.println(l);

        System.out.println(l.indexOf("atharv"));
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());

        l.addFirst("saurabh");

        System.out.println(l);




    }
}
