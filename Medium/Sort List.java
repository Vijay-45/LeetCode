

//Time Compleixity - O(n logn)
//Auxilary Space- O(1)


//Merge sort using the Bottom-Up approcah instead of recurssion


class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        int n=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            n++;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode left=null,right=null;
        for(int i=1;i<n;i<<=1){
            ListNode prev=dummy;
            ListNode curr=dummy.next;
            while(curr!=null){
                left=curr;
                right=Split(left,i);
                curr=Split(right,i);
                prev=merge(left,right,prev);
            }
        }
        return dummy.next;
    }
    ListNode Split(ListNode head,int req){
        if(head==null) return head;
        for(int i=1;head.next!=null && i<req;i++){
            head=head.next;
        }

        ListNode right=head.next;
        head.next=null;
        return right;
    }
    ListNode merge(ListNode left,ListNode right,ListNode prev){
        ListNode res=prev;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                res.next=left;
                left=left.next;
            }
            else{
                res.next=right;
                right=right.next;
            }
            res=res.next;
        }

        while(left!=null){
            res.next=left;
            left=left.next;
            res=res.next;
        }

        while(right!=null){
            res.next=right;
            right=right.next;
            res=res.next;
        }

        return res;
    }
