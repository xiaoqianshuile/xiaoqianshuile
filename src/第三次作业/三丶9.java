package 第三次作业;
import java.util.Scanner;
public class 三丶9 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the first 9 digits of an ISBN: ");
			int x = input.nextInt();
			int y = x;
			int num = 0;
			for(int i = 9;i>=1;i--) {
				num = num + x%10*i;
				x = x/10;
			}
			int z = num%11;
			
			if(z==10) {
				System.out.print("The ISBN-10 number is " + y + 'X');
			}
			else {
				z = y*10+z;
				System.out.print("The ISBN-10 number is " + z);
			}
		}
	}
}
