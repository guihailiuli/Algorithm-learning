
public class quiz_1_1_33 {
	public static double dot(double[] x, double[] y) {       //向量点乘
		//点乘必须满足x的长度和y的长度相等才能运算
		if ( x.length != y.length) {
			System.exit(-1);
		}
		int len = x.length;
		double res = 0.0;
		for(int i = 0; i < len; i++) {
			res += x[i] * y[i];
		}
		return res;
	}
	public static double[][] mult(double[][] a, double[][] b) {      //矩阵和矩阵乘积
		//矩阵和矩阵乘积必须满足a的列数等于b的行数
		//a是n行m列的矩阵，b是m行p列的矩阵，乘积为n行p列的矩阵c,
		//其中c的第i行第j列位置上的数,等于a上第i行上的m个数和b上的第j列上的m个数对应
		int M = a[0].length,       //a的列数
		    N = a.length,         //a的行数
		    P = b[0].length;      //b的列数
		
		if( M != b.length) {
			System.exit(-1);
		}
		
		double[][] c = new double[N][P];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < P; j++) {
				for (int m = 0; m < M; m++) {
					c[i][j] += a[i][m] * b[m][j];
				}
			}
		}
		return c;
	}
	public static double[][] transpose(double[][] a) {     //转置矩阵
		int N = a.length,
		    M = a[0].length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < M; j++) {
				double temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		return a;
	}
	public static double[] mult(double[][] a, double[] x) {      //矩阵和向量乘积
		//可以把向量当做一维矩阵来乘，即需要满足a的列等于x的长度
		int N = a.length,
			M = a[0].length,
			P = x.length;
		
		if( M != P ) {
			System.exit(-1);
		}
		double[] c = new double[N];
		for(int i = 0; i < N; i++) {
			for (int m = 0; m < M; m++) {
				c[i] += a[i][m] * x[m];
			}
		}
		return c;
	}
	public static double[] mult(double[] y, double[][] a) {     //向量和矩阵乘积
		//同上
		
		int N = y.length,
	        M = a[0].length; 
		
		if( N != M ) {
			System.exit(-1);
		}
		
		double[] c = new double[M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i] += y[j] * a[j][i];
			}
		}
		return c;
	}
	public static double[][] randominit(double[][] a) {
		int N = a.length;
		int M = a[0].length;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				a[i][j] = StdRandom.uniform( M + N);     //矩阵随机初始化
			}
		}
		return a;
	}
	public static double[] randominit(double[] a) {
		int N = a.length;
		for(int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform( N );    //向量随机初始化
		}
		return a;
	}
	public static void Print(double[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	public static void Print(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[0].length; j++) {
				StdOut.print(a[i][j] + "   ");
			}
			StdOut.println();
		}
		StdOut.println();
	}
	
	public static void main(String[] args) {
		int N = 5;
		int p = 10;
		double[][] a = new double[N][p];
		double[][] b = new double[p][N];
		double[] c = new double[N];
		
		a = randominit(a);
		b = randominit(b);
	    c = randominit(c);
	    
	    StdOut.println("--------------向量点乘----------");
	    StdOut.println(dot(c, c));
	    
	    StdOut.println("-----------矩阵和矩阵乘积-------------");
	   Print(mult(a, b));
	    
	    StdOut.println("---------------转置--------------");
	    Print(transpose(b));
	    
	    StdOut.println("------------矩阵和向量乘积--------");
	    Print(mult(b, c));
	    
	   StdOut.println("-------------向量和矩阵相乘----------");
	   Print(mult(c, b));
	    
	    
	}

}
