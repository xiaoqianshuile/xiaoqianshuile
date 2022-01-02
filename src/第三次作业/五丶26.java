package 第三次作业;

public class 五丶26 {
public static void main(String[] args) {
		
		double sum = 1;
		double pi1=1;
		for(int i = 10000;i<=100000;i+=10000) {
			sum=1;
			pi1=1;
			for(int j =1;j<=i;j++) {
				sum*=j;
				pi1+=1.0/sum;
			}
			System.out.println(pi1);
		}
	}
}
