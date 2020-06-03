package oops;

public class Student {
	public String name;
	private final int rollNumber;
	
    /*static*/ final static int numstd; //i stuck please to do as static final int numstd; 
    // and then set it through constructor
    static
    {
    	numstd=0;
    }
	
	public Student(String name,int rollNumber) {
	   this.name=name;
	   this.rollNumber=rollNumber;
	  
	}
	public void print()
	{
		System.out.println(name+" "+rollNumber);
	}
	

}
