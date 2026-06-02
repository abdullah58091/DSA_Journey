public class min_duration {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        min_duration obj = new min_duration();
        int[] nums = {1, 2, 1};
        int[] ans = obj.getConcatenation(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

