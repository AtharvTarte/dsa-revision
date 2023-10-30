import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8,9,11,14,15,17,19};

        System.out.println(binarysearch(arr,18));

    }

    private static int binarysearch (int [] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high){
            int middlePosition = (low + high)/2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber){
                return middlePosition;
            }
            if (numberToFind < middleNumber){
                high = middlePosition - 1;
            }
            if (numberToFind > middleNumber){
                low = middlePosition + 1;
            }
        }
        return -1;
    }




}
