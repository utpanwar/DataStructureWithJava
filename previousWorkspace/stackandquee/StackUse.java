package stackandquee;

public class StackUse {
     public static void main(String args[]) throws StackFullException
     {
    	 StackUsingArray stack= new StackUsingArray();
    	 for(int i=0;i<=5;i++)
    	 {
    		 stack.push(i);
    	 }
    	 while(!stack.isEmpty())
    	 {
    		 try {
				System.out.println(stack.pop());
			} catch (StackemptyException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
    	 }
     }
}

 class StackUsingArray{
	private int data[];  
	private int top;
	
    public StackUsingArray() {
    	data= new int[2];
    	top=-1;
    }
	
    public StackUsingArray(int capacity) {
    	int data[]= new int[capacity];
    	top=-1;
    }
    
    public boolean isEmpty() {
    	return (top ==-1);
    }
    
    public int size() {
    	return top+1;
    }
    
    public int top() throws StackemptyException{
    	if(size()==0)
    	{
    		StackemptyException e = new StackemptyException();
    	    throw e;	
    	}
    	return data[top];
    }
    
    public void push(int elem) throws StackFullException
    {
    	if(size()==data.length)
    	{
//    		StackFullException e= new StackFullException();
//    		throw e;
    		doublecapacity();
    	}
    	top++;
    	data[top]=elem;
    }
    
    private void doublecapacity()
    {
    	int temp[]=data;
    	data=new int[2*temp.length];
    	for(int i=0;i<temp.length;i++)
    	{
    		data[i]=temp[i];
    	}
    }
    
    public int pop() throws StackemptyException
    {
    	if(size()==0)
    	{
    		StackemptyException e =new StackemptyException();
    		throw e;
    	}
        int temp=data[top];
        top--;
        return temp;
    }
 }
    		
