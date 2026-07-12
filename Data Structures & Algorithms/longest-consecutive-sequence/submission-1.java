class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = Integer.MIN_VALUE;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    count++;
                    currentNum++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
