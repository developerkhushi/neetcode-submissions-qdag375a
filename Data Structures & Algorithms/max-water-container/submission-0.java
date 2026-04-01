class Solution {
    public int maxArea(int[] heights) {
        int maxWater = Integer.MIN_VALUE;
        int left = 0, right = heights.length - 1;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            if (heights[left] < heights[right]) left++;
            else right--;
            maxWater = Math.max(maxWater, area);
        }
        return maxWater;
    }
}
