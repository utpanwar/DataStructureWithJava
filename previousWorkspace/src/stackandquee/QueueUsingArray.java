package stackandquee;

public class QueueUsingArray {
     int data[];
     int front;
     int rear;
     int size;
     public QueueUsingArray() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
     
  int size()
  {
	  return size;
  }
  boolean isEmpty()
  {
	  return size==0;
  }
  int front() throws QueueEmptyException
  {
	  if(size()==0)
		  throw new QueueEmptyException();
	  return data[front];
		  
  }
  void enquee(int ele) throws QueueFullException
  {  
	  if(size()==data.length)
	  {
		  throw new QueueFullException();
	  }
	  if(size()==0)
      {
	    front++;
      }
	  
	  rear++;
	  if(rear==data.length)
		  rear=0;
	  data[rear]=ele;
	  size++;	  
  }
  int dequee() throws QueueEmptyException
  {   
	  if(size()==0)
	  {
		  throw new QueueEmptyException();
	  }
	  int temp;
	  temp=data[front];
	  front++;
	  if(front==data.length)
		  front=0;
	  size--;
	  if(size()==0)
	  {
		  front =-1;
		  rear=-1;
	  }
	  return temp;
  }
     
}
