public class Q35_searchInsert {
    public int searchInsert(int[] nums, int target) {
        int l = -1, r = nums.length, m;
        while (l + 1 != r) {
            m = (l + r) / 2;
            if (nums[m] < target)
                l = m;
            else
                r = m;
        }
        return r;
    }
}
