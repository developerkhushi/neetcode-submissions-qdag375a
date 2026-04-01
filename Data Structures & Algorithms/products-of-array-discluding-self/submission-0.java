class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] pref = new int[len];
        pref[0] = nums[0];
        for (int i = 1; i < len; i++) {
            pref[i] = pref[i - 1] * nums[i];
        }

        int[] suff = new int[len];
        suff[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i];
        }

        int prod = 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) res[i] = prod * suff[i + 1];
            else if (i == len - 1) res[i] = pref[i - 1] * prod;
            else res[i] = pref[i - 1] * suff[i + 1];
        }

        return res;
    }
}  
