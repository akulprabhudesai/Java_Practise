import java.util.Scanner;


class Two{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -> Addition");
		System.out.println("2 -> Subtraction");
		System.out.println("3 -> Division");
		System.out.println("4 -> Multiplication ");
		System.out.println("5 -> Average");
		
		System.out.println();
		System.out.println("Please enter the operation number:");
		int val = sc.nextInt();
		
		int result = 0;
		
		if(val == 1 || val == 2 || val == 3 || val == 4 || val == 5) {
			System.out.println("Please enter a number:");
			int first = sc.nextInt();
			System.out.println("Please enter a number:");
			int second = sc.nextInt();
			
			if(val == 1)result = first + second;
			else if(val == 2)result = first - second;
			else if(val == 3)result = first / second;
			else if(val == 4)result = first * second;
			else if(val == 5) {
				System.out.println("Please enter a number:");
				int first1 = sc.nextInt();
				System.out.println("Please enter a number:");
				int second2 = sc.nextInt();
				
				result = (first + second + first1 + second2) / 4;
				
			}
			
			if(result < 0) System.out.println("Oops option " + val + " is returning the negative number");
			else System.out.println("The result is " + result);
		}else {
			System.out.println("Invalid selection");
		}
		
	}

}