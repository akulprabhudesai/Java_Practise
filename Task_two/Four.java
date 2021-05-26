import java.util.Scanner;


class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int number = 0;
		
		while(sc.hasNextInt()) {
			number = sc.nextInt();
			if(number < 0) {
				System.out.println("It's over");
				break;
			}else {
				System.out.println("Good Going");
			}
		}
		
		sc.close();
	}

}