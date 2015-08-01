public class quiz_1_1_11 {
	public static void main(String[] args) {
		boolean[][] a = new boolean[10][10];
		a = RandomInitial(a);     //随机初始化
		testPrint(a);      //打印数组
	}
	public static boolean[][] RandomInitial(boolean[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if( StdRandom.bernoulli(0.1)) {
					a[i][j] = true;
				} else {
					a[i][j] = false;
				}
			}
		}
		return a;
	}
	public static void testPrint(boolean[][] a) {
		for (int k = 0; k < a.length; k++) {
			StdOut.print( " " + k);
			StdOut.println(" ");
			for( int i = 0; i < 10; i++) {
				StdOut.print(i);
				for( int j = 0; j < 10; j++) {
					if(a[i][j]) {
						StdOut.print("*" + " ");
					} else {
						StdOut.print(" " + " ");
					}
				}
				StdOut.println(" ");
			}
		}
	}
}