public class quiz_1_1_13 {
	public static void main(String[] args) {
		int m = 5;
		int n = 5;
		int [][] a = new int [m][n];
		int [][] b = new int [n][m];
		
		a = RandomInitial(a, n);      //��ʼ����ά����
		b = MigrateArrays(a, b);      //ת��
		MigratePrint( b );            //���ת�ú�Ķ�ά����
		
	}
	public static void MigratePrint(int [][] a) {
		StdOut.println("���ת�ö�ά����:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				StdOut.print(a[i][j] + " ");		
			}
			StdOut.println();
		}
	}
	public static int[][] MigrateArrays(int [][] a, int [][] b) {
		for (int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}
	
	public static int[][] RandomInitial(int [][] a, int N) {
		StdOut.println("��ʼ����ά����");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = StdRandom.uniform(N);
				StdOut.print(a[i][j] + " ");
			}
			StdOut.println();
		}
		return a;
	}
}
/*
the result 
��ʼ����ά����
2 3 1 0 2 
3 0 2 1 1 
3 4 0 2 2 
2 0 1 4 3 
4 2 3 1 4 
���ת�ö�ά����:
2 3 3 2 4 
3 0 4 0 2
1 2 0 1 3 
0 1 2 4 1 
2 1 2 3 4 
*/



