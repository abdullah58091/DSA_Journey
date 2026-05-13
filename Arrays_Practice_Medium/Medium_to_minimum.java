public class Medium_to_minimum {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    int limit = 4;

    Medium_to_minimum solution = new Medium_to_minimum();
    int minMoves = solution.minMoves(nums, limit);
    System.out.println(minMoves);   
  }

    public int minMoves(int[] nums, int limit) {

        int n = nums.length;

        // Difference array
        int[] diff = new int[2 * limit + 2];

        // Process every pair
        for (int i = 0; i < n / 2; i++) {

            int a = nums[i];
            int b = nums[n - 1 - i];

            int low = 1 + Math.min(a, b);

            int high = limit + Math.max(a, b);

            int sum = a + b;

            // Initially assume 2 moves for all
            diff[2] += 2;

            diff[2 * limit + 1] -= 2;

            // One move range
            diff[low] -= 1;

            diff[high + 1] += 1;

            // Zero move at exact sum
            diff[sum] -= 1;

            diff[sum + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;

        int moves = 0;

        // Prefix sum to get moves for every target
        for (int target = 2; target <= 2 * limit; target++) {

            moves += diff[target];

            ans = Math.min(ans, moves);
        }

        return ans;
    }
}
    

