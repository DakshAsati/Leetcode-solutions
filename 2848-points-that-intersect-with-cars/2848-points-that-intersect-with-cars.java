class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        if (nums == null || nums.size() == 0) return 0; // 🔴 REQUIRED

        int n = nums.size();
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = nums.get(i).get(0);
            intervals[i][1] = nums.get(i).get(1);
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = new int[]{intervals[0][0], intervals[0][1]};
        result.add(newInterval);

        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = new int[]{interval[0], interval[1]};
                result.add(newInterval);
            }
        }

        int ans = 0;
        for (int[] in : result) {
            ans += in[1] - in[0] + 1;
        }

        return ans;
    }
}
