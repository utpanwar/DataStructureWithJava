package oops;
import java.util.*;
public class StudentUse {

	public StudentUse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student s1=new Student("aman",25);
		s1.print();
		Student s2=new Student("a",100);
		s2.print();
//		s1.rollNumber=99;
//		System.out.println(s1.rollNumber);
	   //Student.numstd=10;
	   System.out.println(s1.numstd);
	}

}
