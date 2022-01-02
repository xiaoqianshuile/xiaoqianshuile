package 第三次作业;
import java.util.Scanner;
public class 五丶45 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 number: ");
		double[] a= {};
		double sum=0;
		for(int i = 0;i<10;i++) {
			 a[i]=input.nextDouble();
			 sum+=a[i];
		}
		System.out.println("The mean is "+sum/10.0);
		double sumsum = 0;
		for(int i =0;i<10;i++) {
			sumsum+=Math.pow((a[i]-sum/10.0),2);
		}
		System.out.print("The standard deviation is "+Math.sqrt(sum/10));
	}
}
