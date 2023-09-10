

//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
      //Finding the middle element
        ListNode mid=findMid(head);
      //Reversing only the nodes which are after the mid node
        ListNode req=Reverse(mid.next);
      //making the mid next as null
        mid.next=null;
        ListNode curr=head,temp=null;
      //adding the reversed nodes after the original nodes 
        while(curr!=null && curr.next!=null){
            temp=req.next;
            req.next=curr.next;
            curr.next=req;
            req=temp;
            curr=curr.next.next;
        } 
      //If there are odd no of nodes req becomes null for even no of nodes it wont become null so handle that here
        if(req!=null){
            curr.next=req;
        }
    }
    ListNode findMid(ListNode head){
        ListNode fast=head.next,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    ListNode Reverse(ListNode head){
        ListNode curr=head,temp=null;
        while(curr!=null && curr.next!=null){
            temp=curr.next;
            curr.next=temp.next;
            temp.next=head;
            head=temp;
        }
        return head;
    }
}
