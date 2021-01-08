package 第三次作业.第三章两星题;

import java.util.Scanner;

//3.27 (几何：点是否在三角形内？）
public class spotInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x=input.nextDouble();
        double y=input.nextDouble();
        if (x>=0 && y>=0 && y<=100-0.5*x)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");

    }
}
