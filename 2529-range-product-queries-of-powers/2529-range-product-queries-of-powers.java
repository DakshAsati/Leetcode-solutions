class Solution {
    public int[] productQueries(int n, int[][] queries){

        long MOD = 1000000007;

    List<Integer> power = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
        int bit = 0;
        while(n > 0){
            if((n & 1) == 1){
                power.add(1 << bit);
            }
            bit++;
            n >>= 1;
        }

        for(int[] q : queries){
            long prod = 1;
            for(int i = q[0]; i <= q[1]; i++){
             prod = (prod*power.get(i)) % MOD;
                
            }
            result.add((int) prod);
        }
     
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}