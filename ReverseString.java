package project3;
import java.util.*;  

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mysc = new Scanner(System.in);
		String abc;
		int length;
		System.out.print("Enter your string ");  
		abc= mysc.nextLine(); 
		length=abc.length();
		for (int i =length-1; i >=0; --i) {
			System.out.print(abc.charAt(i));
		
	}

}
		
}
