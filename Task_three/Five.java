import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");
		long num = sc.nextLong();
		
		int res = 0;
		int count = 0;
		while(num > 0) {
			res += (num % 10);
			count++;
			num = num / 10;
		}
		System.out.println("The number of digits: " + count);
		System.out.println("The sum of digits " + res);
		sc.close();
	}

}