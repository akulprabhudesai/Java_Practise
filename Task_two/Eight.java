import java.util.Scanner;

class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		
		char c = sc.next().charAt(0); 
		
		c = Character.toLowerCase(c);
		
		if(c == 'r' || c == 'a' || c == 'n' || c == 'd' || c == 'o' || c == 'm') {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
		
		sc.close();
	}

}