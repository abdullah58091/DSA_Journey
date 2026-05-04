import java.util.Arrays;
public class Sum_closet {

    public static int sumCloset(int arr[], int target){
        Arrays.sort(arr);
        int left =0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;

        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(Math.abs(currentSum - target) < Math.abs(closestSum - target)){
                closestSum = currentSum;
            }
            if(currentSum < target){
                left++;
            }else{
                right--;
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 7;
        int result = sumCloset(arr, target);
        System.out.println(result);
    }
    
}
