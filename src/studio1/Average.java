package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("First number to be averaged?");
		int n1 = scan.nextInt();
		System.out.println("Second number to be averaged?");
		int n2 = scan.nextInt();
		
		double averageOf = (n1 + n2)/2.0;
		
		System.out.println("The average is " + averageOf);

	}

}
