import java.util.Arrays;
public class quiz_1_1_39 {
	
	public static int experiment(int n) {
		int[] n1 = new int[n],
			  n2 = new int[n];
		for (int i = 0; i < n; i++) {
			n1[i] = StdRandom.uniform(100000, 1000000);         //随机产生6位正整数
			n2[i] = StdRandom.uniform(100000, 1000000);
		}
		int count = 0;
		Arrays.sort(n2);
		for (int i = 0; i < n; i++) {
			//直接调用：if (BinarySearch.rank(a[i], b) >= 0)
			if ( rank (n1[i], n2) >= 0 ) {
				count++;     //同时存在n1,n2的数量
			}
		}
		return count;
	}
	public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
	
	public static void batch(int t, int n) {
		long count = 0;
		for (int i = 0; i < t; i++) {
			count += experiment(n);       //把针对这个N的，t次实验中的数量累加起来，
		}
		double avg = 1.0 * count / t;
		StdOut.printf("%8d: %9.2f\n", n, avg);
	}
	
	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		int[] n = {1000, 10000, 100000, 1000000};
		int nlen = n.length;
		for (int i = 0; i < nlen; i++) {
			batch(t, n[i]);
		}
		
	}
}
/*the result:
 * t = 10
 *  1000:      0.90
   10000:    113.50
  100000:  10508.80
 1000000: 670878.10

 * 
 * */
