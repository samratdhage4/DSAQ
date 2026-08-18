/*
Identical Linked Lists
Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false.

Examples:

Input: head1: 1->2->3->4->5->6, head2: 99->59->42->20
Output: false
Explanation:

As shown in figure the two lists are not identical.
Input: head1: 1->2->3->4->5, head2: 1->2->3->4->5
Output: true
Explanation: 
 
As shown in figure both are identical.
Constraints:
1 ≤ length of lists ≤ 105
1 ≤ elements of lists ≤ 105

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
*/


class node
{
    int data;
    node next;

    node(int x)
    {
        this.data=x;
        this.next=null;

    }
}

public class identical 
{
     public boolean areIdentical(node head1, node head2) {
      
        while (head1!=null && head2!=null)
        {
            if(head1.data !=head2.data)
            {
                return false;

            }

            head1=head1.next;
            head2= head2.next;
            
        }
        
        return head1==null && head2== null; 
    }
    public static void main(String[] args) {
        
        identical i = new identical();
        node n1= new node(0);
        node n2= new node(2);
        node n3= new node(3);
        node n4= new node(4);
        node n5= new node(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        node m1= new node(0);
        node m2= new node(2);
        node m3= new node(3);
        node m4= new node(4);
        node m5= new node(5);

        m1.next=m2;
        m2.next=m3;
        m3.next=m4;
        m4.next=m5;

            System.out.println(i.areIdentical(m1, n1));
      
        
    }
    
}
