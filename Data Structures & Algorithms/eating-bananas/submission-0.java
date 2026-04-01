class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        for (int num : piles) max = Math.max(max, num);

        int low = 1, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(piles, h, mid)) {
                high = mid - 1;
                res = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }

    public boolean isPossible(int piles[], int h, int speed) {
        int totalSum = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > speed) {
                if (piles[i] % speed != 0) 
                    totalSum += piles[i] / speed + 1;
                else 
                    totalSum += piles[i] / speed;
            } else {
                totalSum += 1;
            }
        }
        if (totalSum <= h) {
            return true;
        }
        return false;
    }
}
