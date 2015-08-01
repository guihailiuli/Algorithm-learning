public class quiz_1_1_21 {

	public static void main(String[] args) {
		
		
	    
		String[] whitelist = In.readAllStrings();
		
		
		for ( int i = 0; i < whitelist.length; i += 3) {
			StdOut.print( whitelist[i] + " " + whitelist[i+1] + " " + whitelist[i+1] );
			double m = Double.parseDouble(whitelist[ i + 1]);
			double n = Double.parseDouble(whitelist[ i + 2]);
     		StdOut.printf("0.3%", m / n);
     		StdOut.println(" ");
		}
	}
}