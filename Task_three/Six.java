import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = 0;
		boolean increasing = true;
		boolean decreasing = true;
		
		for(int i = 0; i < 3;i++) {
			System.out.println("Please enter the number:");
			if(i == 0)first = sc.nextInt();
			else {
				int temp = sc.nextInt();
				if(temp > first)decreasing = false;
				else if(temp < first)increasing = false;
				else {
					increasing = false;
					decreasing = false;
				}
				first = temp;
			}
		}
		
		if(increasing || decreasing) {
			if(increasing)System.out.println("Increasing");
			else System.out.println("Decreasing");
		}else {
			System.out.println("Neither increasing or decreasing order");
		}
		sc.close();
	}

}