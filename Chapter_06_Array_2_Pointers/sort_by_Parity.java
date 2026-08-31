import java.util.*;
public class sort_by_Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int st=0;
        int end=arr.length-1;
        while(st<end){
                if(arr[st]%2==1&&arr[end]%2==0){
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
