public class quiz_1_1_27 {
    public static double binomial(int n, int k, double p, Counter c) {
    	double[][] v = new double[n+1][k+1];
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < k; j++) {
    			v[n][k] = -1;       //先把所有元素标记为-1
    		} 
    	}
    	return binomial(v, n, k, p, c);
    }
    public static double binomial(double[][] v, int n, int k, double p, Counter c) {
    	if ( n == 0 && k == 0)
    		return -1.0;
    	if ( n < 0 && k < 0) 
    		return 0.0;
    	if (v[n][k] == -1) {     //当v[n][k]为-1时，表示没有计算过，继续进行计算；不等于-1时，表示计算过了直接返回
    		c.invrement();       //计算调用次数
    		return v[n][k] = (1.0 - p)*binomial(v, n-1, k, p, c) + p*binomial(v, n-1, k, p, c);
    	}
    	return v[n][k];
    }
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]),
    	    k = Integer.parseInt(args[1]);
    	double p = Double.parseDouble(args[2]);
    	
    	Counter c = new Counter("calls");
    	
    	double b = binomial(n, k, p, c);
    	
    	StdOut.println( b );
    	StdOut.println( c );
    }
}
