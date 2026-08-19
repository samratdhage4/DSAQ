import java.util.*;
//Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
/**
 * remoDupUnsorted
 */
public class remoDupUnsorted {

    static Node removeDuplicates(Node head) {
    
        if(head==null) return null;
        
        HashSet<Integer> set= new HashSet<>();
        
        Node current = head;
        set.add(current.data);

        while(current.next!=null)
        {
            if(set.contains(current.next.data))
            {
               current.next=current.next.next;
            }
            else
            {
                set.add(current.next.data);
                current = current.next;
            }
            
            
        }
        
        return head;
    }

    public static void main(String[] args) {
        
        
       

        Node n1 = new Node(0);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

       
        Node headNode = removeDuplicates(n1);

        while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
}