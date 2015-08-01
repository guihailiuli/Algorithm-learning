public class quiz_1_1_16 {
    public static String exR1( int n ) {
    	if( n <= 0 )  return "";
    	return exR1( n - 3) + n + exR1( n -2 ) + n;
    }
    public static void main(String[] args) {
    	StdOut.println(exR1(6));
    }
}
/*
exR1(6)
exR1(3) +6+ exR1(4)+ 6
exR1(0)+3+exR1(1)+3+ +6+ exR1(1)+4+exR1(2)+4 +6
"" +3+ exR1(-2)+1+exR1(-1)+1 +3+ +6+ exR1(-2)+1+exR1(-1)+1 +4+ exR1(-1)+2+exR1(0)+2 +4+6
3+1+1+3+6+1+1+4+2+2+4+6

*/
