

//Time Complexity - O(n)
//Auxilary Space - O(n)



class Solution {
    public ListNode removeElements(ListNode head, int k) {
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        while(curr!=null){
            if(curr.val!=k){
                res.next=curr;
                res=res.next;
            }
            curr=curr.next;
        }
        res.next=null;
        return dummy.next;
    }
}
