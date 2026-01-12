class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int n = points.length;
        // int dx1, dy1,dx2,dy2 = 0;

        for(int i = 1; i < n; i++){
           int dx = Math.abs(points[i][0] - points[i-1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);

            time += Math.max(dx,dy);


        }
        return time;
        
    }
}

//points[ = [xi, yi]
// in 1 second horizontal or veri
// 3,2 -> 2,1 -> 1,0 -> 0,-1 -> -1,-2 -> -2, 2
// 