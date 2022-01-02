package 第三次作业;

public class 五丶27 {
	public static void main(String[] args) {
		int m = 0;
		for(int i = 101;i<=2100;i++) {
			if(((i%4==0)&&(i%100!=0))||(i%400==0)) {
				m+=1;
				System.out.print(i+" ");
			}
			if((m==10)&&(m!=0)) {
				m=0;
				System.out.println();
			}
		}	
	}
}
