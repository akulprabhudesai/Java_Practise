import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements:");
		
		String line = sc.nextLine();
		
		System.out.println(remove_space(line));
		sc.close();
	}
	
	public static String remove_space(String line) {
		StringBuilder sb = new StringBuilder();
		
		for(String s : line.split(" ")) {
			sb.append(s);
		}
		return sb.toString();
	}

}