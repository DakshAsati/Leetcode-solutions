class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> result = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(!result.containsKey(st)){
                result.put(st, new ArrayList<>());
            }
            result.get(st).add(str);
        }
        return new ArrayList<>(result.values());
        
    }
}