package 第三次作业;
import java.util.Scanner;
public class 五丶19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,a;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of lines: ");
			int number = input.nextInt();
			
			for(int i=0;i<=number-1;i++) {
				for(int n=number-i;n>=2;n--) {
					System.out.print("    ");
				}
				for(int j=0;j<=i;j++) {
					m = (int) Math.pow(2, j);
					System.out.printf("%4d", m);
				}
				for(int k=i-1;k>=0;k--) {
					a = (int) Math.pow(2, k);
					System.out.printf("%4d", a);
				}
				System.out.println();
			}
		}
	}
}
