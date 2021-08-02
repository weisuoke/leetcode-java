// 题解 https://leetcode-cn.com/problems/reverse-linked-list/solution/dong-hua-yan-shi-206-fan-zhuan-lian-biao-by-user74/
public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) {this.val = val;}
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2 {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode newHead = reverseList(head.next);
    // 这里比较难理解
    head.next.next = head;
    head.next = null;
    return newHead;
  }
}