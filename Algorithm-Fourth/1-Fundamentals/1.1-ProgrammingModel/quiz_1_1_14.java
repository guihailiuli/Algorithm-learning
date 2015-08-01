public class quiz_1_1_14 {
	public static void main(String[] args) {
		lg(50,5);
		
	}
	public static int lg(int N, int M) {
		int a = 0;
		while( N >= M ) {
			N = N / M;
			a++;
			System.out.println(a);
		}
		return a;
		
	}
}
/*
the result:
1
2

 */