import java.util.*;
public class target_sum_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){   
                if(arr[i]+arr[j]+arr[k] == target){
                    count++;
                }
                }
            }
        }
        System.out.println("We have "+count+" pair which is adding up to give the target value "+target);
    }
}