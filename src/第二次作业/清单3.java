package 第二次作业;
import java.util.Scanner;
public class 清单3 {
	private static Scanner input;
	public static void main(String[] args) {
		final double PI = 3.14159;
		input = new Scanner(System.in);
			System.out.println("Enter a number for radius: ");
			 double radius = input.nextDouble();
			 double area = radius * radius * PI;
			 System.out.println("The area for the circle of radius " +
			 radius + " is " + area);	
	}
}
