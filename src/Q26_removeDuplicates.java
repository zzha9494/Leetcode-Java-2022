public class Q26_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int slow = 1;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[i-1])
                nums[slow++] = nums[i];
        return slow;
    }
}
