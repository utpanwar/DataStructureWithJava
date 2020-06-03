
package pattern;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=1;
    for(int i=1;i<=n;i++){
        k=i;
        for(int j=1;j<=n;j++){
              if(j<=i) {
                  System.out.print(k);
                  k++;}
              else
                  System.out.print(" ");
        }
        System.out.println();
    }

}
}




