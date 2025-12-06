class Solution {

    public void solve(int[] nums, int index, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for(int i = index; i <= nums.length - 1; i++){
            ds.add(nums[i]);
            solve(nums, i + 1, ds, ans);
            ds.remove(ds.size() - 1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}