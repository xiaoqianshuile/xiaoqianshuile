package ��������ҵ;
import java.util.Scanner;
public class ��ؼ38 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int x = input.nextInt();
			String a="";
			while(x>0) {
				a = x%8+a;
				x=x/8;
			}
			System.out.print(a);
		}
	}
}
