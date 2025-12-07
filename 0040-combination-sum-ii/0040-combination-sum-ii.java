import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private void helper(int[] candidates, int index, int target, List<Integer> ds, List<List<Integer>> result){
        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }

        // early pruning
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            // skip duplicates (requires sorted array)
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            // if current value exceeds remaining target, we can break because array is sorted
            if (candidates[i] > target) break;

            ds.add(candidates[i]);
            helper(candidates, i + 1, target - candidates[i], ds, result);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
}
