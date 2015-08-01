public class quiz_1_1_24 {
	private static int commonDiviso( int x, int y) {
		if( x == 1 && y == 1) {
			return 1;
		}
		if ( x < y ) {
			int temp = x;
			x = y;
			y =temp;
		}
		System.out.println("x = " + x +"    " +  "y = " + y);
		if ( x % y == 0) {
			return y;
		} else {
			return commonDiviso( y, x%y);
		}
	}
	public static void main(String[] args) {
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		int value = commonDiviso(N1, N2);
		System.out.println("The largest common diviso is:"+value);
	}
}
/*
 java quiz_1_1_24 1111111 1234567
 the result:
x = 1234567    y = 1111111
x = 1111111    y = 123456
x = 123456     y = 7
x = 7          y = 4
x = 4          y = 3
x = 3          y = 1
The largest common diviso is:1

 */
