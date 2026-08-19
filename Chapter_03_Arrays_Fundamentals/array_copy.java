import java.util.Arrays;

public class array_copy {
    static void printArray(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4,8,9,17};
        int[] arr_copy = arr;
        System.out.println("Original array: ");
        printArray(arr);
        System.out.println("Copied array: ");
        printArray(arr_copy);
        System.out.println();
        
        /* Lets change the value in the current copied array and
        lets see if it affects the original array too or not */
        
        arr_copy[1] = 69;
        arr_copy[0] = 67;
        System.out.println("Original array after change in arr_copy: ");
        printArray(arr);
        System.out.println("Copied array after change: ");
        printArray(arr_copy);
        System.out.println();

        /* 
        We are having a shallow copy of original array-->
        Original array after change on arr_copy: 
        67 69 1 2 3 4 8 9 17 
        Copied array after change: 
        67 69 1 2 3 4 8 9 17 

        As we can see the values in the arr_copy on change 
        is also affecting the value of the original array 
        this is because we are having only one array in the
        heap but there are 2 different reference variable 
        */
        
        // To actually create a copy we have the following ways:
        
        int[] arr_Actual_copy = arr.clone();
        System.out.println("Actual clone array after value change is: ");
        printArray(arr_Actual_copy);
        arr_Actual_copy[5] = 100;
        arr_Actual_copy[2] = 1000;
        System.out.println("Actual clone array after value change is: ");
        printArray(arr_Actual_copy);
        System.out.println();

        // To copy till a fixed range of length we use:
        
        int[] length_arr = Arrays.copyOf(arr,3);
        System.out.println("Array copy to a fixed length: ");
        printArray(length_arr);
    }
}
