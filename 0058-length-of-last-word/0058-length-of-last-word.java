class Solution {
    public int lengthOfLastWord(String s) {
        if(s ==  null || s.trim().isEmpty()){
            return 0;
        }
        String[] words = s.trim().split("\\s+");

        for(int i = words.length - 1; i >= 0; i--){
            return words[i].length();
        }
        return 0;

        
    }
}