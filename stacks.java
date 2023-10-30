import java.util.Stack;

public class stacks {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());
        
         stack.push("cod");
         stack.push("pubg");
         stack.push("valorent");
         stack.push("gtav");
         stack.push("warzone");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        String mygame = stack.pop();

        System.out.println("my fav game is " + mygame);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search("valorent"));
        System.out.println(stack.search("cod"));


        for (int i = 0; i < 100; i++ ){
            stack.push("coder");

        }

        System.out.println(stack);

    }
}
