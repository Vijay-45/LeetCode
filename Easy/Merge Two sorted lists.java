
//Time Compleixty - O(m+n)
//Auxilary Space - O(1)





class Solution {
    public ListNode mergeTwoLists(ListNode one, ListNode two) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(one!=null && two!=null){
            if(one.val<=two.val){
                current=InsertAtTail(current,one.val);
                one=one.next;
            }
            else if(two.val<one.val){
                current=InsertAtTail(current,two.val);
                two=two.next;
            }
        }
        while(one!=null){
            current=InsertAtTail(current,one.val);
            one=one.next;
        } 
        while(two!=null){
            current=InsertAtTail(current,two.val);
            two=two.next;
        }
        return dummy.next;
    }
    ListNode InsertAtTail(ListNode head,int x){
        ListNode temp=new ListNode(x);
        head.next=temp;
        head=temp;
        return head;
    }
}
