class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> odd = new ArrayList<>(Arrays.asList(23, 25, 75, 87, 47, 1, 91, 51, 2));
		ArrayList<Integer> even = new ArrayList<>(Arrays.asList(22, 44, 64, 76, 98, 12, 43, 54, 90));

		System.out.println("Even numbers in list of odd");

		for (int i = 0; i < odd.size(); i++) {
			if (odd.get(i) % 2 == 0)
				System.out.print(odd.get(i) + " ");
		}
		System.out.println();
		System.out.println("Odd numbers in list of even");

		for (int i = 0; i < even.size(); i++) {
			if (even.get(i) % 2 == 1)
				System.out.print(even.get(i) + " ");
		}
	}

}