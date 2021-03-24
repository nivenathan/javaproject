package project3;
import java.util.*;
public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is the command keyword to exit a loop in Java? ");  
		System.out.println("a.int");
		System.out.println("b.continue ");
		System.out.println("c.break ");
		System.out.println("d.exit");
		String abc=myScanner.nextLine();
		if(abc== "d") {
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect ");
			System.out.println("Again press Y to Continue");
		}
			
		
	}

}

