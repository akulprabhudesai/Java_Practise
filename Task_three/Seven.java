import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Year:");
		int year = sc.nextInt();
		
		System.out.println("Please enter the Month:");
		int month = sc.nextInt();
		
		if(month != 2) {
			if(month <= 7) {
				if(month % 2 == 0)System.out.println("30 days");
				else System.out.println("31 days");	
			}else {
				if(month % 2 == 0)System.out.println("31 days");
				else System.out.println("30 days");
			}	
		}else {
			if(year % 4 == 0) {
				if(year % 100 != 0) {
					System.out.println("29 days");
				}else {
					if(year % 400 == 0)System.out.println("29 days");
					else System.out.println("28 days");
				}
			}else System.out.println("28 days");
		}
		
		
		
		sc.close();
	}

}