public class Q25_reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur == null)
                return head;
            cur = cur.next;
        }
        cur = reverseKGroup(cur, k);
        for (int i = 0; i < k; i++) {
            ListNode temp = head.next;
            head.next = cur;
            cur = head;
            head = temp;
        }
        return cur;
    }
}
