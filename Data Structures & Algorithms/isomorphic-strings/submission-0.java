class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            char tt = t.charAt(i); 
            if (!map1.containsKey(st)) { 
                map1.put(st, tt); 
            }
            if (!map2.containsKey(tt)) {
                map2.put(tt, st); 
            }
            if (map1.get(st) != tt) {
                return false;
            }
            else if (map2.get(tt) != st){
                return false;
            }
        }
        return true;
    }
}