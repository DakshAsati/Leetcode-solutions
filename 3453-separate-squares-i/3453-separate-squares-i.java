class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.POSITIVE_INFINITY;
        double high = Double.NEGATIVE_INFINITY;
        double totalArea = 0.0;

        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            low = Math.min(low, y);
            high = Math.max(high, y + l);
            totalArea += l * l;
        }

        double target = totalArea / 2.0;

        for (int i = 0; i < 100; i++) {
            double mid = (low + high) / 2.0;
            double areaBelow = 0.0;

            for (int[] sq : squares) {
                double bottom = sq[1];
                double l = sq[2];
                double top = bottom + l;

                if (mid <= bottom) continue;
                if (mid >= top) areaBelow += l * l;
                else areaBelow += (mid - bottom) * l;
            }

            if (areaBelow < target) low = mid;
            else high = mid;
        }

        return high;
    }
}
