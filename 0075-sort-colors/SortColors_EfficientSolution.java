public class SortColors_EfficientSolution {
    class Solution {
        public void sortColors(int[] nums) {
            int size = nums.length;
            int currentIndex = 0;
            int start = 0;
            int end = size - 1;

            while (currentIndex <= end && start < end) {
                if (nums[currentIndex] == 0) {
                    nums[currentIndex] = nums[start];
                    nums[start] = 0;
                    start++;
                    currentIndex++;
                } else if (nums[currentIndex] == 2) {
                    nums[currentIndex] = nums[end];
                    nums[end] = 2;
                    end--;
                } else {
                    currentIndex++;
                }
            }
        }
    }
}
