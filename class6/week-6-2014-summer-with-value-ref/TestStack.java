/* This class defines an integer stack that can hold 10 values.
   Encapsulation of the push and pop methods allows us to modify
   the internal storage structure from array to Vector to linked list
   without breaking the application that calls the methods.
   Note: There is also http://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
*/
class Stack
{
	int stck[] = new int[10];
	int tos;
	// Initialize top-of-stack
	Stack()
	{
		tos = -1; // indicates an empty stack
	}
	// Push an item onto the stack
	void push(int item)
	{
		if(tos==9)
		System.out.println("Stack is full.");
		/* Each time we put onto the stack,
		   the stack becomes taller.
		*/
		else
		stck[++tos] = item; // add to the top of stack
	}
	// Pop an item from the stack
	int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
		/* Each time we pull off from the stack,
		   the stack becomes less tall.
		*/
		return stck[tos--];
	}
}

class TestStack
{
	public static void main(String[] args)
	{
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		// push some numbers onto the stack
		for(int i=0; i<12; i++) mystack1.push(i);
		for(int i=10; i<20; i++) mystack2.push(i);
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<11; i++) System.out.println(mystack1.pop());
		System.out.println("Stack in mystack2:");
		for(int i=0; i<12; i++) System.out.println(mystack2.pop());
	}
}