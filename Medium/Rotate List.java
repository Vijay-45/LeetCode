

//Time Complexity - O(n)
//Auxilary Space - O(1)





class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      // if list is empty or if k==0 then we dont need to rotate anything we return head
        if(head==null || k==0){
            return head;
        }
        ListNode curr=head,temp=head;
        int n=0;
      //To get Hold of the last node 
        while(curr.next!=null){
            curr=curr.next;
          //gives the no of passes to reach the last Node
            n++;
        }
      //connecting last node with first node;
        curr.next=head;
        k=k%(n+1); // if k exceeds the size of the linked list 
        int jump=(n-k);  //no of passes to get the node whose next node is the resultant head and node itself is the last node.
        for(int i=0;i<jump;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
