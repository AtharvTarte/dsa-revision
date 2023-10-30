public class recursion {
    public static void main(String[] args) {
        sayHi(3);
    }

    private static void sayHi(int count){
        System.out.println("Hiii");

        if (count <= 1){
            return;
        }
        sayHi(count - 1);
    }
}
