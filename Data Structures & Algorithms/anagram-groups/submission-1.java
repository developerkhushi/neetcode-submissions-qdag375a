class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sort = new String(chars);
            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
