
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
        ListNode mid = head;
        ListNode end = head;

       /* 1 2 3 4 5 6 incrementing end by 2 steps and increase mid by 1 step since mid increases only when size gets increeased by 2

        1 -> 1
        1 2 -> 2
        1 2 3 -> 2
        1 2 3 4 -> 3
        1 2 3 4 5 -> 3

       */
        while(end!=null && end.next!= null){
            mid = mid.next;
            end = end.next.next;
        }
        return mid;
    }
}

 //Time Complexity = O(n)
 //Space Complexity = O(1)
