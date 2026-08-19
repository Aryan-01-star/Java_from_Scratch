import java.util.*;
public class return_index_of_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you are looking for: ");
        int target = sc.nextInt();
        int ans = -1;
        int[] arr = {1,2,3,4,5,6,88,65,69,67,8,9,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("This number doesnt exist");
        }
        else{
            System.out.println("The index of this number is: "+ ans);
        }
    }
}
