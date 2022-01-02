package 第二次作业;
import java.util.Scanner;
public class 清单5 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer for seconds: ");
			int seconds = input.nextInt();
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			System.out.println(seconds + " seconds is " + minutes +
					" minutes and " + remainingSeconds + " seconds ");
		}
	}
}
