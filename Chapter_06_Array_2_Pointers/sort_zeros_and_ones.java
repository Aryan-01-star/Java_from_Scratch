import java.util.*;
public class sort_zeros_and_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements(only 0/1) of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]!=0 && arr[i]!=1){
                System.out.println("Invalid input! Please enter only 0 or 1.");
                i--;
            }
        }
        int st=0;
        int end=arr.length-1;
        while(st<end){
                if(arr[st]==1&&arr[end]==0){
                    int temp = arr[st];
                    arr[st] = arr[end];
                    arr[end] = temp;
                    st++;
                    end--;
                }
                if(arr[st]==0){
                    st++;
                }
                if(arr[end]==1){
                    end--;
                }
        }
        System.out.print("Array after sorting is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
