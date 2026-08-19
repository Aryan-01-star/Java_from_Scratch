import java.util.*;
public class find_unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        System.out.print("The unique value is/are: ");
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[i] = arr[i];
            }
            if(ans[i] == 0){
                continue;  
            }
            else{
                System.out.print(ans[i]+ " ");
            }
        }
    }
}
