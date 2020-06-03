package stackandquee;
import java.util.*;
public class StackUsingLL {

	 public static void main(String args[]) 
	 {

    	 StackLL<Integer> stack= new StackLL<>();
    	 for(int i=0;i<=5;i++)
    	 {
    		 stack.push(i);
    	 }
    	 while(!stack.isEmpty())
    	 {
    		 System.out.println(stack.pop());
    		 
    	 }
	 }
}
			
	 

class StackLL<T>
{
	Node<T>  head;
	int size;
	
	public StackLL() {
		head=null;
		size=0;
	}
	
	int size()
	{
		if(head==null)
		{
			return 0;
		}
		else
		{   int count=0;
			Node<T> t=head;
			while(t.next!=null)
			{   count++;
				t=t.next;
			}
//			t=head;
			return ++count;
		}
	}
	
	T top()
	{
		if(head==null)
		{
//			Integer<T> a = new Integer<>("-1");
//			T a=-1;
//			T a = new T("-1");
//			T a = -1;
			 T obj; 
			    top() {  obj = -1;  }
			return obj;
			
		}
		else
		{
			T value=head.data;
			return value;
		}
	}
	
	boolean isEmpty()
	{
		return (top()==-1);
	}
	
	void push(T ele)
	{   
	   // Node t=head;
		if(size()==0)
		{
		 	head=new Node<>(ele);
		}
    
//		if(t.next==null)
//		if(head.next==null)
//		{
//			//head=new Node(ele);
//			head.data=ele;
//		}
		else
		{   
			Node<T> t1=head;
			Node<T> t=new Node<>(ele);
			//StackLL newnode=new StackLL();
//			newnode.head.data=ele;
//			newnode.head.next=head;
//			head=newnode.head;
//			while(t1.next!=null)
//			{
//				t1=t1.next;
//				
//			}
//			t1.next=t;
			t.next=t1;
			head=t;
			
		}
	}
	
	T pop()
	{
		T value=head.data;
		head=head.next;
		return value;
	}
}
	
