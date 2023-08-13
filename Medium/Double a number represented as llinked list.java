

//Time Complexity - O(n)
//Auxilary Space - O(1)



class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr=head;
        
        curr=Reverse(head);
        
        curr=Solve(curr);
        
        curr=Reverse(curr);
        
        return curr;
    }
    ListNode Reverse(ListNode head){
        ListNode curr=head;
        ListNode next=null;
        while(curr.next!=null){
            next=curr.next;
            curr.next=next.next;
            next.next=head;
            head=next;
        }
        return head;
    }
    ListNode Solve(ListNode head){
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        int carry=0;
        while(curr!=null || carry!=0){
            int temp=0;
            if(curr!=null) temp=curr.val;
            int sum=(temp*2)+carry;
            int dig=sum%10;
            ListNode newNode=new ListNode(dig);
            res.next=newNode;
            res=newNode;
            carry=sum/10;
            if(curr!=null) curr=curr.next;
        }
        return dummy.next;
    }
}
