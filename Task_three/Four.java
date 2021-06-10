import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");
		int num = sc.nextInt();
		if(num <= 0) {
			System.out.println("Invalid num. Please try again");
		}
		
		int res = 0;
		for(int i = 1; i <= num;i++) {
			System.out.print(i + " ");
			res += i;
		}
		System.out.println();
		System.out.println("The sum is " + res);
		sc.close();
	}

}