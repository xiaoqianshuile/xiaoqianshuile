package 第三次作业;
import java.util.Scanner;
public class 五丶28 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int y = input.nextInt();
			int d = input.nextInt();
			System.out.print("January 1,"+y+" is ");
			week(d);
			if(((y%4==0)&&(y%100!=0))||(y%400==0)) {
				System.out.print("Febuary 1,"+y+" is ");
				week((31+d)%7);
				System.out.print("March 1,"+y+" is ");
				week((31+29+d)%7);
				System.out.print("April 1,"+y+" is ");
				week((31+29+31+d)%7);
				System.out.print("May 1,"+y+" is ");
				week((31+29+31+30+d)%7);
				System.out.print("June 1,"+y+" is ");
				week((31+29+31+30+31+d)%7);
				System.out.print("July 1,"+y+" is ");
				week((31+29+31+30+31+30+d)%7);
				System.out.print("August 1,"+y+" is ");
				week((31+29+31+30+31+30+31+d)%7);
				System.out.print("September 1,"+y+" is ");
				week((31+29+31+30+31+30+31+31+d)%7);
				System.out.print("October 1,"+y+" is ");
				week((31+29+31+30+31+30+31+31+30+d)%7);
				System.out.print("November 1,"+y+" is ");
				week((31+29+31+30+31+30+31+31+30+31+d)%7);
				System.out.print("December 1,"+y+" is ");
				week((31+29+31+30+31+30+31+31+30+31+30+d)%7);
			}
			else {
				System.out.print("Febuary 1,"+y+" is ");
				week((31+d)%7);
				System.out.print("March 1,"+y+" is ");
				week((31+28+d)%7);
				System.out.print("April 1,"+y+" is ");
				week((31+28+31+d)%7);
				System.out.print("May 1,"+y+" is ");
				week((31+28+31+30+d)%7);
				System.out.print("June 1,"+y+" is ");
				week((31+28+31+30+31+d)%7);
				System.out.print("July 1,"+y+" is ");
				week((31+28+31+30+31+30+d)%7);
				System.out.print("August 1,"+y+" is ");
				week((31+28+31+30+31+30+31+d)%7);
				System.out.print("September 1,"+y+" is ");
				week((31+28+31+30+31+30+31+31+d)%7);
				System.out.print("October 1,"+y+" is ");
				week((31+28+31+30+31+30+31+31+30+d)%7);
				System.out.print("November 1,"+y+" is ");
				week((31+28+31+30+31+30+31+31+30+31+d)%7);
				System.out.print("December 1,"+y+" is ");
				week((31+28+31+30+31+30+31+31+30+31+30+d)%7);
			}
		}
		
	}
	
	static void week(int n) {
		switch(n) {
		case 1:
			System.out.println("Monday");break;
		case 2:
			System.out.println("Tuesday");break;
		case 3:
			System.out.println("Wednesday");break;
		case 4:
			System.out.println("Thursday");break;
		case 5:
			System.out.println("Friday");break;
		case 6:
			System.out.println("Saturday");break;
		case 7:
			System.out.println("Sunday");break;
		case 0:
			System.out.println("Sunday");break;
		}
		
	}
}
