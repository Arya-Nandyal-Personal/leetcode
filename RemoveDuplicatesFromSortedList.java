public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode l = head; ListNode r = head.next;
        while(r != null) {
            if(l.val == r.val) {
                l.next = r.next;
                r = r.next;
            } else {
                l = l.next;
                r = r.next;
            }
        }
        return head;
    }
}
