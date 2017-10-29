import java.util.*;
public class Stack {
	private ArrayList<Integer> stack=null;
	
	public Stack()
	{
		stack=new ArrayList<Integer>();
	}
	
	 public void push(int element)
	 {
	        stack.add(element);
	 }
	 
	 public int pop()
	 {
		 int element=0;
		 if(stack.isEmpty())
		 {
			 System.out.println("Stack is empty");
			 System.exit(0);
		 }
		 if(!stack.isEmpty())
		 {
	     element=stack.remove(stack.size()-1);
		 }
		 return element;
	 }
	 
	 public int top()
	 {
		 int element=0;
		 if(!stack.isEmpty())
		 {
	     element=stack.get(stack.size()-1);
		 }
		 return element;
	 }
	 public int Size()
	 {
		 return stack.size();
	 }
	 
	 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice,element;
		Stack s=new Stack();
		while(true)
		{
			System.out.println("1.Push 2.Pop 3.Top 4.Size 5.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter element to push:");
					element=sc.nextInt();
					s.push(element);
				    break;
				case 2:
					element=s.pop();
					System.out.println("Element popped is "+element);
					break;
				case 3:
					element=s.top();
					System.out.println("Element at top is "+element);
					break;
				case 4:
					System.out.println("Size of stack is "+s.Size());
				case 5:
					System.exit(0);		
			}	
		}
	}
}
