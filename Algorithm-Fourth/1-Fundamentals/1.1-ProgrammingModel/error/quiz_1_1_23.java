import java.util.Arrays;
public class quiz_1_1_23 {
    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length -1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) /2;
            if         (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] whitelist = StdIn.readAllInts(args[0]);
        String para = args[1]; //new parameter for determining whether to print values in the whitelist or not in the whihtlist
        Arrays.sort(whitelist);
        
        //ATTENTION: selective clause cannot be placed inside while loop
        //if the parameter is set as "+"
        if (para.equals("+"))
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                if (rank(key, whitelist) < 0)
                        StdOut.println(key);
                
            }
        
        //if the parameter is set as "-"
        else if (para.equals("-"))
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                if (rank(key, whitelist) > 0)
                        StdOut.println(key);
                
            }
    }
}