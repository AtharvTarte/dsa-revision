public class LinearSearch {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = linearsearch(array, 8);

        if (index != -1){
            System.out.println("element found at index: " + index);
        }
        else {
            System.out.println("not found");
        }
    }

    private static int linearsearch(int[] array , int value){

        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }


        }return -1;



    }



}
