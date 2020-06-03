package priority_queue;

public class PriorityQueueUSe {
   public static void main(String []args) throws PriorityQueueException
   {
	   Priority_queue pq= new Priority_queue();
//	   int array[] = {5,1,2,9,0};
	   int array[] = {6,2,1,5,19,18};
//	   for(int i=0;i<array.length;i++)
//	   {
//		   pq.insert(array[i]);
//	   }
//	   while(!pq.isEmpty())
//	   {
//		 
//			System.out.print(pq.removeMin()+" ");
//	
//		
//	   }
//	   System.out.println();
	
	//for inplace heapSort
	for(int i=0;i<array.length;i++)
	{
		pq.inPlaceinsert(array,i);
		System.out.print(array[i] + " ");
	}
	for(int i=0;i<array.length;i++)
	{
//		pq.inPlaceinsert(array,i);
//		System.out.print(array[i] + " ");
	}
	
   }
}
