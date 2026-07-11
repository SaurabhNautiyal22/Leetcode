class Solution {

    public void nextPermutation(int[] nums) {

        int length = nums.length;
        int pivotIndex = -1;

        for (int i = length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        if (pivotIndex == -1) {
            reverse(nums, 0, length - 1);
            return;
        }

        for (int i = length - 1; i > pivotIndex; i--) {

            if (nums[i] > nums[pivotIndex]) {
                swap(nums, i, pivotIndex);
                break;
            }
        }

        reverse(nums, pivotIndex + 1, length - 1);
    }

    private void swap(int[] nums, int firstIndex, int secondIndex) {

        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            swap(nums, left, right);

            left++;
            right--;
        }
    }
}