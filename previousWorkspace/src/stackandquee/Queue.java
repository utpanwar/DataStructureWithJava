package stackandquee;
import java.util.*;
import java.io.*;
public class Queue<T> {
    
   private  Node<T> front;
   private Node<T> rear;
    int size;
	public Queue() {
      front =null;
      rear=null;
      size=0;
        
	}

	public void enqueue(T data) {
     Node<T> node=new Node(data);
        if(size()==0)
        {
            front=node;
            rear=node;
            size++;
        }
        else
        {
          rear.next=node;
          rear=node;
          size++;
        }
        
	}

	public int size() {
      return size;
	}

	public boolean isEmpty() {
        return size==0;
	}

	public T dequeue() throws QueueEmptyException {
    if(size()==0)
         {
            // throw new QueueEmptyException();
             QueueEmptyException e = new QueueEmptyException();
    	    throw e;
         } 
        T temp=front.data;
        front=front.next;
        size--;
        return temp;
	}

	public T front() throws QueueEmptyException {
         if(size()==0)
         {
            // throw new QueueEmptyException();
             QueueEmptyException e = new QueueEmptyException();
    	    throw e;
         }   
        T temp=front.data;
        return temp;
	}
}

