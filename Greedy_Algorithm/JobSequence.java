package com.company.Greedy_Algorithm;
import java.util.*;

public class JobSequence {

    public static int[] jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;
        int count = 0;
        int totalProfit = 0;

        // 👉 pair: profit, deadline
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = profit[i];
            jobs[i][1] = deadline[i];
        }

        // 👉 sort by profit (descending)
        Arrays.sort(jobs, (a, b) -> b[0] - a[0]);

        // 👉 slot array (time slots)
        int[] slot = new int[n];

        for (int i = 0; i < n; i++) {

            // 👉 last possible slot
            int start = Math.min(n, jobs[i][1]) - 1;

            for (int j = start; j >= 0; j--) {

                // 👉 if slot empty
                if (slot[j] == 0) {
                    slot[j] = 1;
                    count++;
                    totalProfit += jobs[i][0];
                    break;
                }
            }
        }

        return new int[]{count, totalProfit};
    }

    public static void main(String[] args) {

        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};

        int[] ans = jobSequencing(deadline, profit);

        System.out.println("Jobs done = " + ans[0]);
        System.out.println("Total Profit = " + ans[1]);
    }
}