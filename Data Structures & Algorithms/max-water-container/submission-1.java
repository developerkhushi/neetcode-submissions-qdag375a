class Solution {
    public int maxArea(int[] heights) {
        int low = 0, high = heights.length - 1;
        int maxWater = 0;
        while (low < high) {
            int area = Math.min(heights[low], heights[high]) * (high - low);
            if (heights[low] < heights[high]) {
                low++;
            }
            else {
                high--;
            }
            maxWater = Math.max(maxWater, area);
        }
        return maxWater;
    }
}
