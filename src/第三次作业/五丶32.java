package 第三次作业;
import java.util.Scanner;
public class 五丶32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = (int)(Math.random()*10+1);
		int c,y,flag1=0,flag2=0,flag3=0;
		for(int i =1;;i++) {
			c = (int)(Math.random()*10+1);
			
			if(c!=b) {	
				y =c;
				break;
			}
		}
		
			if(a==b*10+y)flag1=1;
			else if(a==y*10+b)flag2=1;
			else if((a%10==b)||(a%10==y)||(a/10==b)||(a/10==y))flag3=1;
			
			if(flag1==1) {
				System.out.println("10000");
			}
			else if(flag2==1) {
				System.out.println("3000");
				
			}
			else if(flag3==1) {
				System.out.println("1000");
				
			}
			else {
				System.out.println("0");
			}
	}
}