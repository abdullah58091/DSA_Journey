 public class Hard {
 

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 1, 2, 1, 1};
        int target = 1;

        Hard hard = new Hard();
        long result = hard.countMajoritySubarrays(nums, target);

        System.out.println("Number of majority subarrays: " + result);
    }

    class BIT {
        int[] tree;

        BIT(int n) {
            tree = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx < tree.length) {
                tree[idx] += val;
                idx += idx & (-idx);
            }
        }

        long query(int idx) {
            long ans = 0;

            while (idx > 0) {
                ans += tree[idx];
                idx -= idx & (-idx);
            }

            return ans;
        }
    }


    public long countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;

        int[] pref = new int[n + 1];

        for (int i = 0; i < n; i++) {

            int val = (nums[i] == target) ? 1 : -1;

            pref[i + 1] = pref[i] + val;
        }


        int shift = n + 2;

        BIT bit = new BIT(2 * n + 5);

        long ans = 0;


        bit.update(pref[0] + shift, 1);


        for (int i = 1; i <= n; i++) {

            int cur = pref[i] + shift;

            ans += bit.query(cur - 1);

            bit.update(cur, 1);
        }

        return ans;
    }
}