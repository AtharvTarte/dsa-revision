import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        // merge sort is dividing algorithm
        // it divides array by 2 until there exist pair of 1 element
        // faster than insertion sort , selection sort , bubble sort but uses more space

        int[] arr = {5,2,6,3,1,8,9,4};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int [] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid =  arr.length / 2;

        int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j =0;
        int k =0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[j];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // so copy the remaining elements

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}































































































































