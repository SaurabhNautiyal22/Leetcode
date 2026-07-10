class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastIndex = m + n - 1;

        int firstArray = m - 1;

        int secondArray = n - 1;

        while (firstArray >= 0 && secondArray >= 0) {

            if (nums1[firstArray] >= nums2[secondArray]) {
                nums1[lastIndex] = nums1[firstArray];
                firstArray--;
            } else {
                nums1[lastIndex] = nums2[secondArray];
                secondArray--;
            }

            lastIndex--;
        }

        while (secondArray >= 0) {
            nums1[lastIndex] = nums2[secondArray];
            secondArray--;
            lastIndex--;
        }
    }
}