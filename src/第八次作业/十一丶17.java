package 第八次作业;
import java.util.ArrayList;
import java.util.Scanner;
public class 十一丶17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int m1 = m;
		ArrayList<Integer> list = new ArrayList<>();
		while (m != 1) {
			for (int i = 2; i <= m; i++) {
				if (m % i == 0) {
					list.add(i);
					m /= i;
					break;
				}
			}
		}
		int n = 1;
		int n1 = 1;
		for (int i : list) {
			if (square(list, i) % 2 == 1 && i != n1) {
				n *= i;
				n1 = i;
			}
		}
		System.out.println("The smallest number n for m*n to be a perfect square is " + n);
		System.out.println("m * n is " + m1 * n);
	}
	public static int square(ArrayList<Integer> list, int n) {
		int count = 0;
		for (int i : list) {
			if (i == n)
				count++;
		}
		return count;
	}
}
