class Solution {
    public void sortColors(int[] nums) {

        int leftPointer = 0;
        int currentPointer = 0;
        int rightPointer = nums.length - 1;
        
        while (currentPointer <= rightPointer) {
            if (nums[currentPointer] == 0) {

                swap(nums, leftPointer, currentPointer);
                leftPointer++;
                currentPointer++;
            }
            else if (nums[currentPointer] == 1) {
                currentPointer++;
            }

            else {
                swap(nums, currentPointer, rightPointer);
                rightPointer--;
            }
        }
    }

    private void swap(int[] nums, int firstIndex, int secondIndex) {

        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}