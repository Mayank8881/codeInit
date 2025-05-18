class Solution {
    long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        int ans=(int)((binpow(5,even)*binpow(4,odd))%MOD);
        return ans;
    }

    private long binpow(long a, long b) {
        a %= MOD;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

}