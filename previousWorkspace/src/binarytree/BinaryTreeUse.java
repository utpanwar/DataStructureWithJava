package binarytree;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import binarytree.QueueEmptyException;
import binarytree.QueueUsingLL.Node;
import stackandquee.*;


class QueueEmptyException extends Exception {
	 
}
class pairNode{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
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

public class BinaryTreeUse {
	
	

	
	public static void main(String args[])
	{   Scanner s=new Scanner(System.in);
	    int in[] = {4,2,5,1,3,7};
	    int pre[] = {1,2,4,5,3,7};
//	    BinaryNode<Integer> root=Solution.getTreeFromPreorderAndInorder(in,pre);
//	    BinaryNode<Integer> root=Solution.takeInput(s);
	    BinaryNode<Integer> root=Solution.takeInputLevel(s);
//		LinkedListNode<Integer> ans = Solution.BSTToSortedLL(root);
//		while(ans != null) {
//			System.out.print(ans.data + " ");
//			ans = ans.next;
//		}
//	    System.out.println(Solution.lcaBinaryTree(root,2,3));
//	    Solution.nodesSumToS(root, 1253);
//	    Solution. rootToLeafPathsSumToK(root,13);
//	    System.out.println(Solution.largestBSTSubtree(root));//cn
//	    System.out.print(Solution.largestBstHeight(root)); 
//	    Solution.replaceWithLargerNodesSum(root);
//	    BinaryNode<Integer> target=new BinaryNode<Integer>(12);
//	    Solution.printkdistanceNode(root, target, 5); 
	    Solution.printNodesSumToS(root, 12);
//	    System.out.println(Solution.lcaBinaryTree(root,2,6));
//	    System.out.print(Solution.isBST(root));
//      Solution.mirror(root);
//	    root = Solution.removeAllLeaves(root); 
//	    System.out.println(Solution.isNodePresent(root,7));
//	    System.out.println(Solution.height(root));
//	    System.out.println(Solution.checkHeight(root));
//	    BinaryNode<Integer> root1=Solution.searchInBST(root,12);
//	    Solution.printNodeFromK1ToK2(root,6,10);
//	    System.out.println(root1);
//      Solution.preOrder(root);
//	    System.out.print(Solution.checkBalanced(root));
//	    Solution.printTreeLevel(root);
//	    Solution.printTree(root);
//	    Solution.printLevelWise(root);
//	    Solution.printLevelWiseC(root);
//	    Solution.printZigZag(root);
//	    s.close();
//		BinaryNode<Integer> a=new BinaryNode<Integer>(2);
//		BinaryNode<Integer> b=new BinaryNode<Integer>(4);
//		BinaryNode<Integer> c=new BinaryNode<Integer>(3);
//		a.left=b;
//		b.left=c;
		
	}

}

class Solution
{
	public static  BinaryNode<Integer> takeInput(Scanner s) {
		int data;
		System.out.println("Enter a Node");
		data=s.nextInt();
		if(data==-1)
		 return null;
		BinaryNode<Integer> root=new BinaryNode<Integer>(data);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;
	}
	
	public static void printTree(BinaryNode<Integer> root)
	{  if(root==null)
		  return;
		String tobeprinted=root.data+"";
		if(root.left!=null)
		{
			tobeprinted += "L :"+ root.left.data +",";
		}
		if(root.right!=null)
		{
			tobeprinted += "R :"+ root.right.data;
		}
		System.out.println(tobeprinted);
		printTree(root.left);
		printTree(root.right);
		
	}
	
	public static BinaryNode<Integer> takeInputLevel(Scanner s)
	{
       QueueUsingLL<BinaryNode<Integer>> pendingNodes = new QueueUsingLL<>();
       System.out.println("enter root data");
       int rootData = s.nextInt();
       if(rootData == -1)
       {
    	   return null;
       }
       BinaryNode<Integer> root = new BinaryNode<Integer>(rootData);
      
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty())
        {
        	BinaryNode<Integer> front;
        	try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return null;
			}
        	System.out.println("Enter left child of" + front.data);
        	int leftChild = s.nextInt();
            if(leftChild!=-1)
            {
            	BinaryNode<Integer> child = new BinaryNode<Integer>(leftChild);
            	pendingNodes.enqueue(child);
            	front.left =child;
            }
            
            System.out.println("Enter left right of" + front.data);
        	int rightChild = s.nextInt();
            if(rightChild!=-1)
            {
            	BinaryNode<Integer> child = new BinaryNode<Integer>(rightChild);
            	pendingNodes.enqueue(child);
            	front.right =child;
            }
        }
        return root;
	}
	public static boolean isNodePresent(BinaryNode<Integer> root,int x){
  //8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
//		7
//		
//        if (null == root) // this comment code code is works but 2nd is best
//            return false;
//        if(x==root.data)
//        {
//        	 try {
//        		 int t = 1/0;
//        	    } catch (Exception e) {
////        	        System.out.println("true");
//        	    	return true;
//        	    } 
//        }
//        isNodePresent(root.left,x);
//        isNodePresent(root.right,x);
//        return false;
		if(null == root)
		{
			return false;
		}
		boolean found = root.data.equals(x);
		if(found)
			return true;
		found = found || isNodePresent(root.left, x);
		if(found)
			return true;
		found = found || isNodePresent(root.right, x);
		return found;
	}
	public static int height(BinaryNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int count2=1,count = 0,count1=0;
        if(root == null)
        {
            return count2;
        }
        count = height(root.left);
        count1=height(root.right);
        if(count1>count)
        { 
            count=count1;
            return count+1;
        }   
        count1=count;
        return count1+1;
	}
	public static void mirror(BinaryNode<Integer> root){
		if(null==root)
            return ;
        
       mirror(root.left);
       mirror(root.right);
       if(root.left!=null || root.right!=null)
       {	   
//        Integer temp = root.left.data;   for interchanging only data
//        root.left.data = root.right.data; 
//        root.right.data = temp; 
    	  BinaryNode<Integer> temp = root.left;
   	  root.left = root.right;
    	  root.right = temp; 
       }
        return ;
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	}
	public static void preOrder(BinaryNode<Integer> root) {
		if(null==root)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        return;
		//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1

	}
	public static BinaryNode<Integer> getTreeFromPreorderAndInorder(int[] in,
			int[] pre){
           return getTreeFromPreorderAndInorder(pre,in,0,in.length-1,0,pre.length-1);
	}
	public static BinaryNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in,int inS,int inE,int preS,int preE){
		if(inS>inE)
			return null;
		int rootData = pre[preS];
		int rootIndex = -1;
		for(int i =inS; i<=inE;i++)
		{  
			if(rootData==in[i])
			{	
				rootIndex=i;
				break;
			}		
		}
		
		BinaryNode<Integer> root = new BinaryNode<Integer>(rootData);
		int leftinS = inS;
		int leftinE = rootIndex-1;
		int leftpreS = preS+1;
		int leftpreE = leftpreS+leftinE-leftinS;
		int rightinS = rootIndex+1;
		int rightinE = inE;
		int rightpreS = leftpreE+1;
		int rightpreE = preE;
		root.left = getTreeFromPreorderAndInorder(in,pre,leftinS,leftinE,leftpreS,leftpreE);
		root.right = getTreeFromPreorderAndInorder(in,pre,rightinS,rightinE,rightpreS,rightpreE);
        return root;           
		
	}	
	public static BinaryNode<Integer> removeAllLeaves(BinaryNode<Integer> root){
		
		if(root.left==null&&root.right==null)
        { 
            root = null;
            return root;
        }
		removeAllLeaves(root.left);
	    removeAllLeaves(root.right);
        return root;
	}

	 public static void printLevelWise(BinaryNode<Integer> root){
     QueueUsingLL<BinaryNode<Integer>>  q = new QueueUsingLL<BinaryNode<Integer>>();
        BinaryNode<Integer> nullNode = new BinaryNode<Integer>(Integer.MIN_VALUE);
        q.enqueue(root);
        q.enqueue(nullNode);
       BinaryNode<Integer> count= new BinaryNode<Integer>(Integer.MIN_VALUE);
        while(!q.isEmpty())
        {
            BinaryNode<Integer>  root1=null;
           try{
              root1= q.dequeue();
              if(root1!=nullNode)
              System.out.println(root1.data);
              else
              System.out.println();
//              count=root1;
           } 
           catch(QueueEmptyException e)
           {
               System.out.println("Not possible");
           }
           
                // System.out.print(root1.data+" ");
            if(root1.left!=null)
            {
                 q.enqueue(root1.left);
            }
            if(root1.right!=null)
            {
                 q.enqueue(root1.right);
            }
            BinaryNode<Integer> count1= new BinaryNode<Integer>(Integer.MIN_VALUE);
            try{
                count1 = q.front();
                if(count1==nullNode)
                {
               	 root1=q.dequeue();
                    q.enqueue(nullNode);
                    count1=q.front();
//                    continue;
                }
                else {
                	q.enqueue(root1);
                }
            }
            catch(QueueEmptyException e)
            {
                
            }
            
            for(int i= 0; count.data.intValue()!=count1.data.intValue();i++)
             {
//           	 if(count.data==count1.data)
//                {
//           	   System.out.print("hi");
//              	   break;
//                }
                try{
               	     root1=q.dequeue();
                     System.out.print(root1.data+" ");
                     if(root1.left!=null)
                     q.enqueue(root1.left);
                     if(root1.right!=null)
                     q.enqueue(root1.right);
                     count1=q.front();
                    
                   }
                     catch(QueueEmptyException e){
              
                                  }
             }
        }
       
 
   }
	 
	public static void printLevelWiseC(BinaryNode<Integer> root){
		
	        QueueUsingLL<BinaryNode<Integer>>  primary = new QueueUsingLL<BinaryNode<Integer>>();
	        QueueUsingLL<BinaryNode<Integer>>  secondry = new QueueUsingLL<BinaryNode<Integer>>();
	        primary.enqueue(root);
	        while(!primary.isEmpty())
	        {
	            BinaryNode<Integer> current = null;
	            try{
	                current = primary.dequeue();
	            }
	            catch(QueueEmptyException e){
	                
	            }
	            System.out.print(current.data+" ");
	            if(current.left!=null)
	            {
	                secondry.enqueue(current.left);
	            }
	            if(current.right!=null)
	            {
	                secondry.enqueue(current.right);
	            }
	            if(primary.isEmpty())
	            {
	                QueueUsingLL<BinaryNode<Integer>>  temp = secondry;
	                secondry = primary;
	                primary = temp;
	                System.out.println();
	            }
	        }
	}
	public static void printZigZag(BinaryNode<Integer> root) {
		QueueUsingLL<BinaryNode<Integer>> q = new QueueUsingLL<>();
		Stack<BinaryNode<Integer>> s = new Stack<>();
		s.push(root);
		int count=3;
		while(!s.isEmpty())
		{
			  BinaryNode<Integer> stack = null;
	            try{
	                stack = s.pop();
	            }
	            catch(StackEmptyException e){
	                
	            }
	            
	            	System.out.print(stack.data+" ");
		            
		            if(count%2==0)
		            {
		            	   if(stack.right!=null)
		            	   {
		            		   q.enqueue(stack.right);
		            	   }	
		            	   if(stack.left!=null)
		            	   {
		   	                q.enqueue(stack.left);
		            	   }
		            }
		            else
		            {
		            	 if(stack.left!=null)
		            	   {
		   	                q.enqueue(stack.left);
		            	   }
		            	 
		            	 if(stack.right!=null)
		            	   {
		            		   q.enqueue(stack.right);
		            	   }	
		            }
	            
	            
	         if(s.isEmpty())
	         {
	        	 while(!q.isEmpty())
		            {  
		            	try {
		            		BinaryNode<Integer>  temp = q.dequeue();
		 	                s.push(temp); 
		            	}
		            	catch(QueueEmptyException e)
		            	{
		            		
		            	}
		               
		            }
		            System.out.println();
		            count++;
	         }
	           
		}
	}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1	
	public static boolean checkBalanced(BinaryNode<Integer> root){
		if(root==null)
			return true;
 	  int h1=checkHeight(root.left);
 	  int h2=checkHeight(root.right);
 	  int hei=(h1-h2);
 	  int heig=(h2-h1);
 	    if(hei>1||heig>1)
 	    {
 	    	return false;
 	    }
 	    boolean bal=checkBalanced(root.left);
 	    if(bal==false)
 	    	return false;
 	    boolean bale=checkBalanced(root.right);
 	   //1 2 3 4 -1 5 -1 6 -1 7 -1 -1 -1 -1 -1 
	  return true;
	}
	public static int checkHeight(BinaryNode<Integer> root){
		if(root==null)
			return 0;
		int count=1,count1=1;
		 count = count+checkHeight(root.left);
		 count1 =count1+checkHeight(root.right);
		 if(count>count1)
			 return count;
		 return count1;
		 
	}
	public static BinaryNode<Integer> searchInBST(BinaryNode<Integer> root , int k){
	    if(root==null)
		           return null;
		       int value = root.data.intValue();
		       if(value==k)
		       {
		    	  System.out.print(k);
		    	  return root;
		    	  
		       }
		       if(root.data>k)
		       {
		           root=searchInBST(root.left,k);
		       }
		        else
		        {//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 2
		        
		           root= searchInBST(root.right,k);
		        }
	         return root;
			}
	public static void printNodeFromK1ToK2(BinaryNode<Integer> root,int k1,int k2){
	     if(root==null)
            return;
	     int count = root.data.intValue();
//	     int lef = root.left.data.intValue();
	     if(root.left!=null);
	     { 
//	    	 System.out.print("hi");
//			int lef1 = root.left.data.intValue();
	     }
	    
	     if(root.right!=null)
	     {
//	    	 int rig= root.right.data.intValue();
	     }
	     
       if(root.data.intValue()>k1 && root.data.intValue()>k2)

    	   System.out.print(root.data);
       if(root.data>=k1)
       {
           printNodeFromK1ToK2(root.left,k1,k2);
       }
         else
             printNodeFromK1ToK2(root.right,k1,k2);
       return; 
       //8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//       6 10
	}
	public static boolean isBST(BinaryNode<Integer> root) {
		  if(root==null)
	          return true;
		  int count = root.data.intValue();
		  int count1 = Integer.MIN_VALUE, count2= Integer.MAX_VALUE;
		  if(root.left!=null)
		  {
			  count1 = root.left.data.intValue();
		  }
		  if(root.right!=null)
		  {
			  count2 = root.right.data.intValue();
		  }
        if(count1>root.data || root.data>count2)
	        {
	            return false;
	        }
	        boolean a=isBST(root.left);
	        if(a==false)
	        	return false;
	       boolean b= isBST(root.right);
	        return true;
//	        5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
	        // 4 2 7 1 5 6 8 -1 -1 -1 -1 -1 -1 -1 -1
	        //1080 384 2970 71 1090 2037 3393 -1 -1 -1 1027 -1 2618 -1 3930 -1 -1 -1 -1 -1 -1
	//this sol is fail on upper tc so we make range 
	        // wala solution
	}
	@SuppressWarnings({ "unchecked", "unused" })
	public static LinkedListNode<Integer> BSTToSortedLL(BinaryNode<Integer> root){
		if(root==null)
		{
			return null;
		}
			
//		LinkedListNode<Integer> head= new LinkedListNode(null);
		LinkedListNode<Integer> root1=null;
		root1=BSTToSortedLL(root.left);
		LinkedListNode<Integer> root2=new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> tail=root2;
		if(root1!=null)
		{   while(root1!=null)
			{
			 root2.data=root1.data;
			 tail=root2.next;
			 root1=root1.next;
			}
		LinkedListNode<Integer> q=new LinkedListNode<Integer>(0);
		q.data=root.data;
			root2.next=q;
		}
		else
		root2.data=root.data;
//		while(root1!=null)
//		{
//			root1=root1.next;
//		}
//	     if(root1!=null)
//	     {
//	    	 root1.data=root2.data;
//	     }
		@SuppressWarnings("rawtypes")
//		LinkedListNode q = new LinkedListNode(0);
//		q.data=root.data;
//		root1.next=q;
		LinkedListNode<Integer> root3=null;
		root3=BSTToSortedLL(root.right);
		tail=root2;
		if(root2.data!=0)
		{
			while(tail.next!=null)
			{
				tail=tail.next;
			}
			tail.data=root3.data;
		}
       return root2;
 //10 5 15 2 6 12 16 -1 -1 -1 -1 -1 -1 -1 -1      
}
	public static int lcaBinaryTree(BinaryNode <Integer> root , int a, int b){
		 ArrayList<Integer> path1=new ArrayList<>();
        ArrayList<Integer> path2=new ArrayList<>();
       // if(!findpath(root,a,path1) || !findpath(roo))
       boolean count1=findpath(root,a,path1);
       System.out.println(count1);
       boolean count2=findpath(root,b,path2);
       System.out.println(count2);
           if(count1==false && count2==false)
           {
               return -1;
           }
       if(!count1 || !count2)
       {
           if(count1==false)
           {
               return b;
           }
           else
               return a;
       }
       int i;
       for( i=0;i<path1.size() && i<path2.size();i++)
       {
           if(!path1.get(i).equals(path2.get(i)))
             break;
       }
       return path1.get(i-1);
	}
  private static boolean findpath(BinaryNode <Integer> root,int n,ArrayList<Integer> path )
  {
//      if(root==null){
//          
//          return false;
//      }
//          
//      path.add(root.data);
//      if(root.data==a)
//      {
//          return true;
//      }
//      boolean root1 = false;
//      if(root.left!=null)
//      {
//           root1=findpath(root.left,a,path);
//      }
//      
//      if(root.right!=null&&root1==false)
//      {
//          boolean root2=  findpath(root.right,a,path);
//      }
//      path.remove(path.size() -1);
//      return false;
	  // base case 
      if (root == null) { 
          return false; 
      } 
        
      // Store this node . The node will be removed if 
      // not in path from root to n. 
      path.add(root.data); 

      if (root.data == n) { 
          return true; 
      } 

      if (root.left!=null && findpath(root.left, n, path)) { 
          return true; 
      } 

      if (root.right != null && findpath(root.right, n, path)) { 
          return true; 
      } 

      // If not present in subtree rooted with root, remove root from 
      // path[] and return false 
      path.remove(path.size()-1); 

      return false; 
  }   
	//5 10 6 2 -1 -1 -1 -1 -1
	
	
	
	
	
	public static int lcaBinaryTree(BinaryNode <Integer> root , int a, int b){
     BinaryNode<Integer> node = lcaBinaryTreeH(root,a, b); 
     if(node!=null)
    	 return node.data;
     return -1;
	}//cn
	public static BinaryNode<Integer> lcaBinaryTreeH(BinaryNode <Integer> root , int a, int b)
	{
		if(root==null)
			return null;
		if(root.data == a || root.data == b) {
			return root;
		}
		BinaryNode<Integer> left_l=lcaBinaryTreeH(root.left, a, b);
		BinaryNode<Integer> left_r=lcaBinaryTreeH(root.right, a, b);
		if(left_l!=null && left_r!=null) {
			return root;
		}
		if(left_l!=null)
			return left_l;
		return left_r;
	}
	//5 10 6 2 3 -1 -1 -1 -1 -1 -1
	
	
	
	
	
	
	  static ArrayList<Integer> arr=new ArrayList<Integer>();
	   
		public static void nodesSumToSH(BinaryNode<Integer> root) {
	        if(root==null)
	            return;
	        arr.add(root.data);
	        nodesSumToSH(root.left);
	        nodesSumToSH(root.right);
	        return;
	    }
		public static void nodesSumToS(BinaryNode<Integer> root, int sum) {
	         
	         nodesSumToSH(root);
	          Collections.sort(arr);   
	          int j=arr.size()-1,i=0;
	          while(i<j)
	          {
	        	  if(arr.get(i)+arr.get(j)==sum)
	        	  {
	        		  System.out.println(arr.get(i)+" "+arr.get(j));
	        		  i++;j--;
	        	  }
	        	  else if((arr.get(i)+arr.get(j))>sum)
	        	  {
	        		  j--;
	        	  }
	        	  else
	        	  {
	        		  i++;
	        	  }
	        
	          }
	      
//647 269 852 176 305 835 938 -1 -1 -1 606 -1 845 -1 1159 -1 -1 -1 -1 -1 -1 cn
		}	
		
		
		
		
		
		
		
		public static void rootToLeafPathsSumToKH(BinaryNode<Integer> root, int k,int count) {
			
			if(root==null)
				return;
			count=count+root.data;
			arr.add(root.data);
			if((root.left==null&&count==k) || (root.right==null&&count==k))
					{
				for(int i=0;i<arr.size();i++)
				{
				    System.out.print(arr.get(i)+" ");
//                    arr.remove(i);
				}
				System.out.println();
//				int i=arr.get(0);
//				arr.clear();
//                arr.add(i);				
					}
			rootToLeafPathsSumToKH(root.left,k,count);
//			arr.remove(arr.size()-1);
			rootToLeafPathsSumToKH(root.right,k,count);
			if(arr.size()>1)
			arr.remove(arr.size()-1);
			return;
		}
		public static void rootToLeafPathsSumToK(BinaryNode<Integer> root, int k) {
//          final ArrayList<Integer> arr2=new ArrayList<Integer>();
			rootToLeafPathsSumToKH(root,k,0);
			return;
//			5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
//			5 6 7 1 2 -1 1 1 -1 -1 -1 -1 -1 -1 -1
		}
		
		
		
 public static Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer> largestBSTSubtreeH(BinaryNode<Integer> root) {
   	if(root==null)
   	{
   		Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer> 
   		output=new Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer>();
   		output.first=new Pair<Boolean, Integer,Integer>();
   		output.second=new Pair<Integer, Integer,Integer>();
   		output.first.first=true;
   		output.first.second=0;
   		output.hei=0;
   		output.second.first=Integer.MAX_VALUE;
   		output.second.second=Integer.MIN_VALUE;
        return output;      		
   	}
   	Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer> leftOut=largestBSTSubtreeH(root.left);
   	Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer> rightOut=largestBSTSubtreeH(root.right);
   	int min=Math.min(root.data,Math.min(leftOut.second.first,rightOut.second.first));
   	int max=Math.max(root.data,Math.max(leftOut.second.second,rightOut.second.second));
   	int h1=1,h2=1;
   	 h1=h1+leftOut.first.second;
   	 h2=h2+rightOut.first.second;
   	boolean isBst= (root.data>leftOut.second.second)
   			    && (root.data<=rightOut.second.first)
   	            && leftOut.first.first && rightOut.first.first;
   	if(isBst)
   	{
   		leftOut.hei=h1;
   	    rightOut.hei=h2;		
   	}
  
   	Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer>
		output=new Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer>();
		output.first=new Pair<Boolean, Integer,Integer>();
		output.second=new Pair<Integer, Integer,Integer>();
		output.first.first=isBst;
		if(h1>h2)
		{
			output.first.second=h1;
		}
		else output.first.second=h2;
//		if(isBst)
//		  {
			  int hei=0;
			  if(leftOut.hei>rightOut.hei)
				  hei=leftOut.hei;
			  else hei=rightOut.hei;
			  output.hei=hei;
//		  }
		output.second.first=min;
		output.second.second=max;
    return output;                 
   	            
 }	
		
 public static int largestBSTSubtree(BinaryNode<Integer> root) {
	 Pair<Pair<Boolean, Integer,Integer>, Pair<Integer, Integer,Integer>,Integer> 
	 output=largestBSTSubtreeH(root);
	 return output.hei;
//	 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
	 //5 10 6 -1 -1 -1 -1
	}
 
 //cn solution
 private static Pair1 largestbstH(BinaryNode<Integer> root)
 {
	 if(root==null)
	 {
		 Pair1 ans= new Pair1();
		 ans.max=Integer.MIN_VALUE;
		 ans.min=Integer.MAX_VALUE;
		 ans.height=0;
		 ans.isBst=true;
		 return ans;
	 }
	 Pair1 left = largestbstH(root.left);
	 Pair1 right = largestbstH(root.right);
	 if(!(right.isBst && right.min>root.data))
	 {
		 right.isBst=false;
	 }
	 if(!(left.isBst && left.max < root.data))
	 {
		 left.isBst=false;
	 }
	 Pair1 ans=new Pair1();
	 if(!left.isBst || !right.isBst || root.data <left.max || root.data >right.min)
	 {
		if(left.height > right.height){
			left.isBst =false;
			return left;
		}
		else

		{
			right.isBst=false;
			return right;
		}
	 }
			 ans.isBst=true;
			 ans.min=Math.min(left.min,Math.min(right.min,root.data));
			 ans.max=Math.max(left.max,Math.max(right.max,root.data));
			 ans.height = Math.max(left.height , right.height) +1 ;
			 return ans;
 }
 public static int largestBstHeight(BinaryNode<Integer> root)
 {//5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
	 return largestbstH(root).height;
 }

 
 
 
 
 public static void replaceWithLargerNodesSum(BinaryNode<Integer> root) {
	 int sum=0;
     replaceWithLargerNodesSum(root,sum);
	}
 private static int replaceWithLargerNodesSum(BinaryNode<Integer> root,int sum)
   { 
	  if(root==null)
      return sum;
	  sum = replaceWithLargerNodesSum(root.right,sum);
	  sum=sum+root.data;//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
	  root.data=sum;
	  sum = replaceWithLargerNodesSum(root.left,sum);
	  return sum;
   }
 
 // Print nodes at distance k from node 
// class BinaryTree  
// { 
//     Node root; 
//     /* Recursive function to print all the nodes at distance k in 
//        tree (or subtree) rooted with given root. */
//    
   static void printkdistanceNodeDown(BinaryNode<Integer> node, int k)  
     { 
         // Base Case 
         if (node == null || k < 0) 
             return; 
    
         // If we reach a k distant node, print it 
         if (k == 0)  
         { 
             System.out.print(node.data); 
             System.out.println(""); 
             return; 
         } 
    
         // Recur for left and right subtrees 
         printkdistanceNodeDown(node.left, k - 1); 
         printkdistanceNodeDown(node.right, k - 1); 
     } 
    
     // Prints all nodes at distance k from a given target node. 
     // The k distant nodes may be upward or downward.This function 
     // Returns distance of root from target node, it returns -1 
     // if target node is not present in tree rooted with root. 
   static int printkdistanceNode(BinaryNode<Integer>  node,BinaryNode<Integer>  target, int k)  
     { 
         // Base Case 1: If tree is empty, return -1 
         if (node == null) 
             return -1; 
    
         // If target is same as root.  Use the downward function 
         // to print all nodes at distance k in subtree rooted with 
         // target or root 
         if (node.data == target.data)  
         { 
        	 BinaryNode<Integer> m=new BinaryNode<Integer>(node.data);
        	 int n=node.data;
             printkdistanceNodeDown(node, k); 
             return 0; 
         } 
    
         // Recur for left subtree 
         int dl = printkdistanceNode(node.left, target, k); 
    
         // Check if target node was found in left subtree 
         if (dl != -1)  
         { 
                
             // If root is at distance k from target, print root 
             // Note that dl is Distance of root's left child from  
             // target 
             if (dl + 1 == k)  
             { 
                 System.out.print(node.data); 
                 System.out.println(""); 
             } 
                
             // Else go to right subtree and print all k-dl-2 distant nodes 
             // Note that the right child is 2 edges away from left child 
             else
                 printkdistanceNodeDown(node.right, k - dl - 2); 
    
             // Add 1 to the distance and return value for parent calls 
             return 1 + dl; 
         } 
    
         // MIRROR OF ABOVE CODE FOR RIGHT SUBTREE 
         // Note that we reach here only when node was not found in left  
         // subtree 
         int dr = printkdistanceNode(node.right, target, k); 
         if (dr != -1)  
         { 
             if (dr + 1 == k)  
             { 
                 System.out.print(node.data); 
                 System.out.println(""); 
             }  
             else 
                 printkdistanceNodeDown(node.left, k - dr - 2); 
             return 1 + dr; 
         } //20 8 22 4 12 -1 -1 -1 -1 10 14 -1 -1 -1 -1 
    //20 8 22 4 12 -1 23 -1 -1 10 14 -1 24 -1 -1 -1 -1 -1 25 -1 26 -1 -1
         // If target was neither present in left nor in right subtree 
         return -1; 
     } 
 
	public static void printNodesSumToSH(BinaryNode<Integer> root, int s) {
		if(null==root)
		{
			return;
		}
		printNodesSumToSH(root.left,s);
		if(root.data.intValue()<s)
		{
		
			arr.add(root.data);
		}
		else
			return;
		printNodesSumToSH(root.right,s);
//		if(root.data.intValue()<s)
//		{
//		
//			arr.add(root.data);
//		}
      return;
	}
public static void printNodesSumToS(BinaryNode<Integer> root, int s)
 { // i have deffined the static arraylist with name arr;
//  final ArrayList<Integer> arr1=new ArrayList<Integer>();
  printNodesSumToSH(root,s);
  int j=arr.size()-1,i=0;
 while(i<j)
  {
	  if(arr.get(i)+arr.get(j)==s)
	  {
		  System.out.println(arr.get(i)+" "+arr.get(j));
		  i++;j--;
	  }
	  else if(arr.get(i)+arr.get(j)>s)
	  {
		  j--;
	  }
	  else i++;
  }
 }
}
//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1

