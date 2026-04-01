class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternMap = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!patternMap.containsKey(ch) && !patternMap.containsValue(words[i])) 
                patternMap.put(ch, words[i]);
            if (patternMap.containsKey(ch) && !patternMap.get(ch).equals(words[i])) 
                return false;
            else if (patternMap.containsValue(words[i]) && !words[i].equals(patternMap.get(ch))) 
                return false; 
        }
        return true;
    }
}