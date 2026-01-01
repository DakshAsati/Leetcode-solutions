class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[101];

        for(int[] log : logs){
            diff[log[0] - 1950]++;
            diff[log[1] - 1950]--;
        }

        int maxpop = 0;
        int currpop = 0;
        int year = 1950;
        
        for(int i = 0; i < 101; i++){
            currpop += diff[i];
            if(currpop > maxpop){
                maxpop = currpop;
                year = 1950 + i;
            }
        }

        return year;

        
    }
}

