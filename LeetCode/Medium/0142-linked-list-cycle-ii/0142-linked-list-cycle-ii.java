/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        while (head!=null) {
            map.put(head, map.getOrDefault(head,0) + 1);
            if (map.get(head)==2) {
                return head;
            }
            head=head.next;
        }
        return null;

    }
}