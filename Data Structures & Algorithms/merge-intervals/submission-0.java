class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int current[] = intervals[0]; 
        res.add(current);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                current = intervals[i];
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
