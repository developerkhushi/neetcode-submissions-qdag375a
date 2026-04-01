class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String orig : strs) {
            char[] arr = orig.toCharArray();
            Arrays.sort(arr);
            String sort = Arrays.toString(arr);

            if (!map.containsKey(sort)) {
                List<String> list = new ArrayList<>();
                list.add(orig);
                map.put(sort, list);
            }
            else {
                map.get(sort).add(orig);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
