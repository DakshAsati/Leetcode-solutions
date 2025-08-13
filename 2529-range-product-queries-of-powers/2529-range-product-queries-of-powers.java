class Solution {
    public int[] productQueries(int n, int[][] queries) {
        long MOD = 1_000_000_007;

        // Step 1: Extract powers of two from n
        List<Integer> power = new ArrayList<>();
        int bit = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                power.add(1 << bit);
            }
            bit++;
            n >>= 1;
        }

        int m = power.size();

        // Step 2: Build prefix product array
        long[] prefix = new long[m];
        prefix[0] = power.get(0) % MOD;
        for (int i = 1; i < m; i++) {
            prefix[i] = (prefix[i - 1] * power.get(i)) % MOD;
        }

        // Step 3: Answer queries
        int[] ans = new int[queries.length];
        for (int qi = 0; qi < queries.length; qi++) {
            int l = queries[qi][0];
            int r = queries[qi][1];
            long prod = prefix[r];
            if (l > 0) {
                prod = (prod * modInverse(prefix[l - 1], MOD)) % MOD;
            }
            ans[qi] = (int) prod;
        }

        return ans;
    }

    // Fast exponentiation to get modular inverse (MOD is prime)
    private long modInverse(long a, long mod) {
        return modPow(a, mod - 2, mod);
    }

    private long modPow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
