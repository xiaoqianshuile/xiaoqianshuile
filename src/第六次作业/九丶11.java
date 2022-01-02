package 第六次作业;
import java.util.Scanner;
public class 九丶11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter a b c d e f: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation r = new LinearEquation(a,b,c,d,e,f);
        if(r.isSolvable())
            System.out.println(r.getX()+" "+r.getY());
        else
            System.out.println("The equation has no solutions.");
   }
}
class LinearEquation{
    private double a,b,c,d,e,f;
    public LinearEquation(double a1,double b1,double c1,double d1,double e1,double f1){
        a=a1;
        b=b1;
        c=c1;
        d=d1;
        e=e1;
        f=f1;
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
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public boolean isSolvable(){
        return a*d-b*c!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}