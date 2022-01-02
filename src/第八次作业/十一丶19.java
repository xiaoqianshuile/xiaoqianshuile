package 第八次作业;
import java.util.ArrayList;
import java.util.Scanner;
public class 十一丶19 {
	public static void main(String[] args) {
		ArrayList<Container> list = new ArrayList<>();
		list.add(new Container());
		System.out.print("Enter the number of the objects: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Enter the weights of the objects: ");
		for (int i = 0; i < num; i++) {
			double n = input.nextDouble();
			boolean in = false;
			for (Container list2 : list) {
				if (list2.w >= n) {
					list2.list.add(n);
					list2.w -= n;
					in = true;
					break;
				}
			}
			if (!in) {
			Container list3 = new Container();
			list3.w -= n;
			list3.list.add(n);
			list.add(list3);
			}
		}
		int index = 1;
		for (Container list4 : list) {
			System.out.print("Container " + index + " contains objects with weight ");
			index++;
			for (double i : list4.list)
				System.out.printf("%.0f ", i);
			System.out.println();
		}
	}
}

class Container{
	public double w = 10;
	public ArrayList<Double> list;
	public Container() {
		list = new ArrayList<>();
	}
}
