import java.util.Arrays;
public class DFS {
    public int maxJumps(int[] arr, int d) {

  
        int n = arr.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(i, arr, d, dp));
        }

        return ans;
    }

    public int dfs(int i, int[] arr, int d, int[] dp) {


        if (dp[i] != -1) {
            return dp[i];
        }

        int best = 1;

     
        for (int j = i - 1; j >= Math.max(0, i - d); j--) {

        
            if (arr[j] >= arr[i]) {
                break;
            }

            best = Math.max(best, 1 + dfs(j, arr, d, dp));
        }

   
        for (int j = i + 1; j <= Math.min(arr.length - 1, i + d); j++) {

       
            if (arr[j] >= arr[i]) {
                break;
            }

            best = Math.max(best, 1 + dfs(j, arr, d, dp));
        }

        return dp[i] = best;
    }
    public static void main(String[] args) {
        DFS dfs = new DFS();
        int[] arr = {6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12};
        int d = 2;
        System.out.println(dfs.maxJumps(arr, d));
    }
}