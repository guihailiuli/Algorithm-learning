import java.util.Arrays;
public class quiz_1_1_22 {
	public static int rank( int key, int[] a) {
		return rank( key, a, 0, a.length-1, 0 );
	}
	public static int rank( int key, int[] a, int lo, int hi, int indent) {
		StdOut.printf( "%c%-4d%d", repeat(4*indent, ' '), lo,hi);
		
		if ( lo > hi) {
			return -1;
		}
		int mid = (lo + hi ) / 2;
		if ( key < a[mid] ) {
			return rank( key, a, lo, mid-1, indent+1);
		} else if ( key > a[mid] ) {
			return rank( key, a, mid+1, hi, indent+1);
		} else {
			return mid;
		}
	}
	public static String repeat (int k, char c) {
		String s = "";
		for ( int i = 0; i < k; i++) {
			s += c;
		}
		return s;
	}
	public static void main(String[] args) {
		int[] whitelist = StdIn.readAllInts(args[0]);
		Arrays.sort( whitelist );
		
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if( rank(key, whitelist) == -1) {
				StdOut.println(key);
			}
		}
	}
	
}