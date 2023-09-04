

//Time Complexity - O(n)
//Auxilary Space - O(n)




//Here we uses Extra by making the two lists 

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
      //One For the nodes with value less than the x value
        ListNode one=new ListNode(0);
        ListNode oneT=one;
      //Another One for the value grater than equal to the value
        ListNode two=new ListNode(0);
        ListNode twoT=two;

        while(curr!=null){
            if(curr.val<x){
                oneT.next=new ListNode(curr.val);
                oneT=oneT.next;
            }
            else{
                twoT.next=new ListNode(curr.val);
                twoT=twoT.next;
            }
            curr=curr.next;
        }
      //Connecting Bothe lists 
        oneT.next=two.next;

        return one.next;
    }
}
