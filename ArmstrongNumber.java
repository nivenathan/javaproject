package project3;
import java.util.*;  
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		int a;
		System.out.print("Enter your 3 digit number ");  
		a=myScanner.nextInt();
		//System.out.print(a);
		
		int b ,c,d;
		b= a/100;
		
		c=a%10;
		
		d=(a%100)/10;
		
		
		int ar;
		ar= b*b*b+c*c*c+d*d*d;
	
		if(a==ar) {
			System.out.println(" your digit is armstrong digit");
			}
		else {
			System.out.println(" your digit is not armstrong digit");
		}
		

	}

}

