import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}
//Create a class B, which implements the interface GCD.
class B implements GCD{
  public int findGCD(int n1, int n2){
    int n = Math.min(n1,n2);
    int m = Math.max(n1,n2);
        
    if(n<0 || m<0){
      return -1;
    }
    if(n!=0){
      return findGCD(n, m%n);
    }
    else{
      return m;
    }
  }
}
public class Question5_2{ 
        public static void main (String[] args){ 
	      B a = new B();   //Create an object of class B
            // Read two numbers from the keyboard
            Scanner sc = new Scanner(System.in);  
             int p1 = sc.nextInt();
             int p2 = sc.nextInt();
            System.out.print(a.findGCD(p1,p2)); 
    } 
}
