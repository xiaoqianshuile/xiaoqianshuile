package 第三次作业;
import java.util.Scanner;
public class 五丶17 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stud
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of lines: ");
			int number = input.nextInt();
			
			for(int i = number;i>=1;i--) {
				for(int n = 2*(i-1);n>0;n--) {
					System.out.print(" ");
				}
				for(int j=number-i+1;j>=1;j--) {
					System.out.print(j + " ");
				}
				for(int k=2;k<=number-i+1;k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
	}
}
