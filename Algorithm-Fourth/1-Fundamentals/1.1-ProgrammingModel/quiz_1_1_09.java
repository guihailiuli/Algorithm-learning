public class quiz_1_1_09 {
	public static void main(String[] args) {
		int N = 1234;
		//使用java的内置方法：
		System.out.println(Integer.toBinaryString(N));
		//使用取余法
		String s = "";
		for ( int n = N; n > 0; n /= 2) {
			s = (n % 2) + s;
		}
		System.out.println(s);
	}
}
//The result:
// '10011010010'
// '10011010010'