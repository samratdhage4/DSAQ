/**
 * Definition for singly-linked list.
 * 
 * 234. Palindrome Linked List
Solved
Easy
Topics
premium lock icon
Companies
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
 */

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class palidrome {

    

    public boolean isPalindrome(ListNode head) 
    {
          if (head == null || head.next == null) {
            return true;
        }


        ListNode slow=head;
        ListNode fast=head;
      

      while(fast!=null && fast.next!=null)
      {
            slow= slow.next;
            fast=fast.next.next;
      }

      
     ListNode prev=reverseList(slow);


      while(prev!=null)
      {
            if(head.val!=prev.val)
            {
                return false;
            }

            prev=prev.next;
            head=head.next;
      }


    return true;



    }

    public ListNode reverseList(ListNode head) 
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;


        while(curr!=null)
        {


            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }

        return prev;
        
    }
}