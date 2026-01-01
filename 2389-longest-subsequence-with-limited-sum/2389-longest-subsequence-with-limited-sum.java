class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;

        
        int[] prefix = new int[n];


        for(int i = 0; i < n; i++){
            if(i == 0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }
            
            int[] answer = new int[queries.length];
            for(int i = 0; i < queries.length; i++){
            int l = 0, r = n - 1, res = - 1;

            while(l <= r){
                 int mid = (l + r) / 2;
                if(prefix[mid] <= queries[i]){
                            res = mid;
                            l = mid + 1;
                }else{
                    r = mid - 1;;
                }
                
            }

            answer[i] = res + 1;
            
        }
return answer;



        
    }
}

// return an array[m]

//sum of answer[i] is <= queries[i] 
// queries -> 3 + 10 + 21 -> 34
// 


// sort -> 1,2,4,5
// prefix sum ->  1, 3 , 7 , 12
// -> queries -> 3 , 10 , 21
// 1 <= 3
// 3 < = 3 [1] right
// 7 >= 3


// index  + 1 -> 2

