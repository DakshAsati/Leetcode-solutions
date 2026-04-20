class Solution {
    public String shortestPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }

        if (i == s.length()) return s;

        String rem = s.substring(i);

        String rev = new StringBuilder(rem).reverse().toString();

        return rev + shortestPalindrome(s.substring(0, i)) + rem;
    }
}