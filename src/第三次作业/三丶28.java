package 第三次作业;
import java.util.Scanner;
public class 三丶28 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter r1's center x1, y1, width1, and height1: ");
			double x1=input.nextDouble();
			double y1=input.nextDouble();
			double width1=input.nextDouble();
			double height1=input.nextDouble();
			System.out.print("Enter r2's center x2, y2, width2, and height2: ");
			double x2=input.nextDouble();
			double y2=input.nextDouble();
			double width2=input.nextDouble();
			double height2=input.nextDouble();
			if((x2 + 0.5*width2 <x1 +0.5*width1)&&(x2 -0.5*width2 > x1 -0.5*width1)
					&&(y2 +0.5*height2 <y1 +0.5*height1)&&(y2 -0.5*height2 >y1 -0.5*height1)) {
				System.out.println("r2 is inside r1");
			}
			else if((Math.abs(x2-x1)>0.5*(width1 + width2)) || (Math.abs(y2-y1)>0.5*(height1 + height2))) {
				System.out.println("r2 does not overlap r1");
			}
			else {
				System.out.println("r2 overlaps r1");
			}
		}
	}
}
