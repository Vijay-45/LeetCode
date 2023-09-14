

//Time Complexity - O(1)
//Auxilary Space - O(1)


//We just copy the next node value into the current node then remove the next one 

class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
        curr.val=curr.next.val;
        curr.next=curr.next.next;
    }
}
