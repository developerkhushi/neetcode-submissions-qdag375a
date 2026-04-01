class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> patternMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (patternMap.containsKey(ch) && !patternMap.get(ch).equals(words[i])) 
                return false;
            else if (patternMap.containsValue(words[i]) && !words[i].equals(patternMap.get(ch))) 
                return false; 
            patternMap.put(ch, words[i]);
        }
        return true;
    }
}