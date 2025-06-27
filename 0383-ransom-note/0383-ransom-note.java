class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> result = new HashMap<>();

        for(char c : magazine.toCharArray()){
            result.put(c , result.getOrDefault(c,0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!result.containsKey(c) || result.get(c) == 0){
                return false;
            }
            result.put(c,result.get(c) - 1);
        }
        return true;
        
    }
}