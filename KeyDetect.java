package project3;
import java.util.*;
public class KeyDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		String abc;
		System.out.println("pres thekey");
		abc=myScanner.nextLine(); 
		switch(abc) {
		case "0" :System.out.println(0);break;	
		case "1" :System.out.println(1);break;
		case "2" :System.out.println(2);break;
		case "3" :System.out.println(3);break;
		case "4" :System.out.println(4);break;
		case "5" :System.out.println(5);break;
		default : System.out.println("not allowed");
		
		}
		
	}

}
