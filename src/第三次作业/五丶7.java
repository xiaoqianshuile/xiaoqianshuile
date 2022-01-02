package 第三次作业;

public class 五丶7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n = 1;
            double expense = 10000,sum = 0;
    		while(n<=10) {
    			expense = expense*(1+0.05);
    			n = n+1;
    		}
    		System.out.println("expense = " + expense);
    		while(n>10&&n<=14) {
    			expense = expense * 1.05;
    			sum = sum + expense;
    			n = n+1;
    		}
    		System.out.print("sum = " + sum);
	}
}
