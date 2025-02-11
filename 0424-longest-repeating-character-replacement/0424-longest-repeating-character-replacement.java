class Solution {
    public int characterReplacement(String s, int k) {

        
        HashMap<Character,Integer> freq = new HashMap<>();
                int res = 0; int i = 0; int maxfreq = 0;

                for(int j = 0; j < s.length(); j++){
                    char c = s.charAt(j);
                    freq.put(c, freq.getOrDefault(c,0) + 1);
                    maxfreq = Math.max(maxfreq, freq.get(c));


                    while((j -i + 1) - maxfreq > k){
                        char left = s.charAt(i);
                        freq.put(left, freq.get(left) - 1);
                        i++;
                    }

                    res = Math.max(res, j-i + 1);


                }

                return res;


        
    }
}