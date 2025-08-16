class Solution {
    public int maximum69Number (int num) {
        char[] arr = String.valueOf(num).toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '6') {  // pehli 6 ko 9 me badal do
                arr[i] = '9';
                break; // ek hi change allowed hai
            }
        }

        return Integer.parseInt(new String(arr));
    }
}
