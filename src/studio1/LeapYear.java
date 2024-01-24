package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a year and I will determine if it's a leap year!");
		int year = scan.nextInt();
		boolean isDivisibleBy4 = (year % 4 == 0);
		boolean isNotDivisibleBy100 = (year % 100 != 0) || (year % 400 == 0);
		boolean leapYear = isDivisibleBy4 && isNotDivisibleBy100;
		
		System.out.println(year + " is a leap year: " + leapYear);

	}

}
