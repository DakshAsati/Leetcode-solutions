import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nextsm = nextSmaller(arr);
        int[] prevsm = previousSmaller(arr);
        int mod = 1000000007;
        long count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int first = i - prevsm[i];
            int second = nextsm[i] - i;
            long prod = (first * second) % mod;
            prod = (prod * arr[i]) % mod;
            count = (count + prod) % mod;  
        }
        
        return (int) count;
    }

    private int[] nextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = arr.length;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);  // **Fix: Move push inside the loop**
        }
        return ans;
    }

    private int[] previousSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);  // **Fix: Move push inside the loop**
        }
        return ans;
    }
}
