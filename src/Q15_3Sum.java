import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3)
            return ans;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return ans;
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int start = i+1, end = nums.length-1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum == -nums[i]) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end])));
                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start-1])
                        start++;
                    while (start < end && nums[end] == nums[end+1])
                        end--;
                }
                else if (sum > -nums[i])
                    end--;
                else
                    start++;
            }
        }
        return ans;
    }
}
