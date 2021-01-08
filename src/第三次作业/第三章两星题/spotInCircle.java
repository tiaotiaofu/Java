package 第三次作业.第三章两星题;
//3.22 (几柯：点是否在圓内？）
import java.util.Scanner;

public class spotInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        if(a*a+b*b<=100.0)
            System.out.println("Point ("+a+", "+b+") is in the circle");
        else
            System.out.println("Point ("+a+", "+b+") is not in the circle");
    }
}
