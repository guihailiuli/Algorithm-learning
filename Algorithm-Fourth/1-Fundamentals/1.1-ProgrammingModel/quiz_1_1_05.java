public class quiz_1_1_05 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
		StdOut.print(compare(x) && compare(y));
	}
	public static boolean compare( double x) {
		if ( x > 0 && x < 1) {
			return true;
		} else {
			return false;
		}
	}

}
/*
 * the result:
 * 10 -2 : false
 * 
 * 
 * 
 * */
 