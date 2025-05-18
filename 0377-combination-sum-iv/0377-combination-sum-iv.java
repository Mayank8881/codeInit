class Solution {
    public int combinationSum4(int[] N, int T) {
        int[] dp = new int[T+1];
        dp[0] = 1;
        for (int i = 0; i < T; i++) {
            if (dp[i] == 0) continue;
            for (int num : N)
                if (num + i <= T) dp[i+num] += dp[i];
        }
        return dp[T];
    }
}