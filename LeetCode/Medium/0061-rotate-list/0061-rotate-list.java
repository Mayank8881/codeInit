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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode temp=head;
        int length=1;

        while(temp.next!=null){
            length++;
            temp=temp.next;
        }

        temp.next=head;
        k=k%length;

        ListNode last=head;
        for(int i=0;i<length-k-1;i++){
            last=last.next;
        }

        ListNode newHead = last.next;
        last.next = null;

        return newHead;
        
    }
}