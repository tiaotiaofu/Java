package 第三次作业.第三章两星题;
//3.28 (几何：两个矩形）
import java.util.Scanner;

public class twoRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates,width, and height: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double width1=input.nextDouble();
        double height1=input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates,width, and height: ");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double width2=input.nextDouble();
        double height2=input.nextDouble();
        if(x1+width1/2.0>=x2+width2/2.0 && x1-width1/2.0<=x2-width2/2.0 && y1+height1/2.0>=y2+height2/2.0 && y1-height1/2.0<=y2-height2/2.0)
            System.out.println("r2 is inside r1");
        else if(x1+width1/2.0<=x2-width2/2.0 || x1-width1/2.0>=x2+width2/2.0 || y1+height1/2.0<=y2-height2/2.0 || y1-height1/2.0>=y2+height2/2.0)
            System.out.println("r2 does not overlap r1");
        else
            System.out.println("r2 overlaps r1");
    }
}
