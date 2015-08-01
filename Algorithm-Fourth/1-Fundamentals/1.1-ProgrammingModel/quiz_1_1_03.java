public class quiz_1_1_03 {
	
	public static int equal(int a, int b, int c) {
		if ( a == b && b == c) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		int a, b, c;
		StdOut.println("Please enter three numbers");
		a = StdIn.readInt();
		b = StdIn.readInt();
		c = StdIn.readInt();
		
		if( equal(a, b, c) == 1) {
			StdOut.println("equal");
		} else {
			StdOut.println("not equal");
		}
	}

}
