package 第三次作业;
import java.util.Scanner;
public class 五丶36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int a = input.nextInt();
		int b=a,flag=0;
		int num=0;
		
		for(int i=9;i>=1;i--) {
			num = num+a%10*i;
			a=a/10;
		}
		
		int y = num % 11;
		
		
		if(y==10) {
			System.out.print("The ISBN-10 number is "+b+"X");
		}
		else {
			y=y+b*10;
			System.out.print("The ISBN-10 number is "+y);
			}
	}
}
