public class quiz_1_1_31 {
    public static void drawRand(int N, double p) {
    	StdDraw.setCanvasSize(500, 500);   //创建500 * 500画布
    	StdDraw.setScale(-1.0, 1.0);       //x, y范围
    	StdDraw.setPenRadius(0.05);        //画笔的粗细半径
    	
    	double[][] d = new double[N][2];    //创建存储坐标位置的数组
    	
    	for ( int i = 0; i < N; i++) {
    		d[i][0] = Math.cos( 2 * Math.PI * i / N);
    		d[i][1] = Math.sin(2 * Math.PI * i / N);
    		StdDraw.point(d[i][0], d[i][1]);   //从(1,0)位置开始，逆时针依次画点
    	}
    	
    	StdDraw.setPenRadius();    //设置点的粗细
    	
    	for (int i = 0; i < N - 1; i++) {
    		for (int j = i + 1; j < N; j++) {
    			if (StdRandom.bernoulli( p )) {  //当p在0-1范围内，返回true,否则返回false
    				StdDraw.line(d[i][0], d[i][1], d[j][0], d[j][1]);    //以0.5的概率给每个对等点之间连线
    			}
    		}
    	}
    }
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
    	double p = Double.parseDouble(args[1]);
    	p = Math.max(0, Math.min(0.9, p));   
    	drawRand( N, p);
    }
}
//N = 8, p = 0.5
