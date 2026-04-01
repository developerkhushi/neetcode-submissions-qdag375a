class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int j = 0;
        while (j < first.length() && j < last.length() 
                && first.charAt(j) == last.charAt(j)) {
            j++;
        }

        return first.substring(0, j);
    }
}