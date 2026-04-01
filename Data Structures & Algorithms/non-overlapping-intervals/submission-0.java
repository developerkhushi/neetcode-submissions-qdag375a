class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; // compare end if start same
            }
            return a[0] - b[0]; // compare start
        });

        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < current[1]) {
                count++;
                // keep the one with smaller end
                if (intervals[i][1] < current[1]) {
                    current = intervals[i];
                }
            } else {
                current = intervals[i];
            }
        }
        return count;
    }
}
