import java.util.Collections;
import java.util.List;

public class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int count = 0;
        if (nums.get(0) > 0) {
            count++;
        }
        //divide after the index
        for (int i = 0; i < nums.size() - 1; i++) {
            int cur = nums.get(i);
            if (cur < i + 1 && nums.get(i + 1) > i + 1) {
                count++;
            }
        }
        if (nums.size() > nums.get(nums.size() - 1)) {
            count++;
        }
        return count;
    }
}
