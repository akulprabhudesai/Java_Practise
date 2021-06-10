import java.util.Scanner;

class One{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		 int num = sc.nextInt();
		 
		 for(int i = 1; i <= 10; i++) {
			 System.out.println(num * i);
		 }
	}

}