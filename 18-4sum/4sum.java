import java.util.*;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int first = 0; first < n; first++) {

            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            for (int second = first + 1; second < n; second++) {

                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                int left = second + 1;
                int right = n - 1;

                while (left < right) {

                    long currentSum = (long) nums[first]
                                    + nums[second]
                                    + nums[left]
                                    + nums[right];

                    if (currentSum < target) {
                        left++;
                    }
                    else if (currentSum > target) {
                        right--;
                    }
                    else {

                        result.add(Arrays.asList(
                                nums[first],
                                nums[second],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return result;
    }
}