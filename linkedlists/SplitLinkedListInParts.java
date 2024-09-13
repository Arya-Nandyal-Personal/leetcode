package linkedlists;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int numNodes = 0;
        ListNode countNode = head;
        while(countNode != null) {
            numNodes++;
            countNode = countNode.next;
        }
        int numPartsWithExtra = numNodes % k;
        int numNodesPerSection = numNodes/k;
        ListNode[] parts = new ListNode[k];
        ListNode curr = head;
        ListNode startPart = head;
        for(int i = 0; i < k; i ++) {
            if(curr == null) break;
            if(numPartsWithExtra > 0) {
                numPartsWithExtra--;
                for(int nodeElem = 0; nodeElem < numNodesPerSection; nodeElem++) curr = curr.next;
            }else {
                for(int nodeElem = 0; nodeElem < numNodesPerSection -1; nodeElem++) curr = curr.next;
            }
            parts[i] = startPart;
            startPart = curr.next;
            curr.next = null;
            curr = startPart;
        }
        return parts;
    }
}
