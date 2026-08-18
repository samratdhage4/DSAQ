/*
Remove Duplicates from a Sorted Linked List
Solved
Difficulty: EasyAccuracy: 49.37%Submissions: 344K+Points: 2Average Time: 20m
Given the head of a sorted singly linked list, remove all duplicate nodes so that each element 
appears only once. The resulting linked list should remain sorted.

Note: Try to solve the problem without using extra space.

Examples:

Input: Head: 2->2->4->5
Output: 2 -> 4 -> 5

Explanation: In the given linked list 2 -> 2 -> 4 -> 5, only 2 occurs more than 1 time. 
So we need to remove it once.
Input: Head: 2->2->2->2->2
Output: 2

Explanation: In the given linked list  2 -> 2 -> 2 -> 2, 2 is the only element and is repeated 5 times. 
So we need to remove any four 2.


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
public class removeDupLinklist 
{

    node removeDuplicates(node head)
    {
        if(head==null)
            return null;

        node temp=head;

        while (temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }else
            {
                temp=temp.next;
            }
            
        }

        return head;
    }

    public static void main(String[] args) {
        
        removeDupLinklist r = new removeDupLinklist();
          node n1= new node(0);
        node n2= new node(0);
        node n3= new node(0);
        node n4= new node(0);
        node n5= new node(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

       node result = r.removeDuplicates(n1);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }

    }
    
}
