// https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
// 题解： https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/solution/
class Solution {
  public static int findMin(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    while (low < high) {
      int pivot = low + (high - low) / 2;
      if (nums[pivot] < nums[high]) {
        high = pivot;
      } else if (nums[pivot] > nums[high]) {
        low = pivot + 1;
      } else {
        high -= 1;
      }
    }

    return nums[low];
  }

  public static void main(String[] args) {
    int result;
    int[] testNum = {4,5,6,7,0,0,0,1,1,2};
    result = Solution.findMin(testNum);
    System.out.print(result);
  }
}