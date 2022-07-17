import java.util.Comparator;
import java.util.PriorityQueue;

public class Q23_mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue<ListNode> pq2 = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });


        ListNode dummy = new ListNode(), cur = dummy;
        for (ListNode list: lists) {
            if (list != null)
                pq.add(list);
        }

        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null)
                pq.add(temp.next);
        }
        return dummy.next;
    }
}
