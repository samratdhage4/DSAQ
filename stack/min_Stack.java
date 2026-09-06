import java.util.Stack;

/**
 155. Min Stack
Solved
Medium
Topics
premium lock icon
Companies
Hint
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */


public class min_Stack 
{
    Stack<Integer> stk;
    int min;

    public min_Stack() 
    {
        stk= new Stack<>();
        min=0;
    }
    
    public void push(int value) 
    {
        if(stk.isEmpty())
        {
            stk.push(value);
            min=value;
        }else if(value<min)
        {
            stk.push(2*min-value);
            min=value;    
        }else
        {
            stk.push(value);
        }
        
    }
    
    public void pop() 
    {
        int x=stk.peek();

        if(x<min)
        {
            min=(2*min)-x;
        }

        stk.pop();
        
    }
    
    public int top() 
    {
        int top=stk.peek();
        if(top<min)
        {
           return  min;
        }
        return top;   
    }

    public int getMin() 
    {
        return min;   
    }
    public static void main(String[] args) {
     
        min_Stack s= new min_Stack();

        s.push(2);
        s.push(1);
        System.out.println("MIN-"+s.getMin());
        System.out.println("TOP:-"+s.top());
        s.push(-1);
        System.out.println("MIN-"+s.getMin());
        System.out.println("TOP:-"+s.top());
        s.pop();
        System.out.println("MIN-"+s.getMin());
        System.out.println("TOP:-"+s.top());
        s.pop();
        System.out.println("MIN-"+s.getMin());
        System.out.println("TOP:-"+s.top());
        
    }

    
}