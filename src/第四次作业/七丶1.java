package 第四次作业;
import java.util.Scanner;
public class 七丶1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between between 1 and 100: ");
		int[] a = new int[101];
		int b;
		for(int i =0;i<101;i++) {
			a[i]=0;
			}
		for(int i =0; ;i++) {
			b=input.nextInt();
			if(b==0)break;
			a[b]+=1;
			}
		
		for(int i =0;i<101;i++) {
			if(a[i]>0) {
			System.out.println(i+" occurs "+a[i]+" times");
			}
	    }
	}
}
