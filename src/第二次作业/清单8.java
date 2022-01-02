package 第二次作业;
import java.util.Scanner;
public class 清单8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.print("Enter purchase amount: ");
					double purchaseAmount = input.nextDouble();
					double tax = purchaseAmount * 0.06;
					System.out.println("Sales tax is $" + (int)(tax*100)/100.0);			
	}
  }
}
