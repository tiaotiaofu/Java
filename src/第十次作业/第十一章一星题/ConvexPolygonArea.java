package 第十次作业.第十一章一星题;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvexPolygonArea {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        n = input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        double[] a = new double[2*n];
        for (int i=0;i<2*n;i++)
            a[i] = input.nextDouble();

        double s=0;
        for (int i=0;i<n;++i){
            if (i==n-1)
                s+=a[2*(n-1)] * a[1] - a[0] * a[2*n-1];
            else{
                s+=a[2*i] * a[2*i+3] - a[2*i+2] * a[2*i+1];
            }

        }
        s = Math.abs(s/2);
        DecimalFormat df =new DecimalFormat("0.000");
        System.out.println("The total area is " + df.format(s));
    }
}
