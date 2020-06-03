package priority_queue;
import java.util.*;

import javax.swing.text.AsyncBoxView.ChildLocator;
public class Priority_queue {
  private ArrayList<Integer> heap;
  public Priority_queue()
  {
	  heap =new ArrayList<Integer>();
  }
  
  public boolean isEmpty()
  {
	  return heap.size()==0;
  }
  public int size()
  {
	 return heap.size(); 
  }
  public int getMin() throws PriorityQueueException
  {
	  if(heap.isEmpty())
	  {
		  throw new PriorityQueueException();
	  }
	  return heap.get(0);
  }
  public void insert(int element)
  {
		  heap.add(element);
		  int childIndex=heap.size()-1;
		  int parentIndex= (childIndex-1)/2;
		  while(childIndex>0)
		  {
			  if(heap.get(childIndex)<heap.get(parentIndex))
			  {
				  int temp = heap.get(childIndex);
				  heap.set(childIndex, heap.get(parentIndex));
				  
					  heap.set(parentIndex, temp);
					  childIndex=parentIndex;
					  parentIndex=(childIndex-1)/2;
				  
			  }
			  else return;
		  }
}

  public int  removeMin() throws PriorityQueueException
  {
	  if(isEmpty())
	  {	
		  throw new PriorityQueueException();
	  }
	  int temp = heap.get(0);
	  heap.set(0, heap.get(heap.size()-1));
	  heap.remove(heap.size()-1);
	  int index=0;
	  int minIndex=index;
	  int leftchildIndex = 1;
	  int rightchildIndex = 2;
	  while(leftchildIndex < heap.size())
	  {
		  if(heap.get(leftchildIndex) < heap.get(minIndex))
		  {  minIndex=leftchildIndex; }
		  
		  if( rightchildIndex < heap.size() && heap.get(rightchildIndex) < heap.get(minIndex))
		  {	  minIndex=rightchildIndex;	}
		if(minIndex==index)
		{	break;}
		else	
		{
			int temp1=heap.get(index);
			heap.set(index,heap.get(minIndex));
			heap.set(minIndex, temp1);
			index=minIndex;
			leftchildIndex= 2 * index + 1;
			rightchildIndex= 2 * index + 2;
		}
	  }
	  return temp;
  }
  
  public static void inPlaceinsert(int arr[],int i)
  {
	  int childIndex=i;
	  int parentIndex = (childIndex - 1)/ 2;
	while(childIndex > 0) {  
	    if(arr[parentIndex] > arr[childIndex])
	    {
	    	int tmp = arr[parentIndex];
	    	arr[parentIndex] = arr[childIndex];
	    	arr[childIndex] = tmp;
	    	  childIndex=parentIndex;
	  	    parentIndex = (childIndex-1)/2;
	    }
	    else
			return;
	  
	}  
	
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
