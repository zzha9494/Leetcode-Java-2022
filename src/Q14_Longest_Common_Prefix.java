public class Q14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        else
            return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefix(String[] strs, int start, int end) {
        if (start == end)
            return strs[start];
        else {
            int mid = (end - start)/2 + start;
            String left = longestCommonPrefix(strs, start, mid);
            String right = longestCommonPrefix(strs, mid + 1, end);
            return commonPrefix(left, right);
        }
    }

    public String commonPrefix(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i=0; i<minLength; i++)
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        return left.substring(0, minLength);
    }
}
