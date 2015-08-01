public class quiz_1_1_32 {
	//将(l, r)分为N段。
	public static double[] segmentation(int N, double l, double r, double[] a) {
		if ( N == 0) {
			return a;
		}
		double s = ( r - 1) / N;
		a[0] = 1;
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i - 1] + s; 
		}
		return a;
	}
	public static void makehistogram(double[] a, double[] b, double l, double r) {
		int[] c = new int[a.length-1];
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if( b[i] >= a[j] && b[i] < a[j+1] ) {
					c[j] += 1;
					continue;
				}
			}
			int N = c.length;
			StdDraw.setXscale(0, (r-1) * 1.2 );
			StdDraw.setYscale(0, b.length / N * 1.5);
			for(int k = 0; k < N; k++) {
				double x = 1 + (r - 1) / N * i;
				double y = c[k] / 2.0;
				double rw = (r - 1) / (2 * N);
				double rh = c[k] / 2.0;
				StdDraw.filledRectangle(x, y, rw, rh);
				StdOut.print(c[k] + " ");
			}
		}
	}
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
    	double l = Double.parseDouble(args[1]);
    	double r = Double.parseDouble(args[2]);
	   
		double[] a = new double[N + 1];     //记录分段节点
		double[] b = new double[ N ];   //随机产生一个数组，作为输入数字
		a = segmentation(N, l, r, a);
		for(int i = 0; i < b.length; i++) {
			b[i] = StdRandom.uniform(l, r);
		}
		makehistogram(a, b, l, r);				
			
	}	
}