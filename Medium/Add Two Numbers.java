

//Time Complexity - O(m+n)
//Auxilary Space - O(max(m,n))






class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res=add(l1,l2);

        
        return res;
    }
    ListNode add(ListNode first,ListNode second){
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        int carry=0;
        while(first!=null || second!=null || carry!=0){
            int val1=0;
            if(first!=null) val1=first.val;
            int val2=0;
            if(second!=null) val2=second.val;
            int sum=val1+val2+carry;
            int dig=sum%10;
            ListNode temp=new ListNode(dig);
            res.next=temp;
            res=temp;
            carry=sum/10;
            if(first!=null) first=first.next;
            if(second!=null) second=second.next;
        }
        return dummy.next;


    }
}
