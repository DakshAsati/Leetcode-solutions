class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        

        int gcd  = numsDivide[0];
        for(int num : numsDivide){
            gcd = findGCD(gcd, num);
        }


        Arrays.sort(nums);


        for(int i = 0; i < nums.length ; i++){
            if(gcd % nums[i] == 0){
                return  i;

            }
        }

        return  -1;

        
    }

    private int findGCD(int a, int b){
        return b == 0 ? a : findGCD(b,a%b);
    }
}