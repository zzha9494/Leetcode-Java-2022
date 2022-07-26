public class Q31_nextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i -= 1;
        if (i >= 0) {
            int j = nums.length - 1;
            while (i < j && nums[i] >= nums[j])
                j -= 1;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
            int temp = nums[right];
            nums[right--] = nums[left];
            nums[left++] = temp;
        }
    }
}
