import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Year:");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("Leap Year");
			} else {
				if (year % 400 == 0)
					System.out.println("Leap Year");
				else
					System.out.println("Non Leap year");
			}
		} else
			System.out.println("Non Leap year");

		sc.close();
	}

}