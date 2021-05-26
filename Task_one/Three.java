import java.util.Scanner;


class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 1st number between 1 to 10:");
		int z = sc.nextInt();
		
		System.out.println("Please enter the 2nd number between 1 to 10:");
		
		z = z + sc.nextInt();
		
		System.out.println("Final result: " + (z + 30));
		
		sc.close();
	}

}