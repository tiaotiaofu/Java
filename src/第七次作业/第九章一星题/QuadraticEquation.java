package 第七次作业.第九章一星题;
// 9.10 (代數：二次方程式）
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public int getDiscriminant(){
        if (b*b-4*a*c>0)
            return 1;
        else if (b*b-4*a*c==0)
            return 0;
        else return -1;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/2/a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/2/a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation p = new QuadraticEquation(a,b,c);
        if (p.getDiscriminant()==1){
            System.out.println("The equation has two roots "+p.getRoot1()+" and "+p.getRoot2());
        }
        else if (p.getDiscriminant()==0)
            System.out.println("The equation has one root "+p.getRoot1());
        else System.out.println("The equation has no roots.");
    }
}
