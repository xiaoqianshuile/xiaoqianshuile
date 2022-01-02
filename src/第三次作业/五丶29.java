package 第三次作业;
import java.util.Scanner;
public class 五丶29 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int y = input.nextInt();
			int d = input.nextInt();
			String[] str = new String [] {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
			int[] a= {31,28,31,30,31,30,31,31,30,31,30,31};
			int[] b= {31,29,31,30,31,30,31,31,30,31,30,31};
			
			System.out.println("               January "+y);
			System.out.println("  ------------------------------------------");
			System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			for(int i =1;i<=d;i++) {
				System.out.print("      ");
			}
			for(int i = 1;i<=31;i++) {
				System.out.printf("%6d",i);
				if((i+d)%7==0) {
					System.out.println();
				}
			}
			System.out.println();
			if(((y%4==0)&&(y%100!=0))||(y%400==0)) {
				for(int j = 2;j<=12;j++) {
					d=(d+b[j-2])%7;
					System.out.println("               "+str[j-1]+" "+y);
					System.out.println("  ------------------------------------------");
					System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
					for(int i =1;i<=d;i++) {
						System.out.print("      ");
					}
					for(int i = 1;i<=31;i++) {
						System.out.printf("%6d",i);
						if((i+d)%7==0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			}
			else {
				for(int j = 2;j<=12;j++) {
					d=(d+a[j-2])%7;
					System.out.println("               "+str[j-1]+" "+y);
					System.out.println("  ------------------------------------------");
					System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat");
					for(int i =1;i<=d;i++) {
						System.out.print("      ");
					}
					for(int i = 1;i<=31;i++) {
						System.out.printf("%6d",i);
						if((i+d)%7==0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			}
		}
	}
}
