// 解法一：暴力破解法
// 暴力求解，列举所有的子串，判断是否为回文串，保存最长的回文串
// Time: O(n^3)
// Space: O(1)

// NOTE: 提交超时
class Solution {
  public boolean isPalindromic(String s) {
    int len = s.length();
    for (int i = 0; i < len / 2; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public String longestPalindrome(String s) {
    String ans = "";
    int max = 0;
    int len = s.length();
    for (int i = 0; i < len; i++) {
      for (int j = i; j <= len; j++) {
        String test = s.substring(i, j);
        if (isPalindromic(test) && test.length() > max) {
          ans = test;
          max = ans.length();
        }
      }
    }
    return ans;
  }
}