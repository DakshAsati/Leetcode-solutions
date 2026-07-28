class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), resutlt);
        return result;


        
    }

    private void backtrack(int[] candidate, int target, int start, List<Integer> list, List<List<Integer>> result){

        if(target < 0) return ;


        if(target == 0){
            result.add(new ArrayList<>(list));
        }

        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, list,result);
            list.remove(list.size() - 1);
        }
    }
}