package tries;


class TrieNode
{
	char data;
	boolean isTerminating;
	TrieNode childeren[];
	public TrieNode(char data)
	{
		this.data = data;
		isTerminating = false;
		childeren = new TrieNode[26];
	}
}

public class Tries {
   private TrieNode root;
   Tries()
   {
	   root = new TrieNode('\0');
   }
   public void add(TrieNode root,String word)
   {
	   if(word.length()==0)
	   {
		   root.isTerminating = true;
		   return;
	   }
	   int chr =word.charAt(0) - 'a';
	   TrieNode child = root.childeren[chr];
	   if(child==null)
	   {
		   child = new TrieNode(word.charAt(0));
		   root.childeren[chr]=child;
	   }
	   add(child,word.substring(1));	
   }
   public void add(String word)
   {
	   add(root,word);
   }
   public boolean search(String word)
   {
	   return search(root,word);
   }
   private boolean search(TrieNode root,String word)
   {
	   if(word.length()==0)
	   {
//		   if(root.isTerminating)
//		   {
//			   return true;
//		   }
//	   	   return false;
		   return root.isTerminating;
	   }
	   int chr = word.charAt(0) - 'a';
	   TrieNode child = root.childeren[chr];
	   if(child==null)
	   {
          return false;		   
	   }
//	   if(search(child,word.substring(1)))
//		   return true;
//	   return false;
	   return search(child,word.substring(1));
   }
   public void remove(String word)
   {
	    remove(root,word);
   }
   private void remove(TrieNode root,String word)
   {
	   if(word.length()==0)
	   {
		   root.isTerminating = false;
		   return;
	   }
	   int chr = word.charAt(0) - 'a';
	   TrieNode child = root.childeren[chr];
	   if(child==null)
	   {
		   return;
	   }
//		   5172528055771217
	   remove(child,word.substring(1));
	   if(!child.isTerminating)
	   {
		   int numChild = 0;
		   for(int i= 0; i<26; i++)
		   {
			   if(child.childeren[i]!=null)
			      numChild++;
		   }
		   if(numChild == 0)
		   {
			   root.childeren[chr] = null;
			    child = null;
		   }
	   }
   }
   public int countWords() {
       int count=0;
		for(int i =0;i<26;i++)
       {
            count = count+countWords(root,i);
       }
		
	}
   private int countWords(Runner root,int n)
   {
       int count =0;
       for(int i=0;i<26; i++)
       {
           if(root.children[i]!=null)
                break;
           if(i==25)
               return count;
       }
       
       if(root.children[n]!=null)
       {
           if(root.isTerminating)
           {
               count = count + 1 ;
           }
           Tries child = root.children[n];
           count +=countWords(child,n);
       }
       return count;
   }
		   
}

