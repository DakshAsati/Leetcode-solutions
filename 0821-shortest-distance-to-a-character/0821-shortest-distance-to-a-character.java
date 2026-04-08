class Solution {
    public int[] shortestToChar(String s, char c) {
        int l = s.length();
        int[] result = new int[l];


        int prev = -10000;

        for(int i = 0; i <= l - 1; i++){
            if(s.charAt(i) == c){
                prev = i;
            }

            result[i] = i - prev;
        }


         prev = 10000;

        for(int i = l - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                prev =i;
            }

            result[i] = Math.min(result[i], prev - i);
        }

        return result;



        
    }
}