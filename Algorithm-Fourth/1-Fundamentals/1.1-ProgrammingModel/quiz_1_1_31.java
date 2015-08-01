public class quiz_1_1_31 {
    public static void drawRand(int N, double p) {
    	StdDraw.setCanvasSize(500, 500);   //����500 * 500����
    	StdDraw.setScale(-1.0, 1.0);       //x, y��Χ
    	StdDraw.setPenRadius(0.05);        //���ʵĴ�ϸ�뾶
    	
    	double[][] d = new double[N][2];    //�����洢����λ�õ�����
    	
    	for ( int i = 0; i < N; i++) {
    		d[i][0] = Math.cos( 2 * Math.PI * i / N);
    		d[i][1] = Math.sin(2 * Math.PI * i / N);
    		StdDraw.point(d[i][0], d[i][1]);   //��(1,0)λ�ÿ�ʼ����ʱ�����λ���
    	}
    	
    	StdDraw.setPenRadius();    //���õ�Ĵ�ϸ
    	
    	for (int i = 0; i < N - 1; i++) {
    		for (int j = i + 1; j < N; j++) {
    			if (StdRandom.bernoulli( p )) {  //��p��0-1��Χ�ڣ�����true,���򷵻�false
    				StdDraw.line(d[i][0], d[i][1], d[j][0], d[j][1]);    //��0.5�ĸ��ʸ�ÿ���Եȵ�֮������
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
