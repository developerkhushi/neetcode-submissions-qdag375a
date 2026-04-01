class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            // for odd length
            int left = i;
            int right = i;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;

                if (left == -1 || right == n) break;
                left--;
                right++;
            }

            // for even length
            left = i;
            right = i + 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;

                if (left == -1 || right == n) break;
                left--;
                right++;
            }
        }
        return count;
    }
}
