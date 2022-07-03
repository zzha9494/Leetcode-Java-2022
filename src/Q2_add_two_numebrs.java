class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Q2_add_two_numebrs {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cursor = head;
        int flag=0, x, y;

        while (l1!=null || l2!=null || flag != 0) {
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }
            else
                x = 0;

            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            else
                y = 0;

            cursor.next = new ListNode((x+y+flag)%10);
            flag = (x+y+flag)/10;
            cursor = cursor.next;
        }
        return head.next;
    }
}
