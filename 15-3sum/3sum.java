import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int first = 0; first < n; first++) {

            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int left = first + 1;
            int right = n - 1;

            while (left < right) {

                int currentSum = nums[first] + nums[left] + nums[right];

                if (currentSum < 0) {
                    left++;
                }
                else if (currentSum > 0) {
                    right--;
                }
                else {

                    result.add(Arrays.asList(
                            nums[first],
                            nums[left],
                            nums[right]
                    ));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}