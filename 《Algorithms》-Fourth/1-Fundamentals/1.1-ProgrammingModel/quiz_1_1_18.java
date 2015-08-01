public class quiz_1_1_18 {
	public static int mystery(int a, int b) {
		StdOut.printf("%3d, %3d\n", a, b);
		if (b == 0) {
			return 0;
		}
		if (b % 2 == 0) {
			return mystery(a + a, b / 2);
		}
		return mystery(a + a, b / 2) + a;
	}
	
	public static int mystery2(int a, int b) {
		StdOut.printf("%7d,%3d\n", a, b);
		if (b == 0) {
			return 1;
		}
		if (b % 2 == 0) {
			return mystery2(a * a, b / 2);
		}
		return mystery2(a * a, b / 2) * a;
	}
	public static void main(String[] args) {
		StdOut.println("The result:"+mystery(2, 25));
		System.out.println("-------------");
		StdOut.println("The result:"+mystery(3, 11));
		System.out.println("-------------");
		StdOut.println("The result:"+mystery2(2, 25));
		System.out.println("-------------");
		StdOut.println("The result:"+mystery2(3, 11));
	}

}
/*
 * the result:
  2,  25
  4,  12
  8,   6
 16,   3
 32,   1
 64,   0
The result:50
-------------
  3,  11
  6,   5
 12,   2
 24,   1
 48,   0
The result:33
-------------
      2, 25
      4, 12
     16,  6
    256,  3
  65536,  1
      0,  0
The result:33554432
-------------
      3, 11
      9,  5
     81,  2
   6561,  1
43046721,  0
The result:177147

 */



