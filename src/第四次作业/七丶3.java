package ���Ĵ���ҵ;
import java.util.Scanner;
public class ��ؼ3 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("ѧ�������� ");
			int n = input.nextInt();
			int temp;
			String str;
			String[] stu = new String[500];
			int[] score = new int[500];
			for(int i = 0;i<n;i++) {
				stu[i]=input.next();
				score[i]=input.nextInt();
			}
			
			for(int i = 0;i<n;i++) {
				int k=i;
				for(int j=i+1;j<n;j++) {
					if(score[j]>score[k])k=j;
				}
				temp=score[i];
				score[i]=score[k];
				score[k]=temp;
				str=stu[i];
				stu[i]=stu[k];
				stu[k]=str;
			}
			for(int i =0;i<n;i++) {
				System.out.print(stu[i]+" ");
				System.out.println(score[i]);
			}
		}
	}
}
