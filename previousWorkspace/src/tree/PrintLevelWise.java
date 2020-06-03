package tree;

import java.util.ArrayList;
import java.util.Scanner;


//print the data level wise and taking input as a level wise
//I/n= 10 3 10 20 30 2 40 50 0 0 0 0
//output is 10 /n 10 20 30 /n 40 50
// 10 is root node 3 is number of childens in the sama order as follows

 class QueueEmptyException extends Exception {
	 
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

   class TreeNode1<T> {
		T data;
		ArrayList<TreeNode1<T>> children;
	

		TreeNode1(T data){
			this.data = data;
			children = new ArrayList<TreeNode1<T>>();
		}
	}
 
public class PrintLevelWise {

	

	static Scanner s = new Scanner(System.in);

	public static TreeNode1<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode1<Integer>> pendingNodes = new QueueUsingLL<TreeNode1<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode1<Integer> root = new TreeNode1<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode1<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode1<Integer> childNode = new TreeNode1<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}


	public static void main(String[] args) {
		TreeNode1<Integer> root =  takeInputLevelWise();
		Solution.printLevel(root); 
//		System.out.println(Solution.height(root));
//		Solution.printatdepthk(root,2);
//		System.out.println(Solution.countLeafNodes(root));
//		Solution.preorderTraversal(root);
//		Solution.postorderTraversal(root);
//		int n=18;
//		TreeNode1<Integer> ans = Solution.findNextLargerNode(root, n);
//		if(ans == null){
//			System.out.println(Integer.MIN_VALUE);
//		}else{
//			System.out.println(ans.data);
//		}
	}

}

class Solution {
	 public static void printLevel(TreeNode1<Integer> root) {
		 if(root==null)
		 {
			 return;
		 }
		 QueueUsingLL<TreeNode1<Integer>> q = new QueueUsingLL<TreeNode1<Integer>>();
		 TreeNode1<Integer> nullNode =new TreeNode1<Integer>(Integer.MIN_VALUE);
		 q.enqueue(root);
		 q.enqueue(nullNode);
		 System.out.println(root.data);
		 while(q.size()!=1)
		 {
			 TreeNode1<Integer> temp = null;
		       try {
		    	   temp=q.dequeue();
		       }
		       catch(QueueEmptyException e)  {
	           }
		       if(temp==nullNode)
		       {
			     q.enqueue(nullNode);
			     System.out.println();
			     continue;
		        }
		 for(int i=0; i<temp.children.size();++i)
		 {
			 System.out.print(temp.children.get(i).data+" ");
			 q.enqueue(temp.children.get(i));
		 }
		 
	   }
		 
	 }
	  
	    public static int height(TreeNode1<Integer> root){
			
	        if(root==null)
	               return 0;
	        int ans =0;
	        for(TreeNode1<Integer>child : root.children)
	        {
	            int childh=height(child);
	            if(childh>ans)
	                ans=childh;
	        }
	        return ans+1;  
		}
	    
	    public static void printatdepthk(TreeNode1<Integer> root ,int k)
	    {
	    	if(k<0)
	    		return;
	    	if(k==0)
	    		System.out.println(root.data);
	    	for(int i=0;i<root.children.size();i++)
	    	{
	    		printatdepthk(root.children.get(i),k-1);
	    	}
	    }
	    
	    public static int countLeafNodes(TreeNode1<Integer> root){
            int count=0;
			for(int i=0;i<root.children.size();i++)
			{
				count +=countLeafNodes(root.children.get(i));
			
			}
			if(root.children.size()==0)
				return count+1;
			return count;
	    }
       
	    
	    public static void preorderTraversal(TreeNode1<Integer> root)
	    {
	    	if(root==null)
	    		return;
	    	
	    		System.out.println(root.data);
	    
	    	
	    	for(int i=0;i<root.children.size();i++)
	    	{
	    		preorderTraversal(root.children.get(i));
	    	}
	    }
	    
	    public static void postorderTraversal(TreeNode1<Integer> root)
	    {
	    	if(root==null)
	    		return;
	    	for(int i=0;i<root.children.size();i++)
	    	{
	    		postorderTraversal(root.children.get(i));
	    	}
	    	System.out.println(root.data);
	    }
	    
	public static TreeNode1<Integer> findNextLargerNode(TreeNode1<Integer> root, int n){
			
	          TreeNode1<Integer> Lnode=null;
	          {
	        	  if(root.data>n)
	        		  Lnode=root;
	          }
			   for(TreeNode1<Integer> child :root.children)
	           {
				   TreeNode1<Integer> ans=findNextLargerNode(child,n);
	                 if(ans!=null)
	                 {
	                	 if(Lnode==null||Lnode.data>ans.data)
	                		 Lnode=ans;
	                 }	 
	           }   
	              
	        return Lnode;
		}
	
	
	}










