public class quiz_1_1_30 {
	public static boolean[][] testArrays( boolean[][] a ) {
		int N = a.length;
		int M = a[0].length;
		StdOut.println(" M = " +  M + " " + "N = " + N);
		for ( int i = 0; i < N; i++) {
			for ( int j = 0; j < M; j++) {
				if ( gcd(i, j) == 1 ) {
					 a[i][j] = true;
				} else {
					 a[i][j] = false;
				}
			}
			
		}
		return a;
	}
	public static int gcd( int m, int n) {
		if ( m == 0 || n == 0 ) {
			return 1;
		}
		if ( m % n == 0) {
			return 0;
		} else {
			return gcd( n, m % n );
		}
	}
	public static void main(String[] args) {
		
		boolean[][] a = new boolean[10][10];
		testArrays(a);
	}
}
