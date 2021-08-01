// https://leetcode-cn.com/problems/binary-search/
// 题解： https://leetcode-cn.com/problems/binary-search/solution/er-fen-cha-zhao-by-leetcode/

class Solution {
  public static int search(int[] nums, int target) {
    int pivot, left = 0, right = nums.length - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }

    return -1;
  }
  
  public static void main(String[] args) {
    int result;
    int[] testNumbs = {1, 2, 3, 4, 5};
    result = Solution.search(testNumbs, 3);
    System.out.print(result);
  }
}
