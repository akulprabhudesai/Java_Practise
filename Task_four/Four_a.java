import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");

		String line = sc.nextLine();

		String[] words = line.split(" ");

		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(words[i]);
			System.out.print(sb.reverse() + " ");
		}

		sc.close();
	}

}