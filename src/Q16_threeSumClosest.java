import java.util.Arrays;

public class Q16_threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int ans = nums[0] + nums[1] + nums[2];

        for (int i=0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1, right = nums.length - 1;
            int max = nums[i] + nums[right - 1] + nums[right];
            int min = nums[i] + nums[left] + nums[left + 1];

            if (max <= target) {
                if (Math.abs(target - max) < Math.abs(target - ans)) {
                    ans = max;
                    if (ans == target)
                        return ans;
                }
                continue;
            }

            if (min >= target) {
                if (Math.abs(target - min) < Math.abs(target - ans))
                    ans = min;
                break;
            }

            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];

                if (temp == target)
                    return temp;
                else if (Math.abs(target - temp) < Math.abs(target - ans))
                    ans = temp;

                if (temp > target) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
                else {
                    left++;
                    while (left < right && nums[left - 1] == nums[left])
                        left++;
                }
            }
        }
        return ans;
    }
}
