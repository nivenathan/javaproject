package project3;

public class Partern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5 ;
		
		
	for (int i =1; i<a+1; ++i) {
			for (int j=1; j<=i; ++j) {
			System.out.print(j);}
			System.out.println("");}
	
	for (int i=a-1; i>0; --i) {
		for (int j=1; j<=i; ++j) {
		System.out.print(j);}
		System.out.println("");	}
	
	for (int i=1; i<a+1; ++i) {
		switch(i) {
		case 1 :System.out.println("*");break;	
		case 2 :System.out.println("*** ");break;
		case 3 :System.out.println("*****");break;
		case 4 :System.out.println("***");break;
		case 5 :System.out.println("*");break;
		
		}
		}
	
	for (int i =1; i<8; ++i) {
		for (int j=1; j<=i; ++j) {
		System.out.print(j);}
		for (int r=i; r<7; ++r) {
			System.out.print("*");
			}
		System.out.println("");
		}
		
		}
}
