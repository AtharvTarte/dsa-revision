public class recursionBroCode {
    public static void main(String[] args) {

        walk(5);
    }

    private static void walk(int steps) {
        // iteration is repetition of process
        // iteration method:
        for (int i = 0; i < steps; i++){
            System.out.println(" ITERATION METHOD: you take a step");
        }

        // recursion is repetition of method
        // recursion method:
        // base case is needed for no error of stack overflow
        // here if condition is base case

        if (steps < 1){ // base case
            return;
        }
        System.out.println(" RECURSION METHOD: you take a step");
        walk(steps - 1);

    }
}
