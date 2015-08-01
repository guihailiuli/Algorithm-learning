
public class quiz_1_1_33 {
	public static double dot(double[] x, double[] y) {       //�������
		//��˱�������x�ĳ��Ⱥ�y�ĳ�����Ȳ�������
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
	public static double[][] mult(double[][] a, double[][] b) {      //����;���˻�
		//����;���˻���������a����������b������
		//a��n��m�еľ���b��m��p�еľ��󣬳˻�Ϊn��p�еľ���c,
		//����c�ĵ�i�е�j��λ���ϵ���,����a�ϵ�i���ϵ�m������b�ϵĵ�j���ϵ�m������Ӧ
		int M = a[0].length,       //a������
		    N = a.length,         //a������
		    P = b[0].length;      //b������
		
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
	public static double[][] transpose(double[][] a) {     //ת�þ���
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
	public static double[] mult(double[][] a, double[] x) {      //����������˻�
		//���԰���������һά�������ˣ�����Ҫ����a���е���x�ĳ���
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
	public static double[] mult(double[] y, double[][] a) {     //�����;���˻�
		//ͬ��
		
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
				a[i][j] = StdRandom.uniform( M + N);     //���������ʼ��
			}
		}
		return a;
	}
	public static double[] randominit(double[] a) {
		int N = a.length;
		for(int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform( N );    //���������ʼ��
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
	    
	    StdOut.println("--------------�������----------");
	    StdOut.println(dot(c, c));
	    
	    StdOut.println("-----------����;���˻�-------------");
	   Print(mult(a, b));
	    
	    StdOut.println("---------------ת��--------------");
	    Print(transpose(b));
	    
	    StdOut.println("------------����������˻�--------");
	    Print(mult(b, c));
	    
	   StdOut.println("-------------�����;������----------");
	   Print(mult(c, b));
	    
	    
	}

}
