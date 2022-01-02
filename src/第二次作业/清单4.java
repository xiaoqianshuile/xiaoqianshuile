package 第二次作业;
import java.util.Scanner;
public class 清单4 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			double number1 = input.nextDouble();
			double number2 = input.nextDouble();
			double number3 = input.nextDouble();
			double average = (number1 + number2 + number3) / 3;
			System.out.println("The average of " + number1 + " " +number2 +
					" " + number3 + " is " + average);
		}
	}
}
