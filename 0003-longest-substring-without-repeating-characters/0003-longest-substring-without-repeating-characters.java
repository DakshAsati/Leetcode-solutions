import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        return generateSubstring(s);
    }

    public static int generateSubstring(String s) {
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (set.contains(s.charAt(j))) { 
                    break;
                }
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
}
