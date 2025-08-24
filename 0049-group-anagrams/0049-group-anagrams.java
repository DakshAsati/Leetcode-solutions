class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for(String it : strs){
            char[] tu = it.toCharArray();
            Arrays.sort(tu);
            String ut = new String(tu);
            if(!result.containsKey(ut)){
                result.put(ut, new ArrayList<>());
            }
            result.get(ut).add(it);
            
        }
        return new ArrayList<>(result.values());
        
    }
}