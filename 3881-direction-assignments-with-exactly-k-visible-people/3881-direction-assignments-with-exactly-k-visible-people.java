class Solution {
    int MOD = (int)1e9 + 7;
    long[] fact, inv;

    long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    void init(int n) {
        fact = new long[n + 1];
        inv = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        inv[n] = pow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--) {
            inv[i] = inv[i + 1] * (i + 1) % MOD;
        }
    }

    long comb(int n, int r) {
        return fact[n] * inv[r] % MOD * inv[n - r] % MOD;
    }

    public int countVisiblePeople(int n, int pos, int k) {
        int left = pos;
        int right = n - pos - 1;
        long ans = 0;

        init(n);

        for (int i = Math.max(0, k - right); i <= Math.min(left, k); i++) {
            ans = (ans + comb(left, i) * comb(right, k - i)) % MOD;
        }

        return (int)((ans * 2) % MOD);
    }
}