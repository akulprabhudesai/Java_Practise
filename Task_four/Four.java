import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		
		String s = sc.next();
		
		System.out.println("Are all letters are unique? -> " + unique(s));
		
		
		sc.close();
	}
	
	public static boolean unique(String s) {
		HashSet<Character> letters = new HashSet<Character>();
		
		for(char ch : s.toCharArray()) {
			if(letters.contains(ch))return false;
			else letters.add(ch);
		}
		
		return true;
	}

}