class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        double totalArea = 0.0;

        // Find bounds and total area
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            low = Math.min(low, y);
            high = Math.max(high, y + l);
            totalArea += l * l;
        }

        double target = totalArea / 2.0;

        // Binary search
        for (int iter = 0; iter < 100; iter++) { // enough for 1e-5 precision
            double mid = (low + high) / 2.0;
            double areaBelow = 0.0;

            for (int[] sq : squares) {
                double bottom = sq[1];
                double l = sq[2];
                double top = bottom + l;

                if (mid <= bottom) {
                    continue;
                } else if (mid >= top) {
                    areaBelow += l * l;
                } else {
                    areaBelow += (mid - bottom) * l;
                }
            }

            if (areaBelow < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
