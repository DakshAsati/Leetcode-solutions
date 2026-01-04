class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;

        for(int x: nums){
            int sum = getsumiffourdivisor(x);
            total += sum;
        }

        return total;
    }


private int getsumiffourdivisor(int x){
    int p = (int)Math.round(Math.cbrt(x));
    if(p*p*p == x && isPrime(p)){
        return 1+ +p+p*p+x;
    }

    for(int i = 2; i*i <= x; i++){
        if(x % i == 0){
            int j = x / i;
            if(i != j && isPrime(i) && isPrime(j)){
                return 1 + i + j + x;
            }
            return 0;
        }
    }

    return 0;
}

private boolean isPrime(int n){
    if(n < 2) return false;
    for(int i = 2; i*i <= n; i++){
        if(n % i == 0)return false;
    }
    return true;

}

}
// made one int variable :x 
// 21 -> mulitples -> 1, 3 , 7 ,21
// condition -> 1. 4 divisior
//              2. highest sum
//

// pseduo code
// for(int i = 0;i < n; i++)
//int max =0
// double[] arr = new double[n];
//  arr[] = Math.sqrt(nums[i])
// for(double j = 0; j < arr.length; j++)
//  int[] num = (int)arr[i];
// for(int k = 0; k < num.length; k++)
// for(int z = 0; z < num[k]; z++)
// if(nums[i] % z == 0 && count == 4) 
//  sum += nums[i]
// max = Math.max(sum, max)
//return max