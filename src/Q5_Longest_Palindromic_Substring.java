public class Q5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, max = 1;

        for (int i = 0; i < n; i++)
            dp[i][i] = true;

        for (int L = 2; L <= n; L++) {
            for (int left = 0; left < n; left++) {
                int right = left + L - 1;

                if (right >= n)
                    break;

                if (s.charAt(left) == s.charAt(right)) {
                    if (right - left == 1)
                        dp[left][right] = true;
                    else
                        dp[left][right] = dp[left + 1][right - 1];
                }

                if (dp[left][right] && (right - left + 1) > max) {
                    start = left;
                    max = right - left + 1;
                }
            }
        }

        return s.substring(start, start+max);
    }
}
