class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;

        for(int[] task: tasks){
            int finishTime = task[0] + task[1];
            earliest = Math.min(earliest, finishTime);
        }
        return earliest;
        
    }
}