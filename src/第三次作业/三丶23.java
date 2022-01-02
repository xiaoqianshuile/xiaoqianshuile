package 第三次作业;
import java.util.Scanner;
public class 三丶23 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a point with two coordinates: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			if((Math.abs(a)<=5)&&(Math.abs(b)<=2.5)){
				System.out.print("Point ("+a+","+b+") is in the rectangle");
			}
			else {
				System.out.print("Point ("+a+","+b+") is not in the rectangle");

			}
		}
	}
}
