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
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        int i = 0;
        while(head!=null){
            list.add(head);
            head = head.next;
            i++;
        }
        return list.get(i/2);
    }
}

 //Time Complexity = O(n)
 //Space Complexity = O(n)
