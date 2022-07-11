import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 4)
            return ans;

        Arrays.sort(nums);

        for (int i=0; i<nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            long max = (long)nums[i] + nums[nums.length-3] + nums[nums.length-2] + nums[nums.length-1];
            long min = (long)nums[i] + nums[i+1] +nums[i+2] +nums[i+3];
            if (max < target)
                continue;
            if (min > target)
                break;

            for (int j = i+1; j<nums.length-2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1])
                    continue;

                max = nums[i] + nums[j] + nums[nums.length-2] + nums[nums.length-1];
                min = nums[i] + nums[j] +nums[j+1] +nums[j+2];
                if (max < target)
                    continue;
                if (min > target)
                    break;

                int start = j+1, end = nums.length - 1;
                while (start < end) {
                    int result = nums[i] + nums[j] + nums[start] + nums[end];
                    if (result == target)
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                    if (result <= target) {
                        start++;
                        while (start < end && nums[start-1] == nums[start])
                            start++;
                    }
                    if (result >= target) {
                        end--;
                        while (start < end && nums[end] == nums[end+1])
                            end--;
                    }
                }
            }
        }
        return ans;
    }
}
