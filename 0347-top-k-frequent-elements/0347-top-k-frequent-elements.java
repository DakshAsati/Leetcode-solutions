class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int n : nums){
            counter.put(n, counter.getOrDefault(n,0) + 1);

        }
            PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(), a.getValue()));

            for(var e : counter.entrySet()){
                heap.offer(e);
            }
            int[] res = new int[k];
            for(int i = 0; i < k; i++){
                res[i] = heap.poll().getKey();
            }

            
        
        return res;
        }
    }

        
    
