import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		
		String line = sc.nextLine();
		String[] words = line.split(" ");
		int len = line.length();
		
		for(int i = 0; i < words.length;i++) {
			if(words[i].length() <= len)len = words[i].length();
		}
		
		System.out.println("Shortest word length: " + len);

		sc.close();
	}

}