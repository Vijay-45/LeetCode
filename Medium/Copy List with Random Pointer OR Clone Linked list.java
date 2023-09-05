

//Time Complexity - O(n)
//Auxilary Space - O(1)


class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;

      //We create Nodes between the nodes which are copy of the previous Node
        for(Node curr=head;curr!=null;curr=curr.next.next){
            Node temp=new Node(curr.val);
            temp.next=curr.next;
            curr.next=temp;
        }
//We make random pointer of the duplicate node just as the previous node
        for(Node curr=head;curr!=null;curr=curr.next.next){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
        }
//To get Hold of the head of the clone list
        Node req=head.next,curr=head;
      //We seperate the Both the lits Original and The Clone One
        while(curr!=null){
            Node temp=curr.next;
            curr.next=curr.next.next;
            if(temp.next!=null){
                temp.next=temp.next.next;
            }

            curr=curr.next;
            temp=temp.next;
        }
        return req;
    }
}
