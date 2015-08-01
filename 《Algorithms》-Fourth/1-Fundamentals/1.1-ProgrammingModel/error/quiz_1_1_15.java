//public class quiz_1_1_15 {
//	/*
//	public static int[] histogram (int[] a, int M) {
//		int[] arr = new int[M];
//		int N = a.length;
//		
//		for( int i = 0; i < N; i++) {
//			if( a[i] < M) {
//				arr[a[i]]++;
//			}
//		}
//		return arr;
//	}
//	*/
//	public static int[] histogram (int[] a, int M) {
//		int[] arr = new int[M];
//		int n = 0;
////		int m = 0;
//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if( i == a[j]) {
//					n++;
//				}
//				arr[i] = n;
//			}
//			n = 0;
//		}
////		for (int i = 0; i < M; i++) {
////			m += arr[i];
////		}
//		return arr;
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		int N = 30;
//		int M = 10;
//		
//		int[] a = new int[N];
//		for (int i = 0; i < N; i++) {
//			a[i] = StdRandom.uniform(M);   //³õÊ¼»¯
//		}
//		for (int i = 0; i < N; i++) {
//			StdOut.printf("%2d", a[i]);
//		}
//		
//		int[] arr = histogram(a, M);
//		
//		StdOut.println(" \n ");
//		for(int i = 0; i < M; i++) {
//			StdOut.printf("%4d", arr[i]);
//		}
//	}
//
//}
