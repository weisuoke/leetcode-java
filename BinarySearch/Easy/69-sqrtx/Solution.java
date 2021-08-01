// https://leetcode-cn.com/problems/sqrtx/
// 题解: https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/
// 解法
// 1. 袖珍计算器发
// 2. 二分查找
// 3. 牛顿迭代
class Solution {
  public static int mySqrt(int x) {
    int l = 0, r = x, ans = -1;

    while (l <= r) {
      int mid = l + (r - l) / 2;
      if ((long) mid * mid <= x) {
        ans = mid;
        l = mid + l;
      } else {
        r = mid - l;
      }
    }

    return ans;
  }
  public static void main(String[] args) {
    int result;
    int testNum = 10;
    result = Solution.mySqrt(testNum);
    System.out.print(result);
  }
}