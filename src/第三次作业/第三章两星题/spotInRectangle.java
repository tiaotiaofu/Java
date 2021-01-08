package 第三次作业.第三章两星题;
//3.23 (几何：点是否在矩形内？）
import java.util.Scanner;

public class spotInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        if(Math.abs(a)<=5 && Math.abs(b)<=2.5)
            System.out.println("Point ("+a+", "+b+") is in the rectangle");
        else
            System.out.println("Point ("+a+", "+b+") is not in the rectangle");

    }
}
