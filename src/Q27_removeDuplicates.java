public class Q27_removeDuplicates {
    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1, left = 0;
        while (left <= right) {
            if (nums[left] == val)
                nums[left] = nums[right--];
            else
                left++;
        }
        return left;
    }
}
