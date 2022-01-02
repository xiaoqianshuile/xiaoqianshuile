package 第三次作业;
import java.util.Scanner;
public class 三丶29 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter c1's center x1, y1, and r1: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double r1 = input.nextDouble();
			System.out.print("Enter c2's center x2, y2, and r2: ");
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double r2 = input.nextDouble();
			
			if (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2)) {
				System.out.print("c2 is inside c1");
			}
			else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r1+r2) {
				System.out.print("c2 overlaps c1");
			}
			else {
				System.out.print("c2 does not overlap c1");
			}
		}
	}
}
