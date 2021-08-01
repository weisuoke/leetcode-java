// 搜索旋转排序数组
// https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
// 题解：https://leetcode-cn.com/problems/search-in-rotated-sorted-array/solution/
// 解法： 1. 二分查找
class Solution {
  public static int search(int[] nums, int target) {
    int n = nums.length;
    if (n == 0) {
      return -1;
    }

    if (n == 1) {
      return nums[0] == target ? 0 : -1;
    }

    int l = 0, r = n - 1;
    while(l <= r) {
      int mid = (l + r) / 2;

      // 当中间的数等于目标数时，返回mid
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[l] <= nums[mid]) { // 判断左边是否是有序的
        if (nums[l] <= target && target < nums[mid]) {
          r = mid - 1;
        } else  {
          l = mid + 1;
        }
      } else {
        if (nums[mid] < target && target <= nums[n - l]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int result;
    int[] testNum = {4, 5, 6, 7, 0, 1, 2};
    result = Solution.search(testNum, 1);
    System.out.println(result);
  }
}