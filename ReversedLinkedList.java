public class ReversedLinkedList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode beforeLeft = null;
        ListNode afterRight = null;
        int index = 1;
        while(index < left){
            beforeLeft = current;
            current = current.next;
            index++;
        }
        while(index < right){
            current = current.next;
            index++;
        }
        afterRight = current.next;
        if(beforeLeft == null){
            current = head;
        }else{
            current = beforeLeft.next;
        }
        ListNode prev = afterRight;
        ListNode next = null;
        while (current != afterRight){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(beforeLeft != null){
            beforeLeft.next = prev;
        }else{
            return prev;
        }
        return head;
    }
}
