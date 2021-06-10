import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements:");
		
		int len = sc.nextInt();
		
		int[] nums = new int[len];
		
		for(int i = 0; i < len;i++) {
			System.out.println("Please enter the number");
			nums[i] = sc.nextInt();
		}
		
		Arrays.parallelSort(nums);
		
		for(int i = 2; i < len-1;i++) {
			nums[1] += nums[i];
		}
		
		System.out.println("The sum is " + nums[1]);
		sc.close();
	}

}