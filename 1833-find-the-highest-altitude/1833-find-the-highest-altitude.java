class Solution {
    public int largestAltitude(int[] gain) {
        int maxaltitude = 0, altitute = 0;

        for(int i = 0; i < gain.length; i++){
            altitute += gain[i];
            maxaltitude = Math.max(maxaltitude,altitute);

        }
        return maxaltitude;
        
    }
}