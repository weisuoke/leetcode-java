// 解法：递归

// TODO wuxiao? 这个解法还有很多地方不能理解
let frontPointer;

const recursivelyCheck = (currentNode) => {
  if (currentNode !== null) {
    if (!recursivelyCheck(currentNode.next)) {
      return false
    }
    if (currentNode.val !== frontPointer.val) {
      return false
    }
    frontPointer = frontPointer.next
  }
  return true
}

const isPalindrome = function (head) {
  frontPointer = head;
  return recursivelyCheck(head)
}

// 1 -> 2 -> 2 -> 1