package 第四次作业.第七章两星题;
//7.19 (是否排好序了？）
import java.util.Scanner;

public class checkSort {
    public static void main(String[] args) {
        double[] number = new double[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list:");
        int t=input.nextInt();
        for (int i=0;i<t;++i){
            number[i]=input.nextDouble();
        }
        int p=1;
        for (int i=0;i<t-1;++i){
            if (number[i]>number[i+1])
                p=0;
        }
        if (p==0)
            System.out.println("The list is not sorted");
        else
            System.out.println("The list is already sorted");
    }
}
