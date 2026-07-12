class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int leftMax = 0, rightMax = 0;
        int low = 0, high = height.length - 1;

        while (low < high) {
            leftMax = Math.max(leftMax, height[low]);
            rightMax = Math.max(rightMax, height[high]);
            int water = 0;
            if (leftMax < rightMax) {
                water = leftMax - height[low++];
            } else {
                water = rightMax - height[high--];
            }
            trappedWater += water;
        }
        return trappedWater;
    }
}
