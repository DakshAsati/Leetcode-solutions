class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int seen : nums){
            if(set.contains(seen)){
                return true;
            }
            set.add(seen);

        }

        return false;
        
    }
}