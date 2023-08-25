
//Time Complexity - O(n)
//Auxilary Space - O(1)




class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr=head,temp=null,prev=null;
      /*Based on No of nodes like even no of nodes or Odd no of Nodes curr and curr.next becomes nulll to handle that Both
      were added */
        while(curr!=null && curr.next!=null){
          //Making second Node as head node
            if(curr==head){
                head=head.next;
            }
            if(prev!=null){
              //To attach prev Node with new Node after swappng which is right node
                prev.next=curr.next;
            }
            temp=curr.next;
            curr.next=curr.next.next;
            temp.next=curr;
          //Getting hold of current node So that it can be used to connect next nodes
            prev=curr;

            curr=curr.next;
        }
        return head;
    }
}
