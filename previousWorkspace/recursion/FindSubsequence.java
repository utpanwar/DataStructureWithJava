package recursion;

public class FindSubsequence {
    public  static String [] findSubseq(String str)
    {
    	if(str.length()==0)
    	{
    		String ans[]= {""};
    		return ans;
    	}
    	String smallAns[]=findSubseq(str.substring(1));
    	//int count=smallAns.length;
    	String ans[]=new String[2*smallAns.length];
    	
    	for(int i=0;i<smallAns.length;i++)
    	{
    		ans[i]=smallAns[i];
    	}
    	for(int i=0;i<smallAns.length;i++)
    	{
    		ans[i+smallAns.length]=smallAns[i]+str.charAt(0);
    	}
    	return ans;
    }
    public static void main(String [] args)
    {
    	String str="xyz";
    	String ans[]=findSubseq(str);
    	for(int i=0;i<ans.length;i++)
    	{
    		System.out.println(ans[i]);
    	}
    }
}
