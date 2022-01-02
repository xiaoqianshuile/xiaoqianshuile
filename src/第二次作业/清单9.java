package 第二次作业;
import java.util.Scanner;
public class 清单9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.print("Enter an amount in double, for example 11.56: ");
					double amount = input.nextDouble();
					int remainingAmount = (int)(amount * 100);
					
					int numberOfDallars = remainingAmount / 100;
					remainingAmount = remainingAmount % 100;
					
					int numberOfQuarters = remainingAmount / 25;
					remainingAmount = remainingAmount % 25;
					
					int numberOfDimes = remainingAmount / 10;
					remainingAmount = remainingAmount % 10;
					
					int numberOfNickels = remainingAmount / 5;
					remainingAmount = remainingAmount % 5;
					
					int numberOfPennies = remainingAmount;
					
					System.out.println("Your amount" + amount + " consists of");
					System.out.println(" " + numberOfDallars + " dollars");
					System.out.println(" " + numberOfQuarters + " quarters");
					System.out.println(" " + numberOfDimes + " dimes");
					System.out.println(" " + numberOfNickels + " nickels");
					System.out.println(" " + numberOfPennies + " pennies");			
	}
  }
}
