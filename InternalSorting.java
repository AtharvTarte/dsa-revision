import java.util.Arrays;

public class InternalSorting {
    // internally java offer quick sort(hybrid sorting uses some other sorting methods inside quick sort )

    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4,9,7,8,6};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
