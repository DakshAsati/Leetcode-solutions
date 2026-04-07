class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            int count  = 0;


            while(!st.isEmpty() && st.peek() < heights[i]){
                st.pop();
                count++;
            }


            if(!st.isEmpty()){
                count++;
            }

            arr[i] = count;
            st.push(heights[i]);
        }

            return arr;
        
    }
}