package 第三次作业;
import java.util.Scanner;
public class 三丶15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int lottery = (int)(Math.random()*1000);
        
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter your lottery pick (three digits): ");
			int guess = input.nextInt();
			
			int x1 = lottery/100;
			int x2 = lottery/10%10;
			int x3 = lottery%10;
			int y1 = guess/100;
			int y2 = guess/10%10;
			int y3 = guess%10;
			
			System.out.println("The lottery number is " + lottery);
			
			if(guess==lottery) {
				System.out.println("Exact match: you win $10,000");
			}
			else if(x1==y2&&x2==y1&&x3==y3
					||x1==y2&&x2==y3&&x3==y3
					||x1==y1&&x2==y3&&x3==y2
					||x1==y3&&x2==y1&&x3==y2
					||x1==y3&&x2==y2&&x3==y1){
				System.out.println("Exact match: you win $3,000");
			}
			else if(x1==y1||x1==y2||x1==y3
					||x2==y1||x2==y2||x2==y3
					||x3==y1||x3==y2||x3==y3) {
				System.out.println("Exact match: you win $1,000");
			}
			else {
				System.out.println("Sorry, no match");
			}
		}
	}
}
