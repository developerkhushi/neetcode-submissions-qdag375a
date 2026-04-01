class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int maxLength = 1;
        int start = 0;
        int left = 0, right = 0;

        for (int i = 0; i < s.length(); i++) {

            // for Odd
            left = i;
            right = i;
            while (left >= 0 && right < s.length() 
                && s.charAt(left) == s.charAt(right)) {

                    int currLength = right - left + 1;
                    if (currLength > maxLength) {
                        maxLength = currLength;
                        start = left;
                    }
                    left--;
                    right++;
            }

            // for Even
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() 
                && s.charAt(left) == s.charAt(right)) {

                    int currLength = right - left + 1;
                    if (currLength > maxLength) {
                        maxLength = currLength;
                        start = left;
                    }
                    left--;
                    right++;
            }
        }
        return s.substring(start, start + maxLength);
    }
}
