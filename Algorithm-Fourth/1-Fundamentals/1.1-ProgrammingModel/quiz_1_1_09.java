public class quiz_1_1_09 {
	public static void main(String[] args) {
		int N = 1234;
		//ʹ��java�����÷�����
		System.out.println(Integer.toBinaryString(N));
		//ʹ��ȡ�෨
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