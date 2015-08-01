public class quiz_1_1_20 {
    /*
    private static double ln(int N)
    {
        int product = 1;
        if (N == 0) return 0;
        if (N == 1) return 1;
         
        for (int i = 2; i <= N; i++)
            product *= i ;
        return Math.log(product); 
    }
    */
	public static double ln2(long N) {
		if ( N > 1) {
			return Math.log(N) + ln2( N -1 );
		}
		else {
			return 0;
		}
	}
    public static void main(String[] args)
    {
        int N = 10;
        double value = ln2(N);
        StdOut.print(value);
    }
}
/*
the result:
	N = 10
	ln(10!) = 15.104412573075518
*/
