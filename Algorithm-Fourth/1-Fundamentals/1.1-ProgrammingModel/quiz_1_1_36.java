public class quiz_1_1_36
{
    public interface IShuffle
    {
        public void shuffle(int[] a);     //问题：为什么这样写？
    }
    
    public static void ShuffleTest(IShuffle shuffle, int m, int n)     //问题：第一个参数是干嘛用的?
    {
        int[][] s = new int[m][m];
        
        for (int k = 0; k < n; k++)
        {
            int[] a = new int[m];
            for (int i = 0; i < m; i++)
                a[i] = i;
            
            shuffle.shuffle(a);
            
            for (int i = 0; i < m; i++)
                s[i][a[i]]++;
        }
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
                StdOut.printf("%7d", s[i][j]);
            StdOut.println();
        }
    }
    
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        
        //问题：这段这样写是什么意思??
        //----
        IShuffle shuffle = new IShuffle()
        {
            public void shuffle(int[] a)
            {
                StdRandom.shuffle(a);   //调用《算法》中的stdlib.jar中的StdRandom库中的随机将元素排序方法
            }
        };
        //------
        ShuffleTest(shuffle, m, n);
    }
}