

//Time Complexity - O(n)
//Auxilary Space- O(1)




class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
      //we Make a dummy node so that if the left over nodes do not be effected
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int count=0;
        ListNode curr=dummy,nex=dummy,pre=dummy;
      //To get the count of the nodes
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
      //we reverse in groupd if the count is greater than the k
        while(count>=k){
            curr=pre.next;
            nex=curr.next;
          //One of type logic for the reversal of the linked list
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
          //It acts a just as the dummy node for the next windows
            pre=curr;
            count-=k;
        }
        return dummy.next;


    }
}
