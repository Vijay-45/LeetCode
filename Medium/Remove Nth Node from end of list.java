


//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode first=head,second=head;
        for(int i=0;i<n;i++){
            if(first==null) return null;
            first=first.next;
        }
        if(first==null){
            return head.next;
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return head;
    }
}
