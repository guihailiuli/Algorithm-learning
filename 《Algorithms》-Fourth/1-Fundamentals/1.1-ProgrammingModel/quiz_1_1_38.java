public class quiz_1_1_38 {
	public static boolean BinaryLookup(int key, int[] arr) {
	    int low = 0;
	    int high = arr.length - 1;
	    while(low <= high) {
	        int mid = low + ((high - low) >> 1);
	        if(key < arr[mid])
	            high = mid - 1;
	        else if(key > arr[mid])
	            low = mid + 1;
	        else
	            return true;
	    }
	    return false;
	}

	/**
	 * 暴力查找  在数组arr中找到key则返回true，否则返回false
	 */
	public static boolean bruteForceSearch(int key, int[] arr) {
	    for(int i = 0; i < arr.length; ++i)
	        if(key == arr[i])
	            return true;
	    return false;
	}

	public static void main(String[] args) {
	    int[] whiteList = new In(args[0]).readAllInts();
	    //long time0 = new Date().getTime();
	    // Arrays.sort(whiteList);                          // 暴力破解无需排序
	    while(!StdIn.isEmpty()) {
	        int key = StdIn.readInt();
	        boolean find = bruteForceSearch(key, whiteList);
	        if(!find)
	            StdOut.println(key);
	    }
	    /*
	    long time1 = new Date().getTime();
	    long elapsedTime = time1 - time0;
	    StdOut.println("用时： " + elapsedTime + " ms");
	    */
	}
	
}