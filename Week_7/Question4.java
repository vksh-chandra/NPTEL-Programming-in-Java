import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
//Write your code here to count the number of vowels in the string "s1"string "s1"
char s2;
for(int i=0;i<s1.length();i++){
	s2=s1.charAt(i);
  	if(s2=='A'||s2=='a'||s2=='E'||s2=='e'||s2=='I'||s2=='i'||s2=='O'||s2=='o'||s2=='U'||s2=='u'){
  		c=c+1;
  	}
}
      System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
} 
