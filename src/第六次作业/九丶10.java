package 第六次作业;
import java.util.Scanner;
public class 九丶10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation r = new QuadraticEquation(a,b,c);
        if(r.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
        else if(r.getDiscriminant()==0)
            System.out.println("One root "+r.getRoot1());
        else
            System.out.println("Two roots "+r.getRoot1()+" "+r.getRoot2());
    }
}
class QuadraticEquation{
  	private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a1,double b1,double c1){
        a=a1;
        b=b1;
        c=c1;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-1*b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-1*b-Math.sqrt(b*b-4*a*c))/(2*a);
    }
}