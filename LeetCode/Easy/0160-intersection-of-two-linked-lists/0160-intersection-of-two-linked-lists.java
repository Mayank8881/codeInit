/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempB=headB;

        while(headB!=null){
            ListNode tempA=headA;
            while(tempA!=null){
                if(headB==tempA) return headB;
                tempA=tempA.next;
            }
            headB=headB.next;
        }

        return null;
    }
}