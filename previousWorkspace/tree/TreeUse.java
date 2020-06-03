package tree;
import java.util.*;

 public class TreeUse {
	 
	 public static TreeNode<Integer> takeinput(Scanner s)
	 {
		 int n;
		 
		 System.out.println("Enter Next Node Data");
		 n=s.nextInt();
		 TreeNode root= new TreeNode<Integer>(n);
		 System.out.println("Enter Next number of chidern"+ n);
		 int childcount = s.nextInt();
		 for(int i=0; i<childcount;i++)
		 {
			 TreeNode<Integer> child = takeinput(s);
			 root.childern.add(child);
		 }
		 return root;
	 }
	 public static void print(TreeNode<Integer> root)
	 {
		 String s = root.data+" :";
		 for(int i=0;i<root.childern.size();i++)
		 {
			 s=s+root.childern.get(i).data+",";
		 }
		 System.out.println(s);
		 for(int i=0;i<root.childern.size();i++)
		 {
			 print(root.childern.get(i));
		 }
	 }
	public static void main (String [] args)
	{
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
//       root.childern.add(node1);
//        root.childern.add(node2);+6
		
//       System.out.println(root);
		Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeinput(s);
		print(root);
		
	}
	
}
 class TreeNode <T> {
                                         
	    public T  data;
	    public  ArrayList<TreeNode<T>> childern;
	public TreeNode(T data) {
		this.data=data;
		childern = new ArrayList<>(); 
	}

}

 
 

 