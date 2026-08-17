public class MSPBTC {

    // Union-Find helper function
    int find(int[] root, int i) {
        if (root[i] == i)
            return i;
        return root[i] = find(root, root[i]);
    }

    public int minScore(int n, int[][] roads) {
        int[] root = new int[n + 1];
        for (int i = 0; i <= n; i++)
            root[i] = i;

        // Union operation
        for (int[] r : roads)
            root[find(root, r[0])] = find(root, r[1]);

        int res = 10001;
        for (int[] r : roads)
            if (find(root, r[0]) == find(root, 1))
                res = Math.min(res, r[2]);

        return res;
    }

    public static void main(String[] args) {
        MSPBTC solution = new MSPBTC();
        int n = 4;
        int[][] roads = {{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}};
        int result = solution.minScore(n, roads);
        System.out.println("Minimum score: " + result); 
        // Output: Minimum score: 5
    }
}
class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        int[][] dp = new int[n][n];

        int[][] leftBest = new int[n][n];

        int[][] rightBest = new int[n][n];

        int[] leftPtr = new int[n];

        int[] rightPtr = new int[n];

        for (int i = 0; i < n; i++) {
            leftBest[i][i] = stoneValue[i];
            rightBest[i][i] = stoneValue[i];

            leftPtr[i] = i - 1;

            rightPtr[i] = i;
        }

        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len <= n; l++) {
                int r = l + len - 1;

                long total = prefix[r + 1] - prefix[l];

                while (leftPtr[l] + 1 <= r - 1) {
                    int k = leftPtr[l] + 1;
                    long leftSum = prefix[k + 1] - prefix[l];

                    if (2 * leftSum > total) {
                        break;
                    }

                    leftPtr[l]++;
                }

                while (rightPtr[l] <= r - 1) {
                    int k = rightPtr[l];
                    long leftSum = prefix[k + 1] - prefix[l];

                    if (2 * leftSum >= total) {
                        break;
                    }

                    rightPtr[l]++;
                }

                int best = 0;

                if (leftPtr[l] >= l) {
                    best = leftBest[l][leftPtr[l]];
                }

                if (rightPtr[l] <= r - 1) {
                    best = Math.max(best, rightBest[rightPtr[l] + 1][r]);
                }

                dp[l][r] = best;

                leftBest[l][r] = Math.max(
                    leftBest[l][r - 1],
                    dp[l][r] + (int) total
                );

                rightBest[l][r] = Math.max(
                    rightBest[l + 1][r],
                    dp[l][r] + (int) total
                );
            }
        }

        return dp[0][n - 1];
    }
}