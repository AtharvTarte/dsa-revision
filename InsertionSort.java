import java.util.Arrays;
import java.util.Random;



public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(10);
        }

        System.out.println(" BEFORE: " + Arrays.toString(numbers));


        insertionsort(numbers);

        System.out.println(" AFTER: " + Arrays.toString(numbers));

    }

    private static void insertionsort(int [] inputArray){
        for (int i = 1; i < inputArray.length; i++){
            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currentValue;
        }

    }
}
