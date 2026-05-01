
import java.util.HashMap;

public class Longest_Subarray_sum {

    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];

            if(sum == k){
                maxLength = i + 1;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)){
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,1,1,};
        int k = 3;

        Longest_Subarray_sum call = new Longest_Subarray_sum();
        System.out.println(call.longestSubarray(nums, k));
    }
}
