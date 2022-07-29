public class Q34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null)
            return new int[] {-1, -1};

        int l = -1, r = nums.length, m;
        while (l + 1 != r) {
            m = (l + r) / 2;
            if (nums[m] < target)
                l = m;
            else
                r = m;
        }
        if (r == nums.length || nums[r] != target)
            return new int[] {-1, -1};
        int[] ans = new int[] {r, -1};

        l = -1; r = nums.length;
        while (l + 1 != r) {
            m = (l + r) / 2;
            if (nums[m] <= target)
                l = m;
            else
                r = m;
        }
        ans[1] = l;
        return ans;
    }
}
