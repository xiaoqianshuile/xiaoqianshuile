package 第三次作业;
import java.util.Scanner;
public class 三丶24 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		}
		int a = (int)(Math.random()*13+1);
		int b = (int)(Math.random()*4);
		System.out.print("The card you picked is ");
		if(a==1)System.out.print("Ace ");
		else if(a==11)System.out.print("Jack ");
		else if(a==12)System.out.print("Queen ");
		else if(a==13)System.out.print("King");
		else System.out.print(a+" ");
		
		if(b==0)System.out.print("of Clubs");
		else if(b==1)System.out.print("of Diamonds");
		else if(b==2)System.out.print("of Hearts");
		else System.out.print("of Spades");
	}
}
