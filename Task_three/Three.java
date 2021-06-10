import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the nomth number from 1 to 12");
		
		int month = sc.nextInt();
		
		if(month <= 0 || month > 12) {
			System.out.println("Invalid month. Please try again");
		}
		else {
			if(month != 2) {
			if(month <= 7) {
				if(month % 2 == 0)System.out.println("30 days");
				else System.out.println("31 days");	
			}else {
				if(month % 2 == 0)System.out.println("31 days");
				else System.out.println("30 days");
			}	
		}else {
			System.out.println("28 or 29 days");
		}
		}
		
		sc.close();
	}

}