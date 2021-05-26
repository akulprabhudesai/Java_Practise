class Three {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int avg = (a + b + c) / 3;
		System.out.println("avg is " + avg);
		
		if(avg > a && avg > b && avg > c) {
			System.out.println("avg is greater than a, b and c");
		}else if(avg > a && avg > b) {
			System.out.println("avg is greater than a and b");
		}else if(avg > a && avg > c) {
			System.out.println("avg is greater than a and c");
		}else if(avg > b && avg > c) {
			System.out.println("avg is greater than b and c");
		}else if(avg > a) {
			System.out.println("avg is just greater than a");
		}else if(avg > b) {
			System.out.println("avg is just greater than b");
		}else if(avg > c) {
			System.out.println("avg is just greater than c");
		}
	}

}