package project3;
import java.util.*;  
public class Derermint {

	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Enter your number 1 ");  
		a=myScanner.nextInt();
		System.out.print("Enter your number 2 ");  
		b=myScanner.nextInt();
		System.out.print("Enter your number 3 ");  
		c=myScanner.nextInt();
		System.out.print("Enter your number 4 ");  
		d=myScanner.nextInt();
		
		 int[][] myNumbers = { {a, b}, {c, d} };
		 
		    for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.print(myNumbers[i][j]);
		        System.out.print(" ");
		      }
		      System.out.println("");
		    }
		    
		int determin=(a*d)-(b*c);
		 System.out.println(determin);
		
	}

}
