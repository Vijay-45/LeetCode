

//Time Complexity - O(n)
//Auxilary Space - O(1)



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      //IF list contains only one node or list is null Or left and right are equal we return head
       if(head==null || head.next==null || left==right) return head;
       ListNode curr=head,temp=null;
       ListNode reqL=null,req=null;
      //For count of the nodes
       int count=1;
      //we stops when it is at the right node cause if we dont it reverse the next node also
       while(curr!=null && curr.next!=null && count<right){
         //To Hold the left node cause in future we need to change the left node while reversing
           if(count==left) req=curr;
           if(count<left){
             //Node before the left node Cause we need to link this node to the right node after reversal
               if(count==(left-1)) reqL=curr;
               curr=curr.next;
           }
           else{
               temp=curr.next;
               curr.next=temp.next;
               temp.next=req;
               req=temp;
           }
           count++;
       }
      //If reqL is not null it becomes null when left is 1 which is head node 
       if(reqL!=null){
         //Connectig the node before the left node with the right node after reversal
           reqL.next=req;
           return head;
       }
       return req;
    }
    
}
