import java.util.Scanner;

class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temp = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter the number");
			temp += sc.nextInt();
			
		}
		sc.close();
		System.out.println("The sum is " + temp);
		System.out.println("The average is " + (double) (temp / 10));
	}

}