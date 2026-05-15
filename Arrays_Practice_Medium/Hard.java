public class Hard {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low  = 0;
        int high = n -1;

        while( low < high){
            int mid  = low+(high - low)/2;
            if(nums[mid] > nums[high] ){
                low = mid + 1;
            }

            else if (nums[mid] > nums[high]){
                    high = mid;
                }
            
            else{
                high--;
            }
        }
        
         return nums[low];
        }
    
    
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));//time complexity is O(log n) and space complexity is O(1) or binary search algorithm.
    }
}

   
