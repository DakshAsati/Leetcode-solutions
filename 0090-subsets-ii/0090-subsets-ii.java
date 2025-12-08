class Solution {
    public void solve(int[] nums, int index, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for(int i = index; i< nums.length; i++){
            if(i > index && nums[i] == nums[i - 1])continue;
                ds.add(nums[i]);
                solve(nums, i + 1, ds, ans);
                ds.remove(ds.size() - 1);
            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, ds,ans);
        return ans;
        
    }
}