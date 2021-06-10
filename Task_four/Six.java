import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		for(char ch : line.toCharArray()) {
			if(ch == ' ')System.out.print(ch);
			else {
				if(Character.isLowerCase(ch))System.out.print(Character.toUpperCase(ch));
				else System.out.print(Character.toLowerCase(ch));
			}
		}
		
		sc.close();
	}

}