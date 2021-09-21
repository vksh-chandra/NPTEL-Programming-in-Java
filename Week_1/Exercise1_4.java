
import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
		int digit=0, temp;
        int rem, sum =0;
        temp = n;
        while(temp!=0)
        {
            temp= temp/10;
            digit++;
        }
        temp = n;
        while(temp!=0)
        {
            rem = temp%10;
            sum += Math.pow(rem, digit);
            temp= temp/10;
        }

	if(sum == n){
  		result =1;  
  		System.out.println(result);

	}

        else{
          result =0;
          System.out.println(result);

        }
 }
}