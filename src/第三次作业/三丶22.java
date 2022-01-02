package 第三次作业;
import java.util.Scanner;
public class 三丶22 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a point with two coordinates: ");
			double a=input.nextDouble();
			double b=input.nextDouble();
			
			if(a*a+b*b<=100) {
				System.out.print("Point ("+a+","+b+") is in the circle");
			}
			else {
				System.out.print("Point ("+a+","+b+") is not in the circle");
			}
		}
	}
}
