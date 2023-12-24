/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode current=dummy;
        ListNode nex=dummy;
        int count=0;
        while(current.next!=null){
            count++;
            current=current.next;
        }
        while(count>=k){
            current=pre.next;
            nex=current.next;
            for(int i=1;i<k;i++){
                current.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=current.next;
            }
            pre=current;
            count=count-k;
        }
        return dummy.next;
    }
}