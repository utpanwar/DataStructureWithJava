package tries;

public class TrieUse {

	public static void main(String[] args) {
       Tries t = new Tries();
       t.add("this");
       t.add("news");
       System.out.println(t.search("news"));
       t.remove("news");
       System.out.println(t.search("news"));
       
	}

}
