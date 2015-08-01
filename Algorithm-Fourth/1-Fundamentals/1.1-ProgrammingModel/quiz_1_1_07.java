public class quiz_1_1_07 {
	public static void main(String[] args) {
		//a
		double t = 0.9;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = ( 9.0 / t + t) / 2.0;
		}
		System.out.printf("%.5f\n", t);
		//b
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			for(int j = 0; j < i; j++) {
				sum++;
			}
		}
		System.out.println(sum);
		//c
		int num = 0;
		for (int i = 1; i < 1000; i *= 2) {
			for (int j = 0; j < 1000; j++) {
				num++;
			}
		}
		System.out.println(num);

	}
	
}
// The result:
// 3.00030
// 499500
// 10000
