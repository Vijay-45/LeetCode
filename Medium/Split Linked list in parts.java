

//Time Complexity - O(n)
//Auxilary Space - O(k)




class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0,index=0;
        ListNode[] res=new ListNode[k];
      //To get Count of the no of Nodes in the list
        for(ListNode curr=head;curr!=null;curr=curr.next){
            n++;
        }
      /*If in Case the k values exceeds no of nodes we make Only One node into parts
         Ex -  List : 1->2->3->4  K=5
              Then output should be - [[1],[2],[3],[4],[]]
              Remaining will be null thats why it is empty

              Or
          Ex - List : 1->2->3->4 k=4
               The Resultant array would be  - [[1],[2],[3],[4]]
               That why we make the condition as Greater then or Equal to 
        */
        if(n<=k){
            ListNode temp=head,prev=null;
            for(int i=0;i<k;i++){
                res[i]=temp;
                prev=temp;
                if(temp!=null) temp=temp.next;
                if(prev!=null) prev.next=null;
            }
            return res;
        }
      //It gives the Exact value as Example If nodes are 10 and k is 3 Then every window get 3 nodes
        int req=n/k;
      //If the no of nodes are not the exact multiple of K then we get remaining and arrange them at intail windows
        int rem=n%k;
        ListNode curr=head;
        while(curr!=null){
            ListNode first=curr,pre=null;
            int count=0,nes=req;
          //To arrange the reamining nodes the intial nodes we make logic here
            if(rem!=0){
                nes=req+1;
                rem--;
            }
            while(curr!=null && count<nes){
                pre=curr;
                curr=curr.next;
                count++;
            }
          //After every window is completed we make last node next to null
            pre.next=null;
          //First node of the every window will be stored in the resultant array
            res[index++]=first;
        }

        return res;
    }
}
