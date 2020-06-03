package stackandquee;
import java.util.*;
import java.io.*;
public class Stack<T> {
	
    Node<T>  head;
	int size;
	public Stack() {
          head=null;
		size=0;
	}
	
	public int size() {
       
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
	
	public void push(T ele) {
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
	
	public boolean isEmpty() {
          return (head==null);
        
	}
	
	public T pop() throws StackEmptyException {
        if(head==null)
        {
            StackEmptyException e = new StackEmptyException();
    	    throw e;
        }
        else{
            T value=head.data;
		    head=head.next;
		    return value; 
        }
             
	}
	
	public T top() throws StackEmptyException {
       	if(head==null)
		{
//			Integer<T> a = new Integer<>("-1");
//			T a=-1;
//			T a = new T("-1");
//			T a = -1;
			//  T obj; 
			//     top() {  obj = -1;  }
			// return obj;
            StackEmptyException e = new StackEmptyException();
    	    throw e;
            
			
		}
		else
		{
			T value=head.data;
			return value;
		}
	}
}
//class StackEmptyException extends Exception {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	
//}
