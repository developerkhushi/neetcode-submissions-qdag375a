class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(prev);
                } else {
                    sb.append(prev).append(count);
                }
                prev = chars[i];
                count = 1;
            } 
        }
        if (count == 1) {
            sb.append(prev);
        } else {
            sb.append(prev).append(count);
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        
        return sb.length();
    }
}