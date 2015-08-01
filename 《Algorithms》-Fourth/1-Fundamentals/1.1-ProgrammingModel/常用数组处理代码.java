double[] a = new double[N];
double a = {1,2,34,5,9};
//计算最大值
double max = a[0];
for(int i=1; i<a.length; i++) {
	if(a[i] > max) {
		max = a[i];
	}
}
return max;
//计算平均值
double N = a.length;
double sum = 0.0;
for(int i=0; i<N; i++) {
	sum += a[i];
}
double avg = sum / N;
//赋值数组
int N = a.length;
double[] b = new double[N];
for(int i=0; i<N; i++) {
	b[i] = a[i];
} 
//颠倒数组元素顺序
int N = a.length;
for(int i=0; i<N/2; i++) {
	double temp = a[i];
	a[i] = a[N-1-i];
	a[N-1-i] = temp;
}
//矩阵相乘(方阵)  a[][] * b[][] = c[][]
int N = a.length;
double[][] c = new double[N][N];
for ( int i=0; i<N; i++ ) {
	for ( int j=0; j<N; j++ ) {
		//计算行i和列j的点乘
		for ( int k=0; k<N; k++) {
			c[i][j] += a[i][k] * b[k][j];
		}
	} 
}


