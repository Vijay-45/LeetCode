

//Time Complexity  - O(n)
//Auxilary Space - O(1)



class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(curr!=null){
          //If adjacent nodes are equal 
            if(curr.next!=null && curr.val==curr.next.val){
              //we move curr to the end cause there is a positbility having many duplicate nodes
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
              /*we use prev to store the prev pointer we make prev next to point to the node after the contineous duplicate 
               nodes Ex - 1->2->3->3->3->4->null
               we have 2 value as prev then we enter into the loop and we get out at last duplicate node then we make
               prev.next = 4 by eliminating the duplicate nodes
                */
                prev.next=curr.next;
            }
            else{
              //If there is no duplicate nodes we just traverse prev node
                prev=prev.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}
