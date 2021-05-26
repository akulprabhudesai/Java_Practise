import java.util.Scanner;


class One{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int z = sc.nextInt();
		sc.close();
		
		if(z % 3 == 0 && z % 5 == 0) {
			System.out.println("Consultadd JAVA Training");
		} else if(z % 3 == 0) {
			System.out.println("Consultadd");
		} else if(z % 5 == 0) {
			System.out.println("JAVA Training");
		}else {
			System.out.println("The number is not divisible by 3 and 5 both");
		}
		
	}

}