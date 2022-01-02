package 第三次作业;
import java.util.Scanner;
public class 三丶27 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a point's x- and y-coordinates: ");
			double x=input.nextDouble();
			double y=input.nextDouble();
			if((x>=0)&&(y>=0)&&(y<=(-0.5)*x+100)) {
				System.out.print("The point is in the triangle");
			}
			else {
				System.out.print("The point is not in the triangle");
			}
		}
	}
}
