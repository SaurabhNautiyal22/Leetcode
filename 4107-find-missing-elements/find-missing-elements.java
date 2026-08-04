import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> missing = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            int previous = nums[i - 1];
            int current = nums[i];

            for (int num = previous + 1; num < current; num++) {
                missing.add(num);
            }
        }

        return missing;
    }
}