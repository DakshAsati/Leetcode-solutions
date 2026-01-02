class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                if(Valid(nums, i , -1)) ans++;
                if(Valid(nums, i, 1)) ans++;
            }
        }
        return ans;
    }

    private boolean Valid(int[] nums, int start, int dir){
        int[] arr = nums.clone();
        int curr = start;
        int d = dir;

        while(curr >= 0 && curr < arr.length){
            if(arr[curr] == 0){
                curr += d;
            }else{
                arr[curr]--;
                d = -d;
                curr += d;
            }
        }

        for(int x : arr){
            if(x != 0)return false;
        }
        return true;
    }

}