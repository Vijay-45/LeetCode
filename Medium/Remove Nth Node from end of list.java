


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode first=head,second=head;
        for(int i=0;i<n;i++){
            //if n>no of nodes 
            if(first==null) return null;
            first=first.next;
        }
        // If n==no of nodes first becomes null
        if(first==null){
            return head.next;
        }
        //if first stops at last element then second node stops just before the element need to be removed
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        //removing the element
        second.next=second.next.next;
        return head;
    }
}
