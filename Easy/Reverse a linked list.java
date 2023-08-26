

//Time Complexity - O(n)
//Auxilary Space - O(1)





class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,temp=null;
        while(curr!=null && curr.next!=null){
            temp=curr.next;
            curr.next=curr.next.next;
            temp.next=head;
            head=temp;

        }
        return head;

    }
}
