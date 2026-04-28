import java.util.*;
public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] mergedIntervals = merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // No overlap, add the current interval to the merged list
                merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        // Add the last interval
        merged.add(currentInterval);

        return merged.toArray(new int[merged.size()][]);
    }
}
