import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 1st number:");
		float first = sc.nextFloat();
		
		System.out.println("Please enter the 2nd number:");
		float second = sc.nextFloat();
		
		
		first = (float) (Math.round(first * 100.0) / 100.0);
		second = (float) (Math.round(second * 100.0) / 100.0);
		
		if(first == second)System.out.println("Both are same upto two decimal places");
		else System.out.println("Not same upto two decimal places");

		sc.close();
	}

}