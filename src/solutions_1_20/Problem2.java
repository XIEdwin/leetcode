package solutions_1_20;

/**
 * @author xzw
 * @create 2020-03-03 16:01
 */

/**
 * 解题思路:
 */

import tools.ListNode;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int i = l1 == null ? 0 : l1.val;
            int j = l2 == null ? 0 : l2.val;
            int sum = i + j + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return head.next;
    }
}
