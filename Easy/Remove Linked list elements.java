

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


____________________________________________________________________________________________________________________________


    //Time Complexity - O(n)
    //Auxilary Space - O(1)

    class Solution {
    public ListNode removeElements(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr!=null && curr.next!=null){
            if(curr.next.val==k){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}
