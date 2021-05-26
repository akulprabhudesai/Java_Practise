import java.util.Scanner;

class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter floating point number");
		float num = sc.nextFloat();
		
		if(num == 0.0F)System.out.println("Zero");
		
		float num_abs = Math.abs(num);
		
		if(num_abs < 1) {
			System.out.println("small");
		}else if(num_abs > 1000000)System.out.println("large");
		
		sc.close();
	}

}