// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;

//Write the appropriate code to read the 3 integer values and find their sum.

public class Question1{ 
        public static void main (String[] args){
		      int n,sum=0;
          Scanner sc = new Scanner(System.in);
          for(int i=0;i<3;i++){
          	n = sc.nextInt();
            sum=sum+n;
          }
          sc.close();
System.out.println(sum);
  }
}
