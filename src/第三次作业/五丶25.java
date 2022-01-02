package 第三次作业;
public class 五丶25 {
	public static void main(String[] args) {
		double pi1=0;
		for(int j =10000;j<=100000;j+=10000) {
			pi1=0;
			for(int i = 1;i<=j;i++) {
				pi1=pi1+(Math.pow(-1,i+1)/(2*i-1));
			}
			System.out.println(4.0*pi1);
		}
	}
}
