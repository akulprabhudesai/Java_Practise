import java.util.Stack;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		System.out.println("Is the string balanced? " + check(line));
		sc.close();
	}
	
	public static boolean check(String line) {
		Stack<Character> st = new Stack<>();
		
		for(char ch : line.toCharArray()) {
			if(ch == ' ')continue;
			else {
				if(ch == '(' || ch == '[' || ch == '{')st.push(ch);
				else {
					if(ch == ')' && st.peek() == '(')st.pop();
					else return false;
					
					if(ch == '}' && st.peek() == '{')st.pop();
					else return false;
					
					if(ch == ']' && st.peek() == '[')st.pop();
					else return false;
				}	
			}
			
		}
		
		if(st.isEmpty())return true;
		return false;
	}

}