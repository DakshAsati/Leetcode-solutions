class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for(int n: candyType){
            set.add(n);
        }
        
        return Math.min(candyType.length / 2, set.size());
    }
}