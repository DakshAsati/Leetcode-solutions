class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();

        int[] prefix = new int[n + 1];
        

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + nums.get(i);

        }

        int ans = Integer.MAX_VALUE;

        for(int len = l; len <= r; len++){
            for(int i = 0; i + len <= n; i++){
                int sum = prefix[i + len] - prefix[i];
                if(sum > 0){
                    ans = Math.min(ans,sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

// array = [3,-2,1,4], l = 2, r = 3
// find min sum whose size is b/w l and r
// l = 2, r = 3,
// so subarrays are -> [3,-2], [1,4], [3,-2,1], [-2,1,4]


// approach 1
// prefix sum  + sliding window
// sliding window for taking the subarray
// store in array or in list<Integer> and return minimun

// approach 2 
// prefix sum  + normal find subarray
// take subarray and store in list<INteger>
// return the minimum

//define list<Integer> nums
//build prefix sum -> prefix[i] = prefix[i - 1] + nums[i]
//

