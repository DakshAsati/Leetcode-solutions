class Solution {
    public int maxScore(String s) {

        int ones = 0;
        for(char c : s.toCharArray()){
            if(c == '1')ones++;
        }
        int leftzeros = 0;
        int rightones = ones;
        int max = 0;

        for(int i = 0; i <= s.length() - 2; i++){
                if(s.charAt(i) == '0'){
                    leftzeros++;
                }else{
                    rightones--;
                }
                max = Math.max(max, leftzeros + rightones);
        }

        return max;
        
    }
}